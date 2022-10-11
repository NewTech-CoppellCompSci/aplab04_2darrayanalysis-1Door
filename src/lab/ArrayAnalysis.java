package lab;

import java.util.ArrayList;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	// #1
	public static int[][] createRandom(int row, int column, int min, int max) {
		int[][] arr = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				int scope = max - min;

				int num = (int) (Math.random() * scope + min);
				arr[i][j] = num;
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
		System.out.print("This array has a total of: " + total);
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
		System.out.println("This array has an average of " + total / count);
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
		System.out.println("The minimum value of this array is " + min);
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
			System.out.println("The maximum value of this array is " + max);

		return max;
	}

	// #7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2) {

		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
			int[][] arr = new int [arr1.length][arr1[0].length];
			
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr1[0].length; j++) {
					arr[i][j] = arr1[i][j] - arr2[i][j];
					
					
				}
				
				System.out.println(i);
			}
			return arr;
		}

		
		
		
		return null;
	}

	// #8
	public static int[][] transposeRow(int[][] arr1, int dist) {

		for (int[] row : arr1) {
			for (int element : row) {

				
				
					
					
				
				
			}
			System.out.println();

		}
		return null;
	}

	// #9
	public long sum3D(int[][][] arr) {

		long total = 0;
		
		for(int i = 0;  i < arr.length - 1;  i++) {
			total =+ (long) this.sumTotal(arr[i]);
			
			
		}
		
		return total;
	}

	// #10
	public double average3D(int[][][] arr) {

		long total = this.sum3D(arr);
		int num = (arr.length) * (arr[0].length) * (arr[0][0].length);
		
		double average = (double) total / (double) num;
		
		System.out.println("Bryn likes men");
		
		return average;
	}

}
