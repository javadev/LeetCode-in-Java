package g1701_1800.s1785_minimum_elements_to_add_to_form_a_given_sum;

// #Medium #Array #Greedy #2022_04_30_Time_2_ms_(70.75%)_Space_82.5_MB_(57.55%)

public class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long diff = Math.abs(goal - sum);
        return diff % limit == 0 ? (int) (diff / limit) : (int) ((diff / limit) + 1);
    }
}
