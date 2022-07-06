package g1001_1100.s1009_complement_of_base_10_integer;

// #Easy #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_02_21_Time_1_ms_(41.56%)_Space_41.5_MB_(5.09%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n & 1);
            n >>= 1;
        }
        int result = 0;
        int exp = list.size() - 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 0) {
                result += Math.pow(2, exp);
            }
            exp--;
        }
        return result;
    }
}
