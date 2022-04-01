package g1301_1400.s1324_print_words_vertically;

// #Medium #Array #String #Simulation #2022_03_19_Time_1_ms_(90.59%)_Space_42.3_MB_(43.21%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int columnMax = 0;
        for (String word : words) {
            columnMax = Math.max(columnMax, word.length());
        }
        char[][] matrix = new char[words.length][columnMax];
        for (int i = 0; i < words.length; i++) {
            int j = 0;
            for (; j < words[i].length(); j++) {
                matrix[i][j] = words[i].charAt(j);
            }
            while (j < columnMax) {
                matrix[i][j++] = '#';
            }
        }
        List<String> result = new ArrayList<>();
        for (int j = 0; j < columnMax; j++) {
            StringBuilder sb = new StringBuilder();
            for (char[] chars : matrix) {
                if (chars[j] != '#') {
                    sb.append(chars[j]);
                } else {
                    sb.append(' ');
                }
            }
            String str = sb.toString();
            int k = str.length() - 1;
            while (k >= 0 && str.charAt(k) == ' ') {
                k--;
            }
            result.add(str.substring(0, k + 1));
            sb.setLength(0);
        }
        return result;
    }
}
