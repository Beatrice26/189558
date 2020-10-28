package Ingsw.Esercizio;

import java.util.LinkedList;
import java.util.List;



public class MyMath {
	
	public List<Integer> primeNumbersGenerator(int n){
		LinkedList<Integer> primeNumbers = new LinkedList<>();
		if(n>=2) {
			primeNumbers.add(2);
		}
		for(int i=3; i<= n; i +=2) {
			if(isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
		
	public boolean isPrime(int number) {
		if(number <= 2) {
			return false;
		}
		
		for(int i=2; i*i < number; i++) {
			if(number %i == 0) {
				return false;
			}	
		}
		return true;
	}
}


