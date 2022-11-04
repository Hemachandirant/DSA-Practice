package arrays;

public class EvenNumberOfDigits {

	public static void main(String[] args) {
		int []nums = {12,3453,2,6,7896};
		System.out.println(findNumbers(nums));

	}
	static int findNumbers(int[]nums) {
		int count=0;
		for(int num:nums) {
			if(even(num)) {
				count++;
			}
		
		}
		return count;
	}
	private static boolean even(int num) {
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		if(count%2==0) {
			
			return true;
		}
		return false;
	}

}
