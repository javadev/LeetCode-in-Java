package g3101_3200.s3137_minimum_number_of_operations_to_make_word_k_periodic;

// #Medium #String #Hash_Table #Counting #2024_05_07_Time_19_ms_(99.53%)_Space_45.5_MB_(66.25%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = word.length();
        int max = 0;
        for (int i = 0; i < n; i += k) {
            int hash = 0;
            for (int j = i; j < i + k; j++) {
                int idx = word.charAt(j) - 'a';
                hash = hash * 26 + idx;
            }
            int count = map.getOrDefault(hash, 0);
            count++;
            map.put(hash, count);
            max = Math.max(max, count);
        }
        return n / k - max;
    }
}
