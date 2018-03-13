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
		
		//since the method has a return type of an int, it has to return an int,
		//in this case the "centered average" of the int array.
		
//		int min = nums[0];
//		int max = nums[nums.length-1];
//		int value = 0;
		int sum = 0;
		int avg = 0;
	//	int [] arr = new int[nums.length];
		
		for(int i = 0; i<nums.length; i++){
		//	min = nums[i];
		//	max = nums[i];
			System.out.println(nums[i]);
			for(int j =0; j<nums.length-1-i; j++){
				if(nums[j] > nums[j+1]){
					int	tmp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tmp;
					///the bubble sort is not working
					//it didn't work because i had nums[j-1] in the if statement
				}
				System.out.println(Arrays.toString(nums));
			}
			
	/*		if(nums[i] < min ){
				min = nums[i];	
			}
			
			if(nums[i] > max){
				max = nums[i];
				//System.out.println(max);
			} */
			
			
		/*	if(nums[i] < nums[nums.length-1]){
				value = nums[i];
				sum = value + value;
				avg = sum/nums.length;
				System.out.println(value + " This is a test");
				System.out.println(sum + " I hope this is right");
				System.out.println(avg + " Is this correct?");
				//this is not working right because it is multiplying each element
				//of the nums array by the array length instead of adding up the
				//sum of the total array
			} */
			
	/*		if(min < i){
			//	System.out.println(i);
				min = nums[i];	
			//	System.out.println(min);
			}
			
			if(max > i){
				max = nums[i];
				
			} */
			
		/*	if(nums[i]==min){
				min = 0;
			}
			
			if(nums[i]==max){
				max = 0;
			} */
			
			//I figure that if the max and min values equal zero, when the program
			//goes to add up and divide the rest of the array elements, it won't count
			//these extreme values.
			
			//Arrays are fixed once they are created; I will need to
			//make a new array without the min and max elements.
			
	/*		if(min == nums[i]){
				
			//	nums[0] = nums[i + 1];
			//	int[] arr = {nums[i + 1], };
				
			//	nums = arr;
				
				
			//	nums[0] = nums[i + 1];
			//	System.out.println(Arrays.toString(nums));
			//	System.out.println(Arrays.toString(arr));
				//trying to create a new array without the min and max
				//numbers so that I can get the average without them.
				
				
			//try to put array into an arraylist in order to change the length of the 
			//elements to eliminate the largest and smallest values.  Then convert the 
			//arraylist object back into an array.	
				
			} */
		}
		//converts array into an array list:
		ArrayList<Integer> intList = new ArrayList<Integer>();	
		for(int i : nums){
			intList.add(i);
			
		}
		
		System.out.println(intList.size());
		
		int last = nums.length - 2;
		//returns an out of bounds error when I use the remove method:
		intList.remove(0);
		intList.remove(last);
		System.out.println(intList);
		System.out.println(intList.size());
	//	System.out.println(min);
	//	System.out.println(max);
		
		for(int i : intList){
			sum += i;		
		}
		
		//System.out.println(sum);
		
		avg = sum/intList.size();
		System.out.println(avg);
		
		//give me the average but not the center average.  Need to round it down to the
		//nearest value in the array.  
		
		return avg;
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 100};
		
		CenteredAverage.centeredAverage(nums);
		
	//	System.out.println(centeredAverage(nums));

	}

}
