package g3401_3500.s3412_find_mirror_score_of_a_string;

// #Medium #String #Hash_Table #Stack #Simulation #2025_01_07_Time_12_(99.54%)_Space_45.78_(74.26%)

import java.util.ArrayList;

public class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        ArrayList<Integer>[] st = new ArrayList[26];
        long r = 0;
        for (int i = 0; i < 26; i++) {
            st[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int mc = 'z' - (s.charAt(i) - 'a');
            int p = mc - 'a';
            if (!st[p].isEmpty()) {
                r += i - st[p].remove(st[p].size() - 1);
            } else {
                st[s.charAt(i) - 'a'].add(i);
            }
        }
        return r;
    }
}
