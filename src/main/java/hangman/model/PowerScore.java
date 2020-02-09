/***************************************************************
* file: PowerScore.java
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


public class PowerScore implements GameScore {
	
	
	
	
	/**
	*@param correctCount 
	*@param incorrectCount numero incorrecto de jugadas.  
	*
	*@pre recibir dos valores enteros ( correctCount  , incorrectCount ) 
	*@pos retorna un valor entero que es la puntuacion generada.
	*@return score  .
	*@throws InvalidoException si algun parametro es negativo.
	*/
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		if (correctCount < 0 || incorrectCount < 0) {throw new HangmanException(HangmanException.INVALIDO);}
		int tot=0;
		for(int i=0;i<correctCount;i++) {
			tot+=Math.pow(5, i+1);
		}
		tot=Math.min(tot,500);
		tot-=incorrectCount*8;
		return Math.max(tot, 0);
	}

}
