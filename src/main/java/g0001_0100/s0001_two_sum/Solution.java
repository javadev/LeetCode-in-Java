package g0001_0100.s0001_two_sum;

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table
// #Data_Structure_I_Day_2_Array #Level_1_Day_13_Hashmap #Udemy_Arrays #Top_Interview_150_Hashmap
// #Big_O_Time_O(n)_Space_O(n) #AI_can_be_used_to_solve_the_task
// #2024_11_09_Time_2_ms_(98.90%)_Space_44.9_MB_(47.05%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            Integer requiredNum = target - numbers[i];
            if (indexMap.containsKey(requiredNum)) {
                return new int[] {indexMap.get(requiredNum), i};
            }
            indexMap.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }
}
