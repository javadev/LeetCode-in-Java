package g0801_0900.s0868_binary_gap;

// #Easy #Math #Bit_Manipulation #2022_03_27_Time_3_ms_(9.45%)_Space_41.4_MB_(24.80%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        List<Integer> oneIndexes = new ArrayList<>();
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                oneIndexes.add(i);
            }
        }
        int maxGap = 0;
        for (int i = 0; i < oneIndexes.size() - 1; i++) {
            maxGap = Math.max(oneIndexes.get(i + 1) - oneIndexes.get(i), maxGap);
        }
        return maxGap;
    }
}
