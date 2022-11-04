package arrays;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = new int[8];//creating the object in the heap memory;
		//datatype
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] array = new int[5];
		for(int i=0;i<arr.length;i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println(java.util.Arrays.toString(array));
		
	}
	
}
