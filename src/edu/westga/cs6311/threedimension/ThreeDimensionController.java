package edu.westga.cs6311.threedimension;

/**
 * Create variables, constructor, and methods for three dimensional arrays
 * @author Anna Blood
 * @version 10/19/22
 *
 */
public class ThreeDimensionController {
	
	private int[][][] intPixelArray;
	
	/**
	 * Constructor
	 */
	public ThreeDimensionController() {
		this.setIntPixelArray(new int[50][50][3]);
		this.seedIntArray();
	}
	
	/**
	 * Method to seed value in each element of int array 
	 */
	private void seedIntArray() {
		for (int row = 0; row < this.getIntPixelArray().length; row++) {
			for (int column = 0; column < this.getIntPixelArray()[row].length; column++) {
				for (int cell = 0; cell < this.getIntPixelArray()[row][cell].length; cell++) {
					this.setIntArrayElements(this.getIntPixelArray(), row, column, cell, (int) (Math.random() * 256));
				}
			}
		}
	}
	
	/**
	 * Method to calculate average of R values, B values, and G values in each row of int array 
	 * @return 2D int array where each value is {R,G,B} average of a row of a mulidimensional array
	 */
	public int[][] getPixelRowAverages() {
		int row = 0;
		int column = 0;
		int cell = 0;
		int[][] intRowAverage = new int[this.getIntPixelArray().length][this.getIntPixelArray()[row][column].length];
		for (cell = 0; cell < 3; cell++) {
			for (row = 0; row < this.getIntPixelArray().length; row++) {
				int sum = 0;
				for (column = 0; column < this.getIntPixelArray()[row].length; column++) {
					sum += this.getIntPixelArray()[row][column][cell];
				}
				int avg = sum / this.getIntPixelArray()[row].length;
				this.setInt2DArrayElements(intRowAverage, row, cell, avg);
			}
		}
		return intRowAverage;
	}
	
	/**
	 * Helper method to print arrays in Main Class 
	 * @param array sets the array to format
	 * @return String of formatted 2D array 
	 */
	public String formatIntTwoDResults(int[][] array) {
		String arrayResult = "";
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				arrayResult += String.valueOf(array[row][column]) + " ";
			}
			arrayResult += "\n";
		}
		return arrayResult;
	}

	/**
	 * Getter for intPixelArray
	 * @return the intPixelArray
	 */
	public int[][][] getIntPixelArray() {
		return this.intPixelArray;
	}
	
	/**
	 * Setter for intPixelArray
	 * @param newIntPixelArray the array to set
	 */
	public void setIntPixelArray(int[][][] newIntPixelArray) {
		this.intPixelArray = newIntPixelArray;
	}
	
	/**
	 * Setter for intArrayElements
	 * @param array passes in the array that the element is being assigned to
	 * @param row passes in the row of the element being set
	 * @param column passes in the column of the element being set
	 * @param cell passes in the cell of the element being set 
	 * @param value passes in the value of the element being set 
	 */
	public void setIntArrayElements(int[][][] array, int row, int column, int cell, int value) {
		if (row >= 0 && row < this.getIntPixelArray().length 
				&& column >= 0 && column < this.getIntPixelArray()[row].length
				&& cell >= 0 && cell < this.getIntPixelArray()[cell].length) {
			array[row][column][cell] = value;
		}
	}
	
	/**
	 * Setter for int2DArrayElements
	 * @param array passes in the array that the element is being assigned to
	 * @param row passes in the row of the element being set
	 * @param column passes in the column of the element being set
	 * @param value passes in the value of the element being set 
	 */
	public void setInt2DArrayElements(int[][] array, int row, int column, int value) {
		if (row >= 0 && row < this.getIntPixelArray().length 
				&& column >= 0 && column < this.getIntPixelArray()[row].length) {
			array[row][column] = value;
		}
	}
}
