/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Binary;
import org.xtext.example.mydsl.myDsl.GNFC;
import org.xtext.example.mydsl.myDsl.Initial;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NonTerminal;
import org.xtext.example.mydsl.myDsl.Production;
import org.xtext.example.mydsl.myDsl.Rigth;
import org.xtext.example.mydsl.myDsl.Simple;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.BINARY:
				sequence_Binary(context, (Binary) semanticObject); 
				return; 
			case MyDslPackage.GNFC:
				sequence_GNFC(context, (GNFC) semanticObject); 
				return; 
			case MyDslPackage.INITIAL:
				sequence_Initial(context, (Initial) semanticObject); 
				return; 
			case MyDslPackage.NON_TERMINAL:
				sequence_NonTerminal(context, (NonTerminal) semanticObject); 
				return; 
			case MyDslPackage.PRODUCTION:
				sequence_Production(context, (Production) semanticObject); 
				return; 
			case MyDslPackage.RIGTH:
				sequence_Rigth(context, (Rigth) semanticObject); 
				return; 
			case MyDslPackage.SIMPLE:
				sequence_Simple(context, (Simple) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Binary returns Binary
	 *
	 * Constraint:
	 *     (first=NonTerminal second=NonTerminal)
	 * </pre>
	 */
	protected void sequence_Binary(ISerializationContext context, Binary semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BINARY__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BINARY__FIRST));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BINARY__SECOND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BINARY__SECOND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0(), semanticObject.getFirst());
		feeder.accept(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0(), semanticObject.getSecond());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GNFC returns GNFC
	 *
	 * Constraint:
	 *     (w+=Simple w+=Simple* init=Initial productions+=Production*)
	 * </pre>
	 */
	protected void sequence_GNFC(ISerializationContext context, GNFC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Initial returns Initial
	 *
	 * Constraint:
	 *     (left='S' rigth+=Rigth rigth+=Rigth*)
	 * </pre>
	 */
	protected void sequence_Initial(ISerializationContext context, Initial semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     NonTerminal returns NonTerminal
	 *
	 * Constraint:
	 *     (
	 *         var='A' | 
	 *         var='B' | 
	 *         var='C' | 
	 *         var='D' | 
	 *         var='E' | 
	 *         var='F' | 
	 *         var='G' | 
	 *         var='H' | 
	 *         var='I' | 
	 *         var='J' | 
	 *         var='K' | 
	 *         var='L' | 
	 *         var='M' | 
	 *         var='N' | 
	 *         var='O' | 
	 *         var='P' | 
	 *         var='Q' | 
	 *         var='R' | 
	 *         var='T' | 
	 *         var='U' | 
	 *         var='V' | 
	 *         var='W' | 
	 *         var='X' | 
	 *         var='Y' | 
	 *         var='Z'
	 *     )
	 * </pre>
	 */
	protected void sequence_NonTerminal(ISerializationContext context, NonTerminal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Production returns Production
	 *
	 * Constraint:
	 *     (left=NonTerminal rigth+=Rigth rigth+=Rigth*)
	 * </pre>
	 */
	protected void sequence_Production(ISerializationContext context, Production semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Rigth returns Rigth
	 *
	 * Constraint:
	 *     (simple=Simple | binary=Binary)
	 * </pre>
	 */
	protected void sequence_Rigth(ISerializationContext context, Rigth semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Simple returns Simple
	 *
	 * Constraint:
	 *     (
	 *         alpha='a' | 
	 *         alpha='b' | 
	 *         alpha='c' | 
	 *         alpha='d' | 
	 *         alpha='e' | 
	 *         alpha='f' | 
	 *         alpha='g' | 
	 *         alpha='h' | 
	 *         alpha='i' | 
	 *         alpha='j' | 
	 *         alpha='k' | 
	 *         alpha='l' | 
	 *         alpha='m' | 
	 *         alpha='n' | 
	 *         alpha='o' | 
	 *         alpha='p' | 
	 *         alpha='q' | 
	 *         alpha='r' | 
	 *         alpha='s' | 
	 *         alpha='t' | 
	 *         alpha='v' | 
	 *         alpha='w' | 
	 *         alpha='x' | 
	 *         alpha='y' | 
	 *         alpha='z'
	 *     )
	 * </pre>
	 */
	protected void sequence_Simple(ISerializationContext context, Simple semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
