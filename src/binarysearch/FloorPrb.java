package binarysearch;

public class FloorPrb {
	public static void main(String[] args) {
		int [] arr = {4,5,7,9,12,14,17,98};
		int target = 6;
		int ans = findFloor(arr,target);
		System.out.println(ans);
 	}

	private static int findFloor(int[] nums, int target) {
		 int low = 0;
	        int high = nums.length-1;
	        
	        while(low <= high){
	            int mid = low + (high-low)/2;
	            
	            if(nums[mid] == target){
	                return mid;
	            }else if(nums[mid] > target){
	                high= mid -1;
	            }else{
	                low = mid+1;
	            }
	        }
	        
	        return low;
	}

}
