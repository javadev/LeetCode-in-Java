package s0026.remove.duplicates.from.sorted.array;

public class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int i = 0;
        int j = 1;
        if (n <= 1) {
            return n;
        }
        while (j <= n - 1) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }

        return i + 1;
    }
}
