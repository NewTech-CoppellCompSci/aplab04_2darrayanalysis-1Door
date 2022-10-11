package lab;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(6, 3, -2, 10);
		
		int[][] arr2 = analysis.createRandom(5, 5, 6, 19);
		
		System.out.println("\nArray #1:");
		analysis.printArray(arr1);
		System.out.println("");
		analysis.sumTotal(arr1);
		System.out.println("");
		analysis.average(arr1);
		analysis.findMin(arr1);
		analysis.findMax(arr1);
		
		System.out.println("\nArray #2:");
		analysis.printArray(arr2);
		System.out.println("");
		analysis.sumTotal(arr2);
		System.out.println("");
		analysis.average(arr2);
		analysis.findMin(arr2);
		analysis.findMax(arr2);
		
		System.out.println("\nThis is the differences of the arrays");
		
		analysis.diffArrays(arr1,arr2);
		
		System.out.println("h");
		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -40, 40);
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			analysis.printArray(arr);
			x++;
			
		}

	}
	
	
	
	
	
	
	
}
