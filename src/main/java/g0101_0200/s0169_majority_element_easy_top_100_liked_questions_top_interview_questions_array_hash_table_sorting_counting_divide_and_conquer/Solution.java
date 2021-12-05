package g0101_0200.s0169_majority_element_easy_top_100_liked_questions_top_interview_questions_array_hash_table_sorting_counting_divide_and_conquer;

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
