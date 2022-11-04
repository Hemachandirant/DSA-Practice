package arrays;

public class LinearSearch {
	public static void main(String [] args) {
		int [] arr = {3,4,23,1,7,8,9,12};
		int target = 4;
		int ans = linearSearch(arr, target);
		System.out.println(ans);
	}

	static int linearSearch(int[] arr, int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==target) {
				return index;
				}
			}
		return -1;
	}

}
