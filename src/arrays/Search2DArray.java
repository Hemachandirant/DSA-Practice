package arrays;

import java.util.Arrays;

public class Search2DArray {

	public static void main(String[] args) {
		int [][] arr = {
				{23,56,78,77},
				{12,223,56,7,8},
				{2,3,4,5},
				{1,8}
		};
		int target = 77;
		System.out.println(Arrays.toString(search(arr,target)));

	}

	private static int[] search(int[][] arr, int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col =0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
			
	}
		
		return new int[] {-1,-1};
	
	


}
}
