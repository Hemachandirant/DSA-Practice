package arrays;

public class MaxWealth {

	public static void main(String[] args) {
		// Input: accounts = [[1,2,3],[3,2,1]]
		//Output: 6
		
		int [][] arr = {
				{1,2,3},
				{3,2,1}
		};
		
		System.out.println(maxWealth(arr));

	}

	static int maxWealth(int[][] arr) {
		int ans = Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++) {
			int sum = 0;
			for(int col=0;col<arr[row].length;col++) {
				sum+=arr[row][col];
				
			}
			if(sum>ans) {
				ans = sum;
			}
		}
		return ans;
	}

}
