package src.com.project4.arrays;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class BigDiff {

	public int bigDiff(int[] nums){
		int diff = 0;
		int max = nums[0]; //stores the max value OUTSIDE of the for loops so the value does not get reassigned
		int min = nums[0]; //stores the min value outside of for loop so value is not reassigned.
		
		for(int i=0; i<nums.length; i++){
			if(nums[i] > max){//the nums[] array element has to be bigger than the max value in order to find the largest value in the array!
				max = max(max, nums[i]); //takes the max variable as a starting point and compares it to the nums[i] element in the array to see which is larger.	
			}
			
			if(nums[i] < min){//the nums[] array element has to be smaller than the min value in order to find the smallest value
				min = min(min, nums[i]); //takes the min variable as a starting point and compares it to the nums[i] element in the array to see which is smaller.
			}
			//the max value is always going to be bigger than the min value
			if(max > min){
				diff = max - min;
			}
		}
	
		System.out.println(diff);
		return diff;
}
		
	public static void main(String[] args) {

		BigDiff yay = new BigDiff();
		int[] arr = {2, 10, 7, 2};
		yay.bigDiff(arr);
	}

}
