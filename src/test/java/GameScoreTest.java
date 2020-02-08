/***************************************************************
* file: GameScoreTest.java
* author:   Cesar Gonzalez
*           Eduard Jimenez
* class: CS 245 - Programming Graphical User Interfaces
*
* assignment: Lab 04
* date last modified: 8/2/2020
*
* purpose: This is the TestClass that will prove the interface GameScore 
* 		   and the clases that uses it 
* 
* 
* 
*
*
*
*
*
* 
* Clases de equivalencia para OriginalScore: 
* 1. parametros invalidos (-1,0), (-2,0), (0,-1), (0,-2), (0,0)
* 2. puntaje entre 0 y 100  (0,1),(0,0),(1,2)
* 3.puntaje menor que 0 (0,10), (0,11), (0,9)
*  Clases de equivalencia para BonusScore: 
* 1. parametros invalidos (-1,0), (-2,0), (0,-1), (0,-2), (0,0)
* 2. puntaje mayor que 0 (1,0), (5,9), (0,0)
* 3.puntaje menor que 0 (5,10), (5,11), (0,0)
* Clases de equivalencia para PowerBonusScore: 
* 1. parametros invalidos (-1,0), (-2,0), (0,-1), (0,-2), (0,0)
* 2. puntaje entre  0 y 500 (3,19), (3,20),(4,0), (0,0)
* 3. puntaje menor que 0 (1,1), (0,1), (0,0)
* 3. puntaje mayor que 500 (4,0) 
*
*
*
*
*
****************************************************************/ 

import static org.junit.Assert.*;

import org.junit.Test;

public class GameScoreTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
