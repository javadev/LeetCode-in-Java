package g0201_0300.s0201_bitwise_and_of_numbers_range;

// #Medium #Bit_Manipulation #Algorithm_II_Day_19_Bit_Manipulation
// #Top_Interview_150_Bit_Manipulation #2025_03_09_Time_3_ms_(100.00%)_Space_43.70_MB_(94.56%)

public class Solution {
    private static final int[] MASKS =
            new int[] {
                0,
                0x80000000,
                0xC0000000,
                0xE0000000,
                0xF0000000,
                0xF8000000,
                0xFC000000,
                0xFE000000,
                0xFF000000,
                0xFF800000,
                0xFFC00000,
                0xFFE00000,
                0xFFF00000,
                0xFFF80000,
                0xFFFC0000,
                0xFFFE0000,
                0xFFFF0000,
                0xFFFF8000,
                0xFFFFC000,
                0xFFFFE000,
                0xFFFFF000,
                0xFFFFF800,
                0xFFFFFC00,
                0xFFFFFE00,
                0xFFFFFF00,
                0xFFFFFF80,
                0xFFFFFFC0,
                0xFFFFFFE0,
                0xFFFFFFF0,
                0xFFFFFFF8,
                0xFFFFFFFC,
                0xFFFFFFFE
            };

    public int rangeBitwiseAnd(int left, int right) {
        return left == right ? left : right & MASKS[Integer.numberOfLeadingZeros(left ^ right)];
    }
}
