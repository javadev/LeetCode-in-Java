package g1401_1500.s1431_kids_with_the_greatest_number_of_candies;

// #Easy #Array #2022_03_28_Time_1_ms_(84.43%)_Space_43.3_MB_(19.35%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
