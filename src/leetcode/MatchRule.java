package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MatchRule {

	public static void main(String[] args)
	{
		List<List<String>> items = new ArrayList<List<String>>();
		items.add(Arrays.asList("phone","blue","pixel"));
		items.add(Arrays.asList("computer","silver","lenovo"));
		items.add(Arrays.asList("phone","gold","iphone"));
		//System.out.println(items);
		String ruleKey = "color", ruleValue = "silver";
		

	}
	
	static int matchRules(List<List<String>> items, String ruleKey, String ruleValue) {
		int res = 0;
		for(int i =0;i<items.size();i++) {
		if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) {
			res++;
		}
		if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) {
			res++;
		}
		if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) {
			res++;
		}
		}
		return res;
	}

}
