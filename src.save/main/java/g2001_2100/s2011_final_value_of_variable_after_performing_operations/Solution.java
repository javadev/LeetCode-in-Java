package g2001_2100.s2011_final_value_of_variable_after_performing_operations;

// #Easy #Array #String #Simulation #2022_05_23_Time_1_ms_(94.40%)_Space_43.6_MB_(26.15%)

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int xValue = 0;
        for (String word : operations) {
            if (word.contains("+")) {
                xValue++;
            } else {
                xValue--;
            }
        }
        return xValue;
    }
}
