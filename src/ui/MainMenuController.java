package ui;

import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import customException.GrammarNotFoundException;
import customException.TextStringNotEnteredException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
import model.CYK;

public class MainMenuController {

    public static final String LAMBDA_CHARACTER = "λ";
    
    private CYK CYK;
    
    @FXML
    private JFXTabPane tabPane;

    @FXML
    private JFXTextField textString_TxtField;

    @FXML
    private Tab editor_Tab;

   @FXML
    private Tab CYK_Tab;

    @FXML
    private VBox GrammarPanel_VBox;

    @FXML
    private VBox CYKPanel_VBox;

    @FXML
    private HBox buttonsPanel_HBox;
    
    private double auxMaxWidth = 0; //it helps to set the dimensions of each cell at moment when the matrix is printed


    @FXML
    void initialize() {
        editor_Tab.setOnSelectionChanged( event -> buttonsPanel_HBox.setVisible(true));
        CYK_Tab.setOnSelectionChanged( event -> buttonsPanel_HBox.setVisible(false));

        addRow();
    }

    
   
    @FXML
    void newRow(ActionEvent event) {
    	addRow();
    }
    
    
   
    @FXML
    void textString(ActionEvent event) {
        TextInputDialog tid = new TextInputDialog();
        tid.setHeaderText(null);
        tid.setTitle("Insertar");
        tid.setContentText("Introduzca una cadena");
        Optional<String> string = tid.showAndWait();

        try{
            if(!string.get().isEmpty()){
                textString_TxtField.setText(string.get());
                textString_TxtField.setBackground(new Background(new BackgroundFill(Color.rgb(0, 196, 167), CornerRadii.EMPTY, Insets.EMPTY)));
                textString_TxtField .setStyle("-fx-text-fill: white; -fx-font-size: 14px; -fx-background-color : 00C4A7;");
            }

        }catch (NoSuchElementException e){

        }
    }
    
    
    @FXML
    void cleanAll(ActionEvent event) {
        GrammarPanel_VBox.getChildren().clear();
        CYKPanel_VBox.getChildren().clear();
        
        textString_TxtField.setText("");
        this.CYK = null;
        
        addRow();
        CYK_Tab.setDisable(true);
    }
    
    
  
    @FXML
    void runCYKClicked() {
    	try {
    		checkGrammar();
    		checkTextString();
    		
        	CYKPanel_VBox.getChildren().clear();
        	
            this.CYK = new CYK(convertGrammarToMatrix(), textString_TxtField.getText().length());
            this.CYK.addValueToMap();
            this.CYK.addTofirstColumn(textString_TxtField.getText());
            this.CYK.calculateCYK(textString_TxtField.getText());
            
            showMessage();
            generateMatrix(this.CYK.getMatrixResult());
            
        	CYK_Tab.setDisable(false);
            tabPane.getSelectionModel().select(CYK_Tab);
            
    	}catch (TextStringNotEnteredException textString) {
    		textString.message();
		}catch (GrammarNotFoundException grammar) {
			grammar.message();
		}
    	
    }
    
    
   
    private void addRow(){
    	
        HBox hBox = new HBox();
       GrammarPanel_VBox.getChildren().add(hBox);

        hBox.prefWidth(685d);
        hBox.prefHeight(50d);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(3d);

        JFXTextField textField1 = new JFXTextField();
        hBox.getChildren().add(textField1);
        textField1.setPrefSize(80d, 30d);
       
        textField1.setAlignment(Pos.CENTER);
        textField1.setFocusColor(Color.rgb(0, 196, 167));
        
        textField1.setUnFocusColor(Color.WHITE);
        textField1.setBackground(new Background(new BackgroundFill(Color.rgb(0, 196, 167), CornerRadii.EMPTY, Insets.EMPTY)));
        textField1.setStyle("-fx-text-inner-color: white");
        textField1.setFont(Font.font("System", FontWeight.BOLD, 14d));

        JFXTextField textField2 = new JFXTextField();
        hBox.getChildren().add(textField2);
        textField2.setPrefSize(80d, 30d);
        textField2.setAlignment(Pos.CENTER);
        textField2.setFocusColor(Color.WHITE);
        textField2.setUnFocusColor(Color.WHITE);
        textField2.setBackground(new Background(new BackgroundFill(Color.rgb(0, 196, 167), CornerRadii.EMPTY, Insets.EMPTY)));
        textField2.setFont(Font.font("System", FontWeight.BOLD, 14d));
        textField2.setStyle("-fx-text-inner-color: white");
        textField2.setText("----->");
        textField2.setEditable(false);

        JFXTextField textField3 = new JFXTextField();
        hBox.getChildren().add(textField3);
        textField3.setPrefSize(505d, 30d);
        textField3.setAlignment(Pos.CENTER_LEFT);
        textField3.setFocusColor(Color.rgb(0, 196, 167));
        textField3.setUnFocusColor(Color.WHITE);
        textField3.setBackground(new Background(new BackgroundFill(Color.rgb(0, 196, 167), CornerRadii.EMPTY, Insets.EMPTY)));
        textField3.setStyle("-fx-text-inner-color: white");
        textField3.setFont(Font.font("System", FontWeight.BOLD, 14d));
        textField3.setOnKeyPressed(event -> {
            if(event.getCode()== KeyCode.ENTER ){
                textField3.setText(textField3.getText() + LAMBDA_CHARACTER);
            }
        });
    }
    
    
    
    private String[][] convertGrammarToMatrix() {
    	String[][] grammar = new String[GrammarPanel_VBox.getChildren().size()][2];
    	
    	for (int i = 0; i < GrammarPanel_VBox.getChildren().size(); i++) {
			HBox hBox = (HBox) GrammarPanel_VBox.getChildren().get(i);
			
			JFXTextField textField1 = (JFXTextField) hBox.getChildren().get(0);
			JFXTextField textField2 = (JFXTextField) hBox.getChildren().get(2);
			
			grammar[i][0] = textField1.getText();
			grammar[i][1] = textField2.getText();
		}
    	return grammar;
    }
    
  
    private void printMatrix(VBox vBox) {
    	GridPane gridPane = new GridPane();
    	String[][] matrixResult = this.CYK.getMatrixResult();
    	
    	gridPane.setHgap(3);
    	gridPane.setVgap(3);
    	gridPane.setAlignment(Pos.CENTER);
    	
    	
    	for (int i = 0; i < matrixResult.length; i++) {
    		
    		Label label = new Label("i= " + (i+1));
    		label.setAlignment(Pos.CENTER);
    		label.setPrefHeight(30);
    		label.setPrefWidth(40);
    		gridPane.add(label, 0, (i+1));
    		
			for (int j = 0; j < matrixResult[0].length; j++) {
				
				Label label2 = new Label();
				label2.setAlignment(Pos.CENTER);
				label2.setPrefHeight(30);
				label2.setPrefWidth(40);
				label2.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
				
				if(matrixResult[i][j] != null) {
					label2.setText("{" + matrixResult[i][j] + "}");
				}else {
					label2.setText("");
				}
				gridPane.add(label2, (j+1), (i+1));
			}
		}
    	vBox.getChildren().add(gridPane);
    	this.CYKPanel_VBox.getChildren().add(vBox);
    }
    
    
   
    private void generateMatrix(String[][] matrixResult) {
    	
    	ArrayList<Label> auxLabels = new ArrayList<>();
    	
    	for (int i = 0; i < matrixResult.length; i++) {
			for (int j = 0; j < matrixResult.length; j++) {
				Label toCatchSize = new Label();
				toCatchSize.setMinHeight(30);
				toCatchSize.setMinWidth(40);
				if(matrixResult[i][j] != null) {
					toCatchSize.setText("{" + matrixResult[i][j] + "}");
					auxLabels.add(toCatchSize);
				}
			}
		}
    	
    	for (int i = 0; i < auxLabels.size()-1; i++) {
			if (auxLabels.get(i).getText().length() < auxLabels.get(i+1).getText().length()) {
				auxMaxWidth = auxLabels.get(i+1).getText().length() * (auxLabels.get(i+1).getText().length() * 2);
			}
			else if (auxLabels.get(i).getText().length() > auxLabels.get(i+1).getText().length()) {
				auxMaxWidth = auxLabels.get(i).getText().length() * (auxLabels.get(i+1).getText().length() * 2);
			}
		}
    	
    	HBox hBox = new HBox();
    	VBox vBox = new VBox();
    	
    	hBox.setSpacing(3d);
    	hBox.setAlignment(Pos.CENTER);
    	vBox.getChildren().add(hBox);
    	
    	Label label = new Label();
    	label.setPrefHeight(30);
		label.setPrefWidth(40);
		hBox.getChildren().add(label);
    	
    	for (int i = 0; i < textString_TxtField.getText().length(); i++) {
    		Label label2 = new Label();
    		label2.setAlignment(Pos.CENTER);
    		label2.setPrefHeight(30);
    		label2.setPrefWidth(40);
			
    		label2.setText("j= " + (i+1));
			hBox.getChildren().add(label2);
		}
    	printMatrix(vBox);
    }
    
    
    
    private void showMessage() {
    	
    	JFXTextField textField = new JFXTextField();
    	CYKPanel_VBox.getChildren().add(textField);
    	
    	textField.setAlignment(Pos.CENTER);
    	textField.setEditable(false);
    	textField.setPrefSize(698, 30d);
    	
    	textField.setBorder(new Border(new BorderStroke(Color.rgb(0, 196, 167), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    	textField.setFont(Font.font("System", FontWeight.BOLD, 14));
    	textField.setFocusColor(Color.rgb(0, 196, 167));
    	textField.setUnFocusColor(Color.rgb(0, 196, 167));
    	if(this.CYK.containsString()) {
    		textField.setText("La cadena ingresada es generada");
    		textField.setBackground(new Background(new BackgroundFill(Color.valueOf("#00C4A7"), CornerRadii.EMPTY, Insets.EMPTY)));
    		
    	}else {
    		textField.setText("La cadena ingresada no es generada");
    		textField.setBackground(new Background(new BackgroundFill(Color.valueOf("#00C4A7"), CornerRadii.EMPTY, Insets.EMPTY)));
    	}
    }
    
    
    
    private void checkTextString() throws TextStringNotEnteredException{
    	if(textString_TxtField.getText().isEmpty()) {
    		throw new TextStringNotEnteredException();
    	}
    }
    

    private void checkGrammar() throws GrammarNotFoundException{
    	
    	for (int i = 0; i < GrammarPanel_VBox.getChildren().size(); i++) {
    		
			HBox hBox = (HBox) GrammarPanel_VBox.getChildren().get(i);
			
			JFXTextField textField1 = (JFXTextField) hBox.getChildren().get(0);
			JFXTextField textField2 = (JFXTextField) hBox.getChildren().get(2);
			
			if(textField1.getText().equals("") || textField2.getText().equals("")) {
				throw new GrammarNotFoundException();
			}
		}
    }
}
