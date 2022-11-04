package arrays;

public class CharSearch {
	public static void main(String[] args) {
		String name = "Hemachandiran";
		char target = 'p';
		System.out.println(SearchString(name, target));
	}
	
	static boolean SearchString(String name, char target) {
		if(name.length()==0) {
			return false;
		}
		for (int i = 0; i < name.length(); i++) {
			if(target==name.charAt(i)) {
				return true;
			}
			

			
		}
		return false;
		}
	static boolean SearchString1(String name, char target) {
		if(name.length()==0) {
			return false;
		}
		for(char ch:name.toCharArray()) {
			if(target==ch) {
				return true;
			}
		}
		return false;
		
	}

	
}
