package g2501_2600.s2546_apply_bitwise_operations_to_make_strings_equal;

// #Medium #String #Bit_Manipulation #2023_08_15_Time_0_ms_(100.00%)_Space_44.3_MB_(87.14%)

public class Solution {
    public boolean makeStringsEqual(String s, String target) {
        return s.contains("1") == target.contains("1");
    }
}
