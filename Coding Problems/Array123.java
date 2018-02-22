package src.com.project4.arrays;
import java.util.Arrays;

public class Array123 {

	
	/*Given an array of ints, return true if the sequence of 
	 *numbers 1, 2, 3 appears in the array somewhere.
		array123([1, 1, 2, 3, 1]) → true
		array123([1, 1, 2, 4, 1]) → false
		array123([1, 1, 2, 1, 2, 3]) → true*/
	
	static public boolean array123(int[] nums){
		
		/*Need to specify if an index in a number starts with 1
		 * and if so, if the next number following it is a two and 
		 * if so, check to see if the last number is a three and if so,
		 * return true.
		 * */
	
	
		
		if(nums.length <= 2){
			System.out.println("false");
			return false;
		}
		
	
		if(nums.length >=3){
	
			for(int i = 0; i<nums.length-1; i++){
				if(nums[i] == 1 && nums[i+1]== 2 && nums[i+2] == 3){
					System.out.println(Arrays.toString(nums));
					System.out.println("true");
					return true;
				}
			}
		}
					
		
		System.out.println(Arrays.toString(nums));
		System.out.println("false");
		return false;
		
		
	}
	
	
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,1}; 	

		Array123.array123(nums);
		
		

	}

}
