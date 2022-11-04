package arrays;

public class Max2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,67},
				{34,56,78}
		};
		System.out.println(max(arr));
		System.out.println(max1(arr));
	}

	private static int max(int[][] arr) {
		int max = arr[0][0];
		for(int row=0;row<arr.length;row++) {
			for(int col =0;col<arr[row].length;col++) {
				if(arr[row][col]>max) {
					max=arr[row][col];
					
				}
			
			}
		}
		return max;
	}
	
	private static int max1(int[][]arr) {
		int max = Integer.MIN_VALUE;
		for(int[]arrays:arr) {
			for(int ints:arrays) {
				if(ints>max) {
					max=ints;
				}
			}
		}
		return max;
	}
	

}
