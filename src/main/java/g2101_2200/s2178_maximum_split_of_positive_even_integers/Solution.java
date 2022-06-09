package g2101_2200.s2178_maximum_split_of_positive_even_integers;

// #Medium #Math #Greedy #2022_06_09_Time_16_ms_(78.96%)_Space_116.4_MB_(68.86%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        long curr = 2;
        long remainingSum = finalSum;
        List<Long> result = new ArrayList<>();
        if (finalSum % 2 != 0) {
            return result;
        }
        while (remainingSum >= curr) {
            result.add(curr);
            remainingSum = remainingSum - curr;
            curr += 2;
        }
        /*
        go greedily by starting from smallest even number
        for target = 16 after the while loop
        remainingSum = 4
        curr = 8 (if we add 8 it exceeds the target 16)
        result = [2,4,6]
        so remove 6 from list and add it to remainigSum and insert to list
        result = [2,4,10]
        */
        long lastSum = result.get(result.size() - 1);
        result.remove(result.size() - 1);
        result.add(lastSum + remainingSum);
        return result;
    }
}
