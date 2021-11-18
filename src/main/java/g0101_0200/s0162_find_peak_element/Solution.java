package g0101_0200.s0162_find_peak_element;

public class Solution {
	  public int findPeakElement(int[] nums) {     
	        int start = 0;
			int end = nums.length -1 ;
			
			while(start<end) {
				 //This is done because start and end might be big numbers, so it might exceed the integer limit.
				int mid =  start + ((end-start)/2);
				
				if(nums[mid+1] > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid;
				}
			}
			
			return start;
	    }
}
