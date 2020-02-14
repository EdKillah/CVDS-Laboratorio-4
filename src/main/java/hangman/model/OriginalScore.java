/***************************************************************
* file: OriginalScore.java
* author:   Cesar Gonzalez
*           Eduard Jimenez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Lab 04
* date last modified: 8/2/2020
*
* purpose: This is the class that implements the interface GameScore
*
****************************************************************/ 


package hangman.model;

public class OriginalScore implements GameScore {
	
	
	
	/**
	*@param correctCount 
	*@param incorrectCount numero incorrecto de jugadas.  
	*
	*@pre recibir dos valores enteros ( correctCount  , incorrectCount ) 
	*@pos retorna un valor entero que es la puntuacion generada.
	*@return score  .
	*@throws InvalidoException si algun parametro es negativo.
	*/
	
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
		if (correctCount < 0 || incorrectCount < 0) {throw new HangmanException(HangmanException.INVALIDO);}
		//System.out.println("Original Score: "+Math.max(0, 100-(10*incorrectCount)));
		return Math.max(0, 100-(10*incorrectCount));
	}

}
