package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountNonVowels {
	public static void main(String[] args) {
		char[] vowels = {'a','e','i','o','u'};
		Scanner sc = new Scanner(System.in);
		char[] input = new char[5];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.next().charAt(0);
			
		}
		int count = 0;
		//System.out.println(Arrays.toString(input));
		for (int i = 0; i < input.length; i++) {
			if(input[i]!='a'&& input[i]!='e' && input[i]!='i'&& input[i]!='o'&&input[i]!='u') {
				count+=1;
			}
				
			}
			System.out.println(count);
		
	}

}
