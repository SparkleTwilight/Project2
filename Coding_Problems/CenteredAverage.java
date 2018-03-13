package src.com.project4.arrays;
import java.util.Arrays;
//import java.util.List;
import java.util.ArrayList;

public class CenteredAverage {
	
	/*Return the "centered" average of an array of ints, which we'll say is the 
	 *mean average of the values, except ignoring the largest and smallest values 
	 *in the array. If there are multiple copies of the smallest value, ignore just 
	 *one copy, and likewise for the largest value. Use int division to produce the 
	 *final average. You may assume that the array is length 3 or more.

	centeredAverage([1, 2, 3, 4, 100]) → 3
	centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
	centeredAverage([-10, -4, -2, -4, -2, 0]) → -3 */

	static public int centeredAverage(int[] nums){
		/*1. Array has to be sorted to determine which value is the smallest and which value
		 * 	 is the largest
		 *2. If an index is the highest or lowest value, keep them in separate variables and 
		 *	 write it so that they do not count towards the final calculation.
		 *3. If there are multiple copies of the lowest or highest value, only ignore the first 
		 *	 appearance of it.
		 *4. Add up the remaining indexes in the array and divide them by those remaining indexes
		 *	 that are not the largest or smallest values of the array. 
		 *5. Array has to have a length of at least 3. 
		 * */
		
		
		int sum = 0;
		int avg = 0;
	
		
		for(int i = 0; i<nums.length; i++){
		
			System.out.println(nums[i]);
			for(int j =0; j<nums.length-1-i; j++){
				if(nums[j] > nums[j+1]){
					int	tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
					
				}
				
			}
			
	
		}
		//converts array into an array list:
		ArrayList<Integer> intList = new ArrayList<Integer>();	
		for(int i : nums){
			intList.add(i);
			
		}
		
			
		int last = nums.length - 2;
		
		intList.remove(0);
		intList.remove(last);
		
			
		for(int i : intList){
			sum += i;		
		}
		
		
		avg = sum/intList.size();
		
	
		return avg;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 100};
		
		CenteredAverage.centeredAverage(nums);
		
	// expected result: 3

	}

}
