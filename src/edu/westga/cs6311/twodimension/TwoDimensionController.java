package edu.westga.cs6311.twodimension;

/**
 * Create variables, constructor, and methods for two dimensional arrays
 * @author Anna Blood
 * @version 10/19/22
 *
 */
public class TwoDimensionController {
	
	private int[][] intDimensionalArray;
	private double[][] doubleDimensionalArray;
	
	/**
	 * Constructor
	 */
	public TwoDimensionController() {
		this.setIntDimensionalArray(new int[100][25]);
		this.setDoubleDimensionalArray(new double[100][25]);
		this.seedIntArray();
		this.seedDoubleArray();
	}
	
	/**
	 * Method to seed value in each element of int array 
	 */
	private void seedIntArray() {
		for (int row = 0; row < this.getIntDimensionalArray().length; row++) {
			for (int column = 0; column < this.getIntDimensionalArray()[row].length; column++) {
				this.setIntArrayElements(this.getIntDimensionalArray(), row, column, (int) (1 + (Math.random() * 50)));
			}
		}		
	}
	
	/**
	 * Method to seed value in each element of double array 
	 */
	private void seedDoubleArray() {
		for (int row = 0; row < this.getDoubleDimensionalArray().length; row++) {
			for (int column = 0; column < this.getDoubleDimensionalArray()[row].length; column++) {
				this.setDoubleArrayElements(this.getDoubleDimensionalArray(), row, column, (1 + (Math.random() * 50)));
			}
		}
	}
	
	/**
	 * Method to calculate average of numbers in each row of int array 
	 * @return 1D int array where each value is average of a row of a mulidimensional array
	 */
	public int[] getIntRowAverages() {
		int[] intRowAverage = new int[this.getIntDimensionalArray().length];
		for (int row = 0; row < this.getIntDimensionalArray().length; row++) {
			int sum = 0;
			for (int column = 0; column < this.getIntDimensionalArray()[row].length; column++) {
				sum += this.intDimensionalArray[row][column];
			}
			int avg = sum / this.getIntDimensionalArray()[row].length;
			intRowAverage[row] = avg; 
		}
		return intRowAverage;
	}
	
	/**
	 * Method to calculate average of numbers in each row of double array 
	 * @return 1D double array where each value is average of a row of a mulidimensional array
	 */
	public int[] getDoubleRowAverages() {
		int[] doubleRowAverage = new int[this.getDoubleDimensionalArray().length];
		for (int row = 0; row < this.getDoubleDimensionalArray().length; row++) {
			double sum = 0;
			for (int column = 0; column < this.getDoubleDimensionalArray()[row].length; column++) {
				sum += this.getDoubleDimensionalArray()[row][column];
			}
			int avg = (int) (sum / this.getDoubleDimensionalArray()[row].length);
			doubleRowAverage[row] = avg; 
		}
		return doubleRowAverage;
	}
	
	/**
	 * Method to determine median number in each row of int array
	 * @return 1D int array where each value is median of a row of a multidimensional array 
	 */
	public int[] getMedianIntNumbers() {
		int[] intMedian = new int[this.getIntDimensionalArray().length];
		int median = 0;
		for (int row = 0; row < this.getIntDimensionalArray().length; row++) {
			for (int column = 0; column < this.getIntDimensionalArray()[row].length; column++) {
				if (column == (this.getIntDimensionalArray()[row].length) / 2) {
					median = this.getIntDimensionalArray()[row][column];
				}
			}
			intMedian[row] = median;
		}
		return intMedian;
	}
	
	/**
	 * Getter for intDimensionalArray
	 * @return the intDimensionalArray
	 */
	public int[][] getIntDimensionalArray() {
		return this.intDimensionalArray;
	}
	
	/**
	 * Setter for intDimensionalArray
	 * @param newIntDimensionalArray the array to set
	 */
	public void setIntDimensionalArray(int[][] newIntDimensionalArray) {
		this.intDimensionalArray = newIntDimensionalArray;
	}
	
	/**
	 * Setter for intArrayElements
	 * @param array passes in the array that the element is being assigned to
	 * @param row passes in the row of the element being set
	 * @param column passes in the column of the element being set
	 * @param value passes in the value of the element being set 
	 */
	public void setIntArrayElements(int[][] array, int row, int column, int value) {
		if (row >= 0 && row < this.getIntDimensionalArray().length 
				&& column >= 0 && column < this.getIntDimensionalArray()[row].length) {
			array[row][column] = value;
		}
	}

	/**
	 * Getter for doubleDimensionalArray
	 * @return the doubleDimensionalArray
	 */
	public double[][] getDoubleDimensionalArray() {
		return this.doubleDimensionalArray;
	}
	
	/**
	 * Setter for doubleDimensionalArray
	 * @param newDoubleDimensionalArray the array to set
	 */
	public void setDoubleDimensionalArray(double[][] newDoubleDimensionalArray) {
		this.doubleDimensionalArray = newDoubleDimensionalArray;
	}
	
	/**
	 * Setter for doubleArrayElements 
	 * @param array passes in the array that the element is being assigned to
	 * @param row passes in the row of the element being set
	 * @param column passes in the column of the element being set
	 * @param value passes in the value of the element being set 
	 */
	public void setDoubleArrayElements(double[][] array, int row, int column, double value) {
		if (row >= 0 && row < this.getDoubleDimensionalArray().length 
				&& column >= 0 && column < this.getDoubleDimensionalArray()[row].length) {
			array[row][column] = value;
		}
	}
}
