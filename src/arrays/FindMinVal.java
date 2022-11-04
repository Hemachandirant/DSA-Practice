package arrays;

import java.util.Scanner;

public class FindMinVal {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = new int[5];
	
	for(int i =0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	int min = arr[0];
	for(int index=0;index<arr.length;index++) {
		if(arr[index]<min) {
			min = arr[index];
		}
		
	}
	System.out.println(min);
 	}

}
