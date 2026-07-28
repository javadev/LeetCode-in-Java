package g3801_3900.s3866_first_unique_even_element;

// #Easy #Array #Hash_Table #Counting #Mid_Level #Biweekly_Contest_178
// #2026_07_28_Time_1_ms_(99.26%)_Space_46.46_MB_(18.62%)

public class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] arr = new int[100];
        for (int num : nums) {
            arr[num - 1]++;
        }

        for (int num : nums) {
            if (num % 2 == 0 && (arr[num - 1] == 1)) {
                return num;
            }
        }
        return -1;
    }
}
