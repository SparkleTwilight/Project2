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
		
		//n will represent both the index of the last characters and the 
		//number of times it will be repeated.
		
	/*	//what if I used a reverse for loop to start at the last characters?
		for(int i=str.length()-1; i >0; i--){
			//this is will limit how far the loop will go based on the n
			//of numbers put in
			String str2 = "";
			
			//have a variable store the result of strings by index numbers times n
			
			
			if(str.length() >= 1 && n >=1){
				n = (str.length()) - n;
				str2 = str.substring(n);
			//	System.out.println("yes");
			//	System.out.println(str.length());
				
				return str2;
			}
			//this gets the desired index but does not repeat the last
			//characters n number of times
		}
		
		
		return str; 
		
		*The above code works to provide the repeating end parts of string, but only one
		*copy of it
		
/*	This code works to get multiple n copies of a string:
 * source: 	https://stackoverflow.com/questions/19198048/how-to-repeat-string-n-times-in-java
 * 
 * 
 * StringBuilder b = new StringBuilder(n * str.length());
		
		for(int i=0; i<n; i++){
		 b.append(str);
		// System.out.println( b.append(str));
			
		}
		
		String result = b.toString();
		System.out.println(result);
		return result;
	}*/
		
	/*	for(int i=0; i<str.length()-1; i++){
			if(str.length() >= 1 && n >=0){
				System.out.println(str.charAt(n));
				return str.substring(n);
			}
		} */
		
/*	String result = "";
	
	if(str.length() <= n){
			//works when the length of the string is just one character
			for(int i=0; i<n; i++){
				//return str;
				result = str;
				System.out.println(result);
			}
			//works when n is less than the length of a string:
	}else if(str.length() >= n){
			
			for(int i=0; i<n; i++){
				
				int n2 = (str.length()) - n;
				System.out.println(str.substring(n2));
				
			//	return str.substring(n2);
				
				//System.out.println(str);
				 result = str.substring(n2);
			//	return result;
			}
			//works when n is bigger than the length of string.
	}/*else if(str.length() < n){
		System.out.println("string is too small for number fool!");
		return result;
	}
		
		
			
			return result;
	}*/
		//this code works but will not pass the coding bat challenge because
		//the other strings do not show up in the run results: in other words,
		//the duplicate strings do not appear on the same line.
			
	
		StringBuilder sb = new StringBuilder(n * str.length());
		
		String result2 = "";
		
		if(str.length() < n){
				//works when the length of the string is just one character
				for(int i=0; i<n; i++){
					//return str;
					sb.append(str);
					//System.out.println(sb.append(str));		
				}
				System.out.println(sb.toString());
				return  sb.toString();
				//works when n is less than the length of a string:
		}else if(str.length() >= n){//if the length is bigger than n, run this code
				//this for loop runs a different condition so as long as the index is 
				//smaller than n
				for(int i=0; i<n; i++){
					//this part uses a variable to store the length of the
					//string minus n in order to get the remaining number
					//of indexes in the string
					int n2 = (str.length()) - n;
					//store this result in a variable that will have the substring
					//based on the new index number from n2.  This is what gives us
					//the last numbers of the string
					 result2 = str.substring(n2);
					 
					 //add the new string using the string builder
					sb.append(result2);
				//	System.out.println(sb.append(result));
					
				//	return str.substring(n2);
					
					//System.out.println(str);	
					
				}
				System.out.println(sb.toString());
				return sb.toString();//turn the string builder into a string
		}
			System.out.println(sb.toString());
			return sb.toString();
	}
		
	//the above code works in the coding bat test cases because it 
	//produces the output on the same line.  
	
	public static void main(String[] args) {
		
		String str = "HelloEveryoneThere";
		int n = 4;
		
		RepeatEnd.repeatEnd(str, n);
		
	//	System.out.println(repeatEnd(str, n));
		

	}

}
