package g0901_1000.s0936_stamping_the_sequence;

// #Hard #String #Greedy #Stack #Queue #2022_03_30_Time_6_ms_(78.43%)_Space_45.6_MB_(27.45%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] movesToStamp(String stamp, String target) {
        List<Integer> moves = new ArrayList<>();
        char[] s = stamp.toCharArray();
        char[] t = target.toCharArray();
        int stars = 0;
        boolean[] visited = new boolean[target.length()];
        while (stars < target.length()) {
            boolean doneReplace = false;
            for (int i = 0; i <= target.length() - stamp.length(); i++) {
                if (!visited[i] && canReplace(t, i, s)) {
                    stars = doReplace(t, i, s, stars);
                    doneReplace = true;
                    visited[i] = true;
                    moves.add(i);
                    if (stars == t.length) {
                        break;
                    }
                }
            }
            if (!doneReplace) {
                return new int[0];
            }
        }

        int[] result = new int[moves.size()];
        for (int i = 0; i < moves.size(); i++) {
            result[i] = moves.get(moves.size() - i - 1);
        }
        return result;
    }

    private boolean canReplace(char[] t, int i, char[] s) {
        for (int j = 0; j < s.length; j++) {
            if (t[i + j] != '*' && t[i + j] != s[j]) {
                return false;
            }
        }
        return true;
    }

    private int doReplace(char[] t, int i, char[] s, int stars) {
        for (int j = 0; j < s.length; j++) {
            if (t[i + j] != '*') {
                t[i + j] = '*';
                stars++;
            }
        }
        return stars;
    }
}
