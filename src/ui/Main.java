package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	private MainMenuController control;
	public Main() {
		control = new MainMenuController();
	}

	 @Override
	    public void start(Stage stage) throws Exception{
	    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
			fxmlLoader.setController(control);
			Parent root = fxmlLoader.load();
			Image icon = new Image("/img/Imagen.jpg");
			stage.getIcons().add(icon);
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("CYK");
			stage.setResizable(false);
			// primaryStage.initStyle(StageStyle.UNDECORATED);
			stage.show();
	    }


    public static void main(String[] args) {
        launch(args);
    }
}
