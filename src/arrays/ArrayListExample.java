package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(40);
	list.set(0, 1);
	for (int i = 0; i < 5; i++) {
		list.add(in.nextInt());
		
	}
	System.out.println(list);
	}
	
	

}
