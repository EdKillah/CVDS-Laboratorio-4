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
****************************************************************/ 
package hangman;
import static org.junit.Assert.*;

import hangman.model.*;
import org.junit.Test;

public class GameScoreTest {

	@Test
	public void parametrosInvalidosOriginalScoreTest() {
		GameScore g = new OriginalScore();
		try {
			g.calculateScore(-1,0);
		}
		catch (HangmanException e) {
			assertEquals(e.getMessage(), HangmanException.INVALIDO);
		}
		
	}
	
	@Test
	public void parametrosInvalidosBonusScoreTest() {
		GameScore g = new BonusScore();
		try {
			g.calculateScore(0,-1);
		}
		catch (HangmanException e) {
			assertEquals(e.getMessage(), HangmanException.INVALIDO);
		}
		
	}
	
	@Test
	public void parametrosInvalidosPowerScoreTest() {
		GameScore g = new PowerScore();
		try {
			g.calculateScore(0,-2);
		}
		catch (HangmanException e) {
			assertEquals(e.getMessage(), HangmanException.INVALIDO);
		}
		
	}
	@Test
	public void puntaje0A100OriginalScore() {
		GameScore g = new OriginalScore();
		try {
			int a = g.calculateScore(0,0);
			int a1 = g.calculateScore(0,1);
			int a2 = g.calculateScore(1,2);
			assertEquals(100, a);
			assertEquals(90, a1);
			assertEquals(80, a2);
		}
		catch (HangmanException e) {}
		
		
	}
	@Test
	public void puntajeMenor0OriginalScore() {
		GameScore g = new OriginalScore();
		try {
			int a = g.calculateScore(0,10);
			int a1 = g.calculateScore(0,11);
			int a2 = g.calculateScore(0,9);
			assertEquals(0, a);
			assertEquals(0, a1);
			assertEquals(10, a2);
		}
		catch (HangmanException e) {}
		
	}
	
	@Test
	public void puntajeMayor0BonusScore() {
		GameScore g = new BonusScore();
		try {
			int a = g.calculateScore(1,0);
			int a1 = g.calculateScore(5,9);
			int a2 = g.calculateScore(0,0);
			assertEquals(10, a);
			assertEquals(5, a1);
			assertEquals(0, a2);
		}
		catch (HangmanException e) {}
		
	}
	
	@Test
	public void puntajeMenor0BonusScore() {
		GameScore g = new BonusScore();
		try {
			int a = g.calculateScore(5,10);
			int a1 = g.calculateScore(5,11);
			int a2 = g.calculateScore(0,0);
			
			assertEquals(0, a);
			assertEquals(0, a1);
			assertEquals(0, a2);
		}
		catch (HangmanException e) {}
		
	}
	
	@Test
	public void puntaje0A500PowerBonusScore() {
		GameScore g = new PowerScore();
		try {
			int a = g.calculateScore(3,19);
			int a1 = g.calculateScore(3,18);
			assertEquals(3, a);
			assertEquals(11, a1);
		}
		catch (HangmanException e) {}
	}
	
	
	@Test
	public void puntajeMaximo500PowerScore() {
		GameScore g = new PowerScore();
		try {
			int a = g.calculateScore(4,0);
			int a1 = g.calculateScore(5,0);
			assertEquals(500, a);
			assertEquals(500, a1);
		}
		catch (HangmanException e) {}
	}
	
	@Test
	public void puntajeMenor0PowerScore() {
		GameScore g = new PowerScore();
		try {
			int a = g.calculateScore(1,1);
			int a1 = g.calculateScore(0,1);
			int a2 = g.calculateScore(0,0);
			assertEquals(0, a);
			assertEquals(0, a1);
			assertEquals(0, a2);
		}
		catch (HangmanException e) {}
		
	}
	
}