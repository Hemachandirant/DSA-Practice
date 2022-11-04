package arrays;

public class FindMax {

	public static void main(String[] args) {
		int [] arr = {23,4,35,34,23,12};
		System.out.println(max(arr));

	}
	
	static int max(int[]arr) {
		int max = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
