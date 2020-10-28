package Ingsw.Esercizio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;


public class MyMathTest {
	
	private static MyMath math;
	
	@BeforeClass    //avremmo potuto fare before, che viene eseguito prima ogni caso di prova
	public static void prepare() {
		math = new MyMath(); //variabile inizializzata con istanza mymath
	}
	
	@Test
	public void primeNumbersGeneratorWorks() {
		assertEquals(new LinkedList<Integer>(), math.primeNumbersGenerator(1)); //se il numero è < 2, verra restituito una lista vuota, perche non entra nei controlli del metodo
		assertEquals(Arrays.asList(2,3,5,7,11,13,17,19), math.primeNumbersGenerator(20) );
	}
	
	@Test
	public void isPrimeWorks() {
		assertFalse(math.isPrime(9));
		assertFalse(math.isPrime(1));
		assertTrue(math.isPrime(2));
		List<Integer> primes =  Arrays.asList(2,3,5,7,11,13,17,19);
		for(int prime : primes) {
			assertTrue(math.isPrime(prime));
		}
		
	}
}
