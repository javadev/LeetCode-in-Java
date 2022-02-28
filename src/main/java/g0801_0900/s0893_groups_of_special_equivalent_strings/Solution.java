package g0801_0900.s0893_groups_of_special_equivalent_strings;

// #Easy #Array #Math #Matrix #Geometry

import java.util.HashSet;

public class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> set = new HashSet<>();
        int result = 0;
        for (String str : words) {
            if (set.add(getHashBySwap(str.toCharArray()))) {
                result++;
            }
        }
        return result;
    }

    private String getHashBySwap(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            int j = i + 2;
            while (j < chars.length) {
                if (chars[i] > chars[j]) {
                    char temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                }
                j += 2;
            }
        }
        return String.valueOf(chars);
    }
}
