package org.escoladeltreball.helloworld;

public interface Utils {
	
	/*
	 * This method returns an integer array with n in its place
	 */
	public abstract int[] merge(int[] values, int n);
	/*
	 * This method returns true if n is present in values
	 */
	public abstract boolean isPresent(int[] values, int n);
	
	/*
	 * This method returns the frequency in % of n in values
	 */
	public abstract double frequencyPercentage(int[] values, int n);
	
	/*
	 * This methods return the frequency value in a integer array
	 */
	public abstract int frequency(int[] values, int n);
	
	/*
	 * This method return the smallest value in a integer array
	 */
	public abstract int findSmallest(int[] values);
	
	public abstract int sum(int[] values);
	
}
