package g0401_0500.s0476_number_complement;

// #Easy #Bit_Manipulation #Acceptance_66.8% #2022_03_18_Time_0_ms_(100.00%)_Space_41.7_MB_(9.65%)

public class Solution {
    public int findComplement(int num) {
        return ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}
