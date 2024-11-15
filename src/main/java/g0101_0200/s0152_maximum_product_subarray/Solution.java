package g0101_0200.s0152_maximum_product_subarray;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Dynamic_Programming_I_Day_6 #Level_2_Day_13_Dynamic_Programming #Udemy_Dynamic_Programming
// #Big_O_Time_O(N)_Space_O(1) #2024_11_15_Time_1_ms_(92.74%)_Space_45_MB_(23.41%)

public class Solution {
    public int maxProduct(int[] nums) {
        int m=Integer.MIN_VALUE;
        int n=nums.length;
        int start=1;
        int end=1;
        for(int i=0;i<n;i++){
            if(start==0)
                start=1;
            if (end==0)
                end=1;
            start=start*nums[i];
            end=end*nums[n-i-1];
            m=Math.max(m,Math.max(start,end));

        }
        return m;
    }
}
