package binarysearch;

public class CeilingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,4,7,9,12,34,56};
		int target = 3;
		System.out.println(ceilingNo(arr,target));

	}

	private static int ceilingNo(int[] arr, int target) {
		int start = 0, end = arr.length-1;
		int mid;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(mid == target) {
				return mid;
			}else if(arr[mid]>target) {
				end = mid-1;
			}else if(arr[mid]<target) {
				start = mid+1;
			}else {
				return mid;
			}
		}
		return start;
	}
	
}
