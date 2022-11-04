package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetIndex {
	public static void main(String[] args) {
		//nums = [0,1,2,3,4], index = [0,1,2,2,1]
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
		
	}
	
	  public static  int[] createTargetArray(int[] nums, int[] index) {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for (int i = 0; i < nums.length; i++) {
	        	list.add(index[i], nums[i]);
				
			}
	        int[] ans = new int[nums.length];
	        for (int i = 0; i < ans.length; i++) {
				ans[i] = list.get(i);
			}
	        return ans;
	    }

}
