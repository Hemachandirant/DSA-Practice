package leetcode;

import java.util.HashSet;

public class Panagram {
	public static void main(String[] args) {
		String word = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(panagram(word));
		
	}
	
	static boolean panagram(String word) {
		String word1 = word.toLowerCase().strip();
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < word.length(); i++) {
			set.add(word1.charAt(i));
			
		}
		System.out.println(set);
		return set.size()==26;
	}
}
