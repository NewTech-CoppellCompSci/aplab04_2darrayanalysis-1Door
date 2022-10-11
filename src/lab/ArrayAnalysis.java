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
			for (int element : row) {

				System.out.print(element + " ");

			}
			System.out.println();

		}

	}

	// #3
	public static int sumTotal(int[][] arr) {

		int total = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {

				total += arr[i][j];

			}

		}
		
		return total;
	}

	// #4
	public static double average(int[][] arr) {

		int total = 0;
		double count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {

				total += arr[i][j];
				count++;
			}

		}
		
		
		return total / count;
	}

	// #5
	public static int findMin(int[][] arr) {

		int min = 240000000;
		for (int[] row : arr) {
			for (int element : row) {

				if (element < min) {

					min = element;

				}
				

			}
			

		}
		
		return min;
	}

	// #6
	public static int findMax(int[][] arr) {

		int max = -240000000;
		for (int[] row : arr) {
			for (int element : row) {

				if (element > max) {

					max = element;

				}
				

			}
			
		}
			
		return max;
	}

	// #7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2) {

		int count = 0;
		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
			int[][] arr = new int [arr1.length][arr1[0].length];
			
			for(int i = 0; i < arr1.length; i++)	
			{
				
				
				for(int j = 0; j < arr1[0].length; j++) {
					
					
					arr[i][j] = arr1[i][j] - arr2[i][j];
					
					System.out.println("Element " + count + ": "+ arr[i][j]);
					 count++;
				}
				
				
			}
			return arr;
		}

		
		
		
		return null;
	}

	// #8
	
	
	public static int[][] transposeRow(int[][] arr1, int dist) {
		
		int[][] newArr  = new int[arr1.length][arr1[0].length];
		
		for  (int row = 0; row < arr1.length - 1; row++) {
			
			newArr[row+1] = arr1[row];
			
			}		
		
			newArr[0] = arr1[arr1.length - 1];
		
		return newArr;
	}

	// #9
	public static long sum3D(int[][][] arr) {

		long total = 0;
		
		for(int i = 0;  i < arr.length - 1;  i++) {
			total =+ (long) ArrayAnalysis.sumTotal(arr[i]);
			
			
		}
		
		return total;
	}

	// #10
	public static double average3D(int[][][] arr) {

		long total = sum3D(arr);
		int num = (arr.length) * (arr[0].length) * (arr[0][0].length);
		
		double average = (double) total / (double) num;
		
		
		return average;
	}

}
