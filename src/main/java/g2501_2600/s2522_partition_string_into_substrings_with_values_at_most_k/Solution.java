package g2501_2600.s2522_partition_string_into_substrings_with_values_at_most_k;

// #Medium #String #Dynamic_Programming #Greedy #2023_04_18_Time_6_ms_(84.66%)_Space_43_MB_(76.70%)

public class Solution {
    public int minimumPartition(String s, int k) {
        if (k == 9) {
            return s.length();
        }
        int partitions = 1;
        long partitionValue = 0;
        long digit;
        for (int i = 0; i < s.length(); i++) {
            digit = (long) s.charAt(i) - '0';
            if (digit > k) {
                return -1;
            }
            partitionValue = partitionValue * 10 + digit;
            if (partitionValue > k) {
                partitionValue = digit;
                partitions++;
            }
        }
        return partitions;
    }
}
