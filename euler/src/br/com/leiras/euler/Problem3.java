package br.com.leiras.euler;

import java.util.Collections;
import java.util.Vector;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author leiras
 */

public class Problem3 {

	public static void main(String[] args) {
		Vector<Long> primeFactors = new Vector<Long>();
		long targetNumber = 600851475143L;
		long number = targetNumber;
		
		long i = 1;		
		while (i <= number) {
			if (Problem3.isPrime(i)) {
				if (number%i == 0) {
					primeFactors.add(i);
					number = (long)number/i;					
					i =1;
				}				
			}
			i++;
		}	
		System.out.println("The largest prime factor of the number "+targetNumber+" is: "+Collections.max(primeFactors));
	}
	
	private static boolean isPrime(Long number) {
		boolean prime = true;
		long i = 1;
		while (prime && i <= number) {
			if (number%i == 0 && i!=1 && i!=number) {
				prime = false;
			}
			i++;
		}
		if (number == 1) {
			prime = false;
		}
		return prime;
	}

}
