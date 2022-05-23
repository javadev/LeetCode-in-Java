package g2001_2100.s2011_final_value_of_variable_after_performing_operations;

// #Easy #Array #String #Simulation #2021_10_26_Time_2_ms_(36.12%)_Space_40.1_MB_(100%)

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c1 = 0, c2 = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) ++c1;
            else ++c2;
        }
        return c2 - c1;
    }
}
