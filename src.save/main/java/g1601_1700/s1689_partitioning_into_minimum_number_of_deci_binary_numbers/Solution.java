package g1601_1700.s1689_partitioning_into_minimum_number_of_deci_binary_numbers;

// #Medium #String #Greedy #2022_04_15_Time_5_ms_(93.98%)_Space_43.1_MB_(83.89%)

public class Solution {
    public int minPartitions(String n) {
        char[] tempArray = n.toCharArray();
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result = Math.max(result, tempArray[i] - 48);
        }
        return result;
    }
}
