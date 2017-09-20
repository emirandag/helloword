/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw26540084
 *
 */
public final class Main implements Utils {

	public static void main(String [] args) {
		System.out.println("hello world");
		
		int[] v = {2, 3, 4, 5, 3, 2, 1};
		Main main = new Main();
		System.out.println(main.findSmallest(v));
	}

	/*
	 * This methods returns the smallest value from values
	 */
	@Override
	public int findSmallest(int[] values) {
		int menor = values[0];
		for (int value: values) {
			if(value < menor) {
				menor = value;
			}
		} 
		return menor;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(int[] values) {
		
		int sum = 0;
		for (int value: values) {
			sum += value;
		}
		// TODO Auto-generated method stub
		return sum;
		
	
	}

	@Override
	public int frequency(int[] values, int n) {
		
		int counter = 0;
		for (int value: values) {
			if (n == value) {
				counter++;
			}
		}
		// TODO Auto-generated method stub
		return counter;
		
	}

	@Override
	public double frequencyPercentage(int[] values, int n) {
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}
	
}
