package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreaterNoCandies {
	public static void main(String[] args) {
		int [] candies = {2,8,7};
		int extraCandies = 1;
		System.out.println(kidsWithCandies(candies, extraCandies));;
		
	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] ans = new int[candies.length];
        for(int i = 0;i<candies.length;i++){
            ans[i] = candies[i]+extraCandies;
            
        }
        System.out.println(Arrays.toString(ans));
        int low = Integer.MIN_VALUE;
        List<Boolean> ans1 = new ArrayList<Boolean>();
        for(int i : ans) {
        	if(i<=low) {
        		ans1.add(false);       		
        	}
        	else 
    			ans1.add(true);
        	
        	
        }
       
        return ans1;
    }

}
