package g2401_2500.s2405_optimal_partition_of_string;

// #Medium #String #Hash_Table #Greedy #2022_10_23_Time_7_ms_(99.40%)_Space_43.3_MB_(91.63%)

public class Solution {
    public int partitionString(String s) {
        int count = 1;
        boolean[] arr = new boolean[26];
        for (char c : s.toCharArray()) {
            if (arr[c - 'a']) {
                count++;
                arr = new boolean[26];
            }
            arr[c - 'a'] = true;
        }
        return count;
    }
}
