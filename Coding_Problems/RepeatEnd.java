package src.com.project1.strings;



public class RepeatEnd {

	
	/*Given a string and an int n, return a string made of n 
	 *repetitions of the last n characters of the string. You may 
	 *assume that n is between 0 and the length of the string, inclusive.
		repeatEnd("Hello", 3) → "llollollo"
		repeatEnd("Hello", 2) → "lolo"
		repeatEnd("Hello", 1) → "o"
	 * 
	 * */
	
	static public String repeatEnd(String str, int n){
	/*1. Get the last n characters of the string. 
	 *2. Repeat the last n characters of the string n number of times and
	 *	 return the new string. */
			
		StringBuilder sb = new StringBuilder(n * str.length());
		
		String result2 = "";
		
		if(str.length() < n){
		
				for(int i=0; i<n; i++){
					
					sb.append(str);
						
				}
				System.out.println(sb.toString());
				return  sb.toString();
				
		}else if(str.length() >= n){
				
				for(int i=0; i<n; i++){
					
					int n2 = (str.length()) - n;
					
					result2 = str.substring(n2);
					 			
					sb.append(result2);
			
					
				}
				System.out.println(sb.toString());
				return sb.toString();
		}
			System.out.println(sb.toString());
			return sb.toString();
	}
		

	public static void main(String[] args) {
		
		String str = "HelloEveryoneThere";
		int n = 4;
		
		RepeatEnd.repeatEnd(str, n);
		
	}

}
