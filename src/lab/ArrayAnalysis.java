package lab;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {
	
	

	// #1
	public static int[][] createRandom(int row, int column, int min, int max) {
		int[][] arr = new int[row][column]; //creates the array
		
		

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				int scope = max - min; //creates the scope 

				int num = (int) (Math.random() * scope + min); //generates number between max and min
				arr[i][j] = num; //populates the array with the numbers
			}
		}

		return arr;
	}

	// #2
	public static void printArray(int[][] arr) {

		for (int[] row : arr) {  
			for (int element : row) {  //runs through all the elements

				System.out.print(element + " "); //prints out the element

			}
			System.out.println();

		}

	}

	// #3
	public static int sumTotal(int[][] arr) {

		int total = 0; //total

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) { //grabs each element

				total += arr[i][j]; //adds the current element to the total

			}

		}
		
		return total;
	}

	// #4
	public static double average(int[][] arr) {

		int total = 0;
		double count = 0; //variables

		for (int i = 0; i < arr.length - 1; i++) { //loops through all elements
			for (int j = 0; j < arr[i].length - 1; j++) {

				total += arr[i][j]; //gets total
				count++; //adds  to the count for the average
			}

		}
		
		
		return total / count; //gets the average
	}

	// #5
	public static int findMin(int[][] arr) {

		int min = 240000000;
		for (int[] row : arr) {
			for (int element : row) { //loops through all elements
				
				if (element < min) { //if it is smaller  than current  num

					min = element; //then make this the new smallest
					
					
				}
				

			}
			

		}
		
		return min;
	}

	// #6
	public static int findMax(int[][] arr) {

		int max = -240000000;
		for (int[] row : arr) {
			for (int element : row) { //loops through all elements

				if (element > max) { //if it is greater than the old max

					max = element; //make it the new max

				}
				

			}
			
		}
			
		return max; //returns
	}

	// #7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2) {

		int count = 0;
		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) { //checks to see if arrays are equal
			int[][] arr = new int [arr1.length][arr1[0].length]; //new array
			
			for(int i = 0; i < arr1.length; i++)	
			{
				
				
				for(int j = 0; j < arr1[0].length; j++) {  //2 loops to loop through all the elements
					
					
					arr[i][j] = arr1[i][j] - arr2[i][j]; //subtracts the elements
					
					System.out.println("Element " + count + ": "+ arr[i][j]); //prints out the array
					 count++; //keeps tract of the element to print
				}
				
				
			}
			return arr;
		}

		
		
		
		return null;
	}

	// #8
	
	
	public static int[][] transposeRow(int[][] arr1, int dist) {
		
		int[][] newArr  = new int[arr1.length][arr1[0].length];  //creates the second array
		
		for  (int row = 0; row < arr1.length - 1; row +=  dist) {  
			
			newArr[row+dist] = arr1[row]; //moves the  row  down by distance
			
			}		
		
			newArr[0] = arr1[arr1.length - 1]; 
		
		return newArr;
	}

	// #9
	public static long sum3D(int[][][] arr) { 

		long total = 0;
		
		for(int i = 0;  i < arr.length - 1;  i++) { //1 more loop for the 3rd dimension
			total =+ (long) ArrayAnalysis.sumTotal(arr[i]); //uses the other method and adds it to the total
			
			
		}
		
		return total;
	}

	// #10
	public static double average3D(int[][][] arr) {

		long total = sum3D(arr); //takes the sum from previous method 
		int num = (arr.length) * (arr[0].length) * (arr[0][0].length); //gets the number of all the elements in the 3d array
		
		double average = (double) total / (double) num; //divides the total by the numb
		
		
		return average;
	}

}
