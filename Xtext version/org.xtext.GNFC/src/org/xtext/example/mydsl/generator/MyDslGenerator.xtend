/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.myDsl.GNFC

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val grammar= resource.contents.head as GNFC
		
		fsa.generateFile('GrammarResult.txt', printResult(grammar))
	}
	
	def getString(GNFC grammar) {
		var string = ""
		
		for(terminal : grammar.w) {
			string += terminal.^alpha
			string += ""
		}
		
		string //This will be returned 
	}
	
	def Variables(GNFC grammar) {
		var variables = newArrayList()
		
//		var string = ""
		
		
//		string += grammar.init.left
		variables.add(grammar.init.left)
		
		for(production : grammar.productions) {
//			string += production.left.^var
//			string += ""
			variables.add(production.left.^var)
		} 
//		string += variables.size
		
		variables //This will be returned 
	}
	
	def Productions(GNFC grammar) {
		var productions = newArrayList()
		
		var string = ""
		var  i = 1 //It is useful to avoid a | at the end of the productions line
		for(rigth : grammar.init.rigth) {
			if(rigth.simple !== null) {
				string += rigth.simple.^alpha
				if(i != grammar.init.rigth.size) {
					string += "|"
				}
				
			}
			else if(rigth.binary !== null) {
				string += rigth.binary.^first.^var
				string += rigth.binary.^second.^var
				if(i != grammar.init.rigth.size) {
					string += "|"
				}
			}
			i++
		}
		productions.add(string)
		
		var j = 1
		
		for(production : grammar.productions){
			var string2 = ""
			for(rigth : production.rigth) {
				if(rigth.simple !== null) {
					string2 += rigth.simple.^alpha
					if(j != production.rigth.size) {
						string2 += "|"
					}
				}
				else if(rigth.binary !== null) {
					string2 += rigth.binary.^first.^var
					string2 += rigth.binary.^second.^var
					if(j != production.rigth.size) {
						string2 += "|"
					}
				}
				j++
			}
			j = 1
			productions.add(string2)
		}
		productions //This will be returned 
	}
	
	
	def message(CYK cyk) {
		var message = ""
		if(cyk.containsString) {
			message += "\n"
			message += "La cadena ingresada es generada"
			message += "\n\n"
		}
		else {
			message += "\n"
			message += "La cadena ingresada no es generada"
			message += "\n\n"
		}
		message
	}
	
	def jIndexes(int columns, int maxWidth, int toFit) {
		var jIndexes = ""
		
		for(space : 0 .. toFit) {
			jIndexes += " "
		}
		jIndexes +=" "
		
		var i = 2
		for(e : 0 .. columns-1) {
			var blankLeft = " "
			var blankRight = ""
			i++
			for(index : 0 .. i) {
				blankRight += " "
			}
			
			if(e == 0) {
				jIndexes += blankLeft + "j=" + e + blankRight
			}
			else {
				jIndexes += "j=" + e + blankRight
			}
			i = 2
		}
		jIndexes += "\n"
		
		jIndexes
	}
	
	def executeCYK(GNFC grammar){
		var cyk = new CYK(new CYK().convertToMatrix(Variables(grammar),Productions(grammar)), getString(grammar).length)
		cyk.addValueToMap
		cyk.addTofirstColumn(getString(grammar))
		cyk.calculateCYK(getString(grammar))
		
		var list = newArrayList()
		var maxWidth = 0
		var result = ""
		var aux = ""
		
		result += message(cyk)
		
		for(row : 0 .. getString(grammar).length-1) {
			for(column : 0 .. getString(grammar).length-1) {
				if(cyk.getMatrixResult.get(row).get(column) !== null) {
					aux = "{"+ cyk.getMatrixResult.get(row).get(column) +"}"
					list.add(aux.length)
				}
			}
		}
		
		list.sort //Sort the list with the lengths of the string within the matrixResult from the lowest to the highest 
		maxWidth = list.get(list.size-1) //This line gets the longest string within the matrixResult 
		
		var toFit = newArrayList()
		for(e : 0 .. getString(grammar).length) {
			toFit.add(("i="+ e).length)
		}
		toFit.sort 
		
		result += jIndexes(getString(grammar).length, maxWidth, toFit.get(toFit.size-1))
		
		for(row : 0 .. getString(grammar).length-1) {
			result += "i="+ row + " "
			for(column : 0 .. getString(grammar).length-1) {
				if(cyk.getMatrixResult.get(row).get(column) !== null) {
					
					var difference = maxWidth - ("{"+cyk.getMatrixResult.get(row).get(column)+"}").length
					var blankLeft = ""
					var blankRight = ""
					for(i : 0 .. difference/2){
						blankLeft += " "
						blankRight += " "
					}
					var aux2 = ""
					aux2 = "{"+cyk.getMatrixResult.get(row).get(column)+"}"

					if(aux2.length > maxWidth) {
						result += "{"+cyk.getMatrixResult.get(row).get(column)+"}"
						
					}
					else if(aux2.length == 2) {
						blankLeft += "   "//3 spaces
						
						result += "{" + blankLeft+ cyk.getMatrixResult.get(row).get(column) + "}"
					}
					else {
						result += "{"+ blankLeft + cyk.getMatrixResult.get(row).get(column) + blankRight +"}"
					}
				}
			}
			result += "\n"
		}
		
		result
	}
	
	def printResult(GNFC grammar) {
		
		'''
		«executeCYK(grammar)»
		'''	
	}
	
}
