package src.com.project12.collections;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
	
	
	static public Map<String, String> topping1(Map<String, String> map){
		
	//	String str1 = map.get("ice cream");
		
		map.put("bread", "butter");
		
		if(map.containsKey("ice cream")){
			map.put("ice cream", "cherry");
		}
		
		
		System.out.println(map);
		return map;
	}

	public static void main(String[] args) {
	//	Topping1 topping = new Topping1();
		Map<String, String> map = new HashMap<String, String>();
		map.put("pancake", "syrup");
		
		Topping1.topping1(map);
	
	}

}
