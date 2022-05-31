package g2101_2200.s2109_adding_spaces_to_a_string;

// #Medium #Array #String #Simulation #2022_05_31_Time_24_ms_(89.33%)_Space_94.5_MB_(48.03%)

public class Solution {
    public String addSpaces(String string, int[] spaces) {
        char[] stringChars = new char[string.length() + spaces.length];
        for (int i = 0; i < spaces.length; i++) {
            stringChars[spaces[i] + i] = ' ';
        }

        int equivalentIndex = -1;
        int i = 0;
        while (i < string.length()) {
            equivalentIndex++;
            if (stringChars[equivalentIndex] == ' ') {
                i--;
            } else {
                stringChars[equivalentIndex] = string.charAt(i);
            }
            i++;
        }
        return new String(stringChars);
    }
}
