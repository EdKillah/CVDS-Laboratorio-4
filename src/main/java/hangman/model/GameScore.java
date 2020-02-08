/***************************************************************
* file: GameScore.java
* author:   Cesar Gonzalez
*           Eduard Jimenez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Lab 04
* date last modified: 8/2/2020
*
* purpose: This is the interface that uses the score system
*
****************************************************************/ 

package hangman.model;

public interface GameScore {
	
	public int calculateScore(int correctCount, int incorrectCount);

}
