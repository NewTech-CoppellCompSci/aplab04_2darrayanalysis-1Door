package lab;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(6, 3, -2, 10); //creates first array
		
		int[][] arr2 = analysis.createRandom(6, 3, 6, 19); //creates second array
		
		System.out.println("\n----------Array #1----------");
		analysis.printArray(arr1);
		System.out.println("");
		System.out.println("Sum of array #1 - " + analysis.sumTotal(arr1));
		System.out.println("Average of array #1 - " + analysis.average(arr1));
		System.out.println("Min of array #1 -  " + analysis.findMin(arr1));
		System.out.println("Max of array #1 -  " + analysis.findMax(arr1)); //uses methods in ArrayAnalysis to get numbers and then prints them
	
		
		
		System.out.println("\n----------Array #2----------");
		analysis.printArray(arr2);
		System.out.println("");
		System.out.println("Sum of array #2 - " + analysis.sumTotal(arr2));
		System.out.println("Average of array #2 - " + analysis.average(arr2));
		System.out.println("Min of array #2 -  " + analysis.findMin(arr2));
		System.out.println("Max of array #2 -  " + analysis.findMax(arr2));  //uses methods in ArrayAnalysis to get numbers and then prints them (again)
		
		System.out.println("\nThis is the differences of the arrays (will return nothing if arrays are not the same size)\n");
		
		analysis.diffArrays(arr1,arr2); //uses this for  the diff array method
		
		System.out.println("\nMoves array #1 down a row");
		analysis.printArray(analysis.transposeRow(arr1, 1));
		
		System.out.println("\n----------3D Array----------"); 
		
		int[][][] arr3D = new int[3][4][5]; //creates the 3D array
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -40, 40); //populates  3D  array
			
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			analysis.printArray(arr);
			x++;
			
		}

		System.out.println("\nSum of 3D Array");
		
		System.out.println(analysis.sum3D(arr3D));
		
		
		System.out.println("\nAverage of 3D Array");
		
		System.out.println(analysis.average3D(arr3D)); //uses methods to  print the 3D array
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
