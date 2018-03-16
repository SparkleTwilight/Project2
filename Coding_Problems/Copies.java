package src.com.project.lamdas;

import java.util.List;
import java.util.ArrayList;

public class Copies {

	/*Given a list of strings, return a list where each string 
	 *is replaced by 3 copies of the string concatenated together.

	copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
	copies3(["24", "a", ""]) → ["242424", "aaa", ""]
	copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]*/
	
	
	static public List<String> copies3(List<String> strings){
		
		
		
		strings.replaceAll(s -> s + s + s);
		 
		return strings;
	}
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		
		strings.add("a");
		strings.add("bb");
		strings.add("ccc");
		
		Copies.copies3(strings);
		System.out.println(strings);

	}

}
