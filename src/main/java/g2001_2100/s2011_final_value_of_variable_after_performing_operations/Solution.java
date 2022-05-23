package g2001_2100.s2011_final_value_of_variable_after_performing_operations;

// #Easy #Array #String #Simulation #2021_10_26_Time_2_ms_(36.12%)_Space_40.1_MB_(100%)

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int xValue = 0;
        for (String word : operations) {
            if (word.contains("+")) xValue++;
            else xValue--;
        }
        return xValue;
    }
}
