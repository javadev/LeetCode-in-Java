package g0101_0200.s0169_majority_element;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Sorting #Counting
// #Divide_and_Conquer

public class Solution {
    public int majorityElement(int[] arr) {
        int count = 1;
        int majority = arr[0];
        // For Potential Majority Element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == majority) {
                count++;
            } else {
                if (count > 1) {
                    count--;
                } else {
                    majority = arr[i];
                }
            }
        }

        // For Confirmation
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majority) {
                count++;
            }
        }

        if (count >= (arr.length / 2) + 1) {
            return majority;
        } else {
            return -1;
        }
    }
}
