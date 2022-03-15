package g0301_0400.s0331_verify_preorder_serialization_of_a_binary_tree;

// #Medium #String #Tree #Binary_Tree #Stack #2022_03_15_Time_3_ms_(94.01%)_Space_42.7_MB_(58.33%)

public class Solution {
    public boolean isValidSerialization(String preorder) {
        int count = 1;
        int length = preorder.length();
        for (int i = 1; i <= length; i++) {
            if (i == length || preorder.charAt(i) == ',') {
                --count;
                if (count < 0) {
                    return false;
                }
                count += preorder.charAt(i - 1) == '#' ? 0 : 2;
            }
        }
        return count == 0;
    }
}
