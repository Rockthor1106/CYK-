/*
 * generated by Xtext 2.26.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGNFC
entryRuleGNFC
:
{ before(grammarAccess.getGNFCRule()); }
	 ruleGNFC
{ after(grammarAccess.getGNFCRule()); } 
	 EOF 
;

// Rule GNFC
ruleGNFC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGNFCAccess().getGroup()); }
		(rule__GNFC__Group__0)
		{ after(grammarAccess.getGNFCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInitial
entryRuleInitial
:
{ before(grammarAccess.getInitialRule()); }
	 ruleInitial
{ after(grammarAccess.getInitialRule()); } 
	 EOF 
;

// Rule Initial
ruleInitial 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInitialAccess().getGroup()); }
		(rule__Initial__Group__0)
		{ after(grammarAccess.getInitialAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProduction
entryRuleProduction
:
{ before(grammarAccess.getProductionRule()); }
	 ruleProduction
{ after(grammarAccess.getProductionRule()); } 
	 EOF 
;

// Rule Production
ruleProduction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProductionAccess().getGroup()); }
		(rule__Production__Group__0)
		{ after(grammarAccess.getProductionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRigth
entryRuleRigth
:
{ before(grammarAccess.getRigthRule()); }
	 ruleRigth
{ after(grammarAccess.getRigthRule()); } 
	 EOF 
;

// Rule Rigth
ruleRigth 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRigthAccess().getAlternatives()); }
		(rule__Rigth__Alternatives)
		{ after(grammarAccess.getRigthAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSimple
entryRuleSimple
:
{ before(grammarAccess.getSimpleRule()); }
	 ruleSimple
{ after(grammarAccess.getSimpleRule()); } 
	 EOF 
;

// Rule Simple
ruleSimple 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSimpleAccess().getGroup()); }
		(rule__Simple__Group__0)
		{ after(grammarAccess.getSimpleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNonTerminal
entryRuleNonTerminal
:
{ before(grammarAccess.getNonTerminalRule()); }
	 ruleNonTerminal
{ after(grammarAccess.getNonTerminalRule()); } 
	 EOF 
;

// Rule NonTerminal
ruleNonTerminal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonTerminalAccess().getGroup()); }
		(rule__NonTerminal__Group__0)
		{ after(grammarAccess.getNonTerminalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBinary
entryRuleBinary
:
{ before(grammarAccess.getBinaryRule()); }
	 ruleBinary
{ after(grammarAccess.getBinaryRule()); } 
	 EOF 
;

// Rule Binary
ruleBinary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBinaryAccess().getGroup()); }
		(rule__Binary__Group__0)
		{ after(grammarAccess.getBinaryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rigth__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRigthAccess().getSimpleAssignment_0()); }
		(rule__Rigth__SimpleAssignment_0)
		{ after(grammarAccess.getRigthAccess().getSimpleAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getRigthAccess().getBinaryAssignment_1()); }
		(rule__Rigth__BinaryAssignment_1)
		{ after(grammarAccess.getRigthAccess().getBinaryAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__AlphaAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0()); }
		'a'
		{ after(grammarAccess.getSimpleAccess().getAlphaAKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1()); }
		'b'
		{ after(grammarAccess.getSimpleAccess().getAlphaBKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2()); }
		'c'
		{ after(grammarAccess.getSimpleAccess().getAlphaCKeyword_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3()); }
		'd'
		{ after(grammarAccess.getSimpleAccess().getAlphaDKeyword_1_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4()); }
		'e'
		{ after(grammarAccess.getSimpleAccess().getAlphaEKeyword_1_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5()); }
		'f'
		{ after(grammarAccess.getSimpleAccess().getAlphaFKeyword_1_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6()); }
		'g'
		{ after(grammarAccess.getSimpleAccess().getAlphaGKeyword_1_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7()); }
		'h'
		{ after(grammarAccess.getSimpleAccess().getAlphaHKeyword_1_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8()); }
		'i'
		{ after(grammarAccess.getSimpleAccess().getAlphaIKeyword_1_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9()); }
		'j'
		{ after(grammarAccess.getSimpleAccess().getAlphaJKeyword_1_0_9()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10()); }
		'k'
		{ after(grammarAccess.getSimpleAccess().getAlphaKKeyword_1_0_10()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11()); }
		'l'
		{ after(grammarAccess.getSimpleAccess().getAlphaLKeyword_1_0_11()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12()); }
		'm'
		{ after(grammarAccess.getSimpleAccess().getAlphaMKeyword_1_0_12()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13()); }
		'n'
		{ after(grammarAccess.getSimpleAccess().getAlphaNKeyword_1_0_13()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14()); }
		'o'
		{ after(grammarAccess.getSimpleAccess().getAlphaOKeyword_1_0_14()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15()); }
		'p'
		{ after(grammarAccess.getSimpleAccess().getAlphaPKeyword_1_0_15()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16()); }
		'q'
		{ after(grammarAccess.getSimpleAccess().getAlphaQKeyword_1_0_16()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17()); }
		'r'
		{ after(grammarAccess.getSimpleAccess().getAlphaRKeyword_1_0_17()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18()); }
		's'
		{ after(grammarAccess.getSimpleAccess().getAlphaSKeyword_1_0_18()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19()); }
		't'
		{ after(grammarAccess.getSimpleAccess().getAlphaTKeyword_1_0_19()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20()); }
		'v'
		{ after(grammarAccess.getSimpleAccess().getAlphaVKeyword_1_0_20()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21()); }
		'w'
		{ after(grammarAccess.getSimpleAccess().getAlphaWKeyword_1_0_21()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22()); }
		'x'
		{ after(grammarAccess.getSimpleAccess().getAlphaXKeyword_1_0_22()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23()); }
		'y'
		{ after(grammarAccess.getSimpleAccess().getAlphaYKeyword_1_0_23()); }
	)
	|
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24()); }
		'z'
		{ after(grammarAccess.getSimpleAccess().getAlphaZKeyword_1_0_24()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__VarAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0()); }
		'A'
		{ after(grammarAccess.getNonTerminalAccess().getVarAKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1()); }
		'B'
		{ after(grammarAccess.getNonTerminalAccess().getVarBKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2()); }
		'C'
		{ after(grammarAccess.getNonTerminalAccess().getVarCKeyword_1_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3()); }
		'D'
		{ after(grammarAccess.getNonTerminalAccess().getVarDKeyword_1_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4()); }
		'E'
		{ after(grammarAccess.getNonTerminalAccess().getVarEKeyword_1_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5()); }
		'F'
		{ after(grammarAccess.getNonTerminalAccess().getVarFKeyword_1_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6()); }
		'G'
		{ after(grammarAccess.getNonTerminalAccess().getVarGKeyword_1_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7()); }
		'H'
		{ after(grammarAccess.getNonTerminalAccess().getVarHKeyword_1_0_7()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8()); }
		'I'
		{ after(grammarAccess.getNonTerminalAccess().getVarIKeyword_1_0_8()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9()); }
		'J'
		{ after(grammarAccess.getNonTerminalAccess().getVarJKeyword_1_0_9()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10()); }
		'K'
		{ after(grammarAccess.getNonTerminalAccess().getVarKKeyword_1_0_10()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11()); }
		'L'
		{ after(grammarAccess.getNonTerminalAccess().getVarLKeyword_1_0_11()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12()); }
		'M'
		{ after(grammarAccess.getNonTerminalAccess().getVarMKeyword_1_0_12()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13()); }
		'N'
		{ after(grammarAccess.getNonTerminalAccess().getVarNKeyword_1_0_13()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14()); }
		'O'
		{ after(grammarAccess.getNonTerminalAccess().getVarOKeyword_1_0_14()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15()); }
		'P'
		{ after(grammarAccess.getNonTerminalAccess().getVarPKeyword_1_0_15()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16()); }
		'Q'
		{ after(grammarAccess.getNonTerminalAccess().getVarQKeyword_1_0_16()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17()); }
		'R'
		{ after(grammarAccess.getNonTerminalAccess().getVarRKeyword_1_0_17()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18()); }
		'T'
		{ after(grammarAccess.getNonTerminalAccess().getVarTKeyword_1_0_18()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19()); }
		'U'
		{ after(grammarAccess.getNonTerminalAccess().getVarUKeyword_1_0_19()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20()); }
		'V'
		{ after(grammarAccess.getNonTerminalAccess().getVarVKeyword_1_0_20()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21()); }
		'W'
		{ after(grammarAccess.getNonTerminalAccess().getVarWKeyword_1_0_21()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22()); }
		'X'
		{ after(grammarAccess.getNonTerminalAccess().getVarXKeyword_1_0_22()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23()); }
		'Y'
		{ after(grammarAccess.getNonTerminalAccess().getVarYKeyword_1_0_23()); }
	)
	|
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24()); }
		'Z'
		{ after(grammarAccess.getNonTerminalAccess().getVarZKeyword_1_0_24()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GNFC__Group__0__Impl
	rule__GNFC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGNFCAccess().getWAssignment_0()); }
	(rule__GNFC__WAssignment_0)
	{ after(grammarAccess.getGNFCAccess().getWAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GNFC__Group__1__Impl
	rule__GNFC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGNFCAccess().getWAssignment_1()); }
	(rule__GNFC__WAssignment_1)*
	{ after(grammarAccess.getGNFCAccess().getWAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GNFC__Group__2__Impl
	rule__GNFC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGNFCAccess().getInitAssignment_2()); }
	(rule__GNFC__InitAssignment_2)
	{ after(grammarAccess.getGNFCAccess().getInitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GNFC__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGNFCAccess().getProductionsAssignment_3()); }
	(rule__GNFC__ProductionsAssignment_3)*
	{ after(grammarAccess.getGNFCAccess().getProductionsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Initial__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initial__Group__0__Impl
	rule__Initial__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialAccess().getLeftAssignment_0()); }
	(rule__Initial__LeftAssignment_0)
	{ after(grammarAccess.getInitialAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initial__Group__1__Impl
	rule__Initial__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
	'->'
	{ after(grammarAccess.getInitialAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initial__Group__2__Impl
	rule__Initial__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialAccess().getRigthAssignment_2()); }
	(rule__Initial__RigthAssignment_2)
	{ after(grammarAccess.getInitialAccess().getRigthAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initial__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialAccess().getGroup_3()); }
	(rule__Initial__Group_3__0)*
	{ after(grammarAccess.getInitialAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Initial__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initial__Group_3__0__Impl
	rule__Initial__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); }
		('|')
		{ after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); }
	)
	(
		{ before(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); }
		('|')*
		{ after(grammarAccess.getInitialAccess().getVerticalLineKeyword_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Initial__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInitialAccess().getRigthAssignment_3_1()); }
	(rule__Initial__RigthAssignment_3_1)
	{ after(grammarAccess.getInitialAccess().getRigthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Production__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__0__Impl
	rule__Production__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getLeftAssignment_0()); }
	(rule__Production__LeftAssignment_0)
	{ after(grammarAccess.getProductionAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__1__Impl
	rule__Production__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
	'->'
	{ after(grammarAccess.getProductionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__2__Impl
	rule__Production__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getRigthAssignment_2()); }
	(rule__Production__RigthAssignment_2)
	{ after(grammarAccess.getProductionAccess().getRigthAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getGroup_3()); }
	(rule__Production__Group_3__0)*
	{ after(grammarAccess.getProductionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Production__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group_3__0__Impl
	rule__Production__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
		('|')
		{ after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
	)
	(
		{ before(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
		('|')*
		{ after(grammarAccess.getProductionAccess().getVerticalLineKeyword_3_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Production__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProductionAccess().getRigthAssignment_3_1()); }
	(rule__Production__RigthAssignment_3_1)
	{ after(grammarAccess.getProductionAccess().getRigthAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Simple__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__0__Impl
	rule__Simple__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getSimpleAction_0()); }
	()
	{ after(grammarAccess.getSimpleAccess().getSimpleAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Simple__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSimpleAccess().getAlphaAssignment_1()); }
	(rule__Simple__AlphaAssignment_1)
	{ after(grammarAccess.getSimpleAccess().getAlphaAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonTerminal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonTerminal__Group__0__Impl
	rule__NonTerminal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); }
	()
	{ after(grammarAccess.getNonTerminalAccess().getNonTerminalAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonTerminal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonTerminalAccess().getVarAssignment_1()); }
	(rule__NonTerminal__VarAssignment_1)
	{ after(grammarAccess.getNonTerminalAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Binary__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group__0__Impl
	rule__Binary__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getBinaryAction_0()); }
	()
	{ after(grammarAccess.getBinaryAccess().getBinaryAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getGroup_1()); }
	(rule__Binary__Group_1__0)
	{ after(grammarAccess.getBinaryAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Binary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group_1__0__Impl
	rule__Binary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); }
	(rule__Binary__FirstAssignment_1_0)
	{ after(grammarAccess.getBinaryAccess().getFirstAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Binary__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); }
	(rule__Binary__SecondAssignment_1_1)
	{ after(grammarAccess.getBinaryAccess().getSecondAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GNFC__WAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_0_0()); }
		ruleSimple
		{ after(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__WAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_1_0()); }
		ruleSimple
		{ after(grammarAccess.getGNFCAccess().getWSimpleParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__InitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_2_0()); }
		ruleInitial
		{ after(grammarAccess.getGNFCAccess().getInitInitialParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GNFC__ProductionsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_3_0()); }
		ruleProduction
		{ after(grammarAccess.getGNFCAccess().getProductionsProductionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); }
		(
			{ before(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); }
			'S'
			{ after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); }
		)
		{ after(grammarAccess.getInitialAccess().getLeftSKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__RigthAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0()); }
		ruleRigth
		{ after(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Initial__RigthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0()); }
		ruleRigth
		{ after(grammarAccess.getInitialAccess().getRigthRigthParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); }
		ruleNonTerminal
		{ after(grammarAccess.getProductionAccess().getLeftNonTerminalParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__RigthAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0()); }
		ruleRigth
		{ after(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Production__RigthAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0()); }
		ruleRigth
		{ after(grammarAccess.getProductionAccess().getRigthRigthParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rigth__SimpleAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0()); }
		ruleSimple
		{ after(grammarAccess.getRigthAccess().getSimpleSimpleParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Rigth__BinaryAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0()); }
		ruleBinary
		{ after(grammarAccess.getRigthAccess().getBinaryBinaryParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Simple__AlphaAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSimpleAccess().getAlphaAlternatives_1_0()); }
		(rule__Simple__AlphaAlternatives_1_0)
		{ after(grammarAccess.getSimpleAccess().getAlphaAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonTerminal__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonTerminalAccess().getVarAlternatives_1_0()); }
		(rule__NonTerminal__VarAlternatives_1_0)
		{ after(grammarAccess.getNonTerminalAccess().getVarAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__FirstAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); }
		ruleNonTerminal
		{ after(grammarAccess.getBinaryAccess().getFirstNonTerminalParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Binary__SecondAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); }
		ruleNonTerminal
		{ after(grammarAccess.getBinaryAccess().getSecondNonTerminalParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
