package br.com.leiras.euler;

public class Problem1 {

	public static void main(String[] args) {
		int maxNumber = 1000;
		int sum = 0;
		for (int i = 1; i < maxNumber; i++) {			
			if ((i%3 == 0) || (i%5 == 0)) {
				System.out.println(i);
				sum += i;
			}			
		}		
		System.out.println("Result: "+sum);
	}

}