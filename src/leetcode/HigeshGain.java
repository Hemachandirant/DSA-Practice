package leetcode;

public class HigeshGain {

	public static void main(String[] args) {
		int[] arr = {-4,-3,-2,-1,4,3,2};
		System.out.println(maxGain(arr));

	}

	private static int maxGain(int[] arr) {
		int max = 0;
		int gain = 0;
		for (int i = 0; i < arr.length; i++) {
			gain+=arr[i];
			if(gain>max) {
				max = gain;
			}
		}
		return max;
		
	}

}
