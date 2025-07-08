package g3401_3500.s3433_count_mentions_per_user;

// #Medium #Array #Math #Sorting #Simulation #2025_01_28_Time_12_ms_(99.94%)_Space_45.54_MB_(94.71%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] ans = new int[numberOfUsers];
        List<Integer> l = new ArrayList<>();
        int c = 0;
        for (List<String> strings : events) {
            String s = strings.get(0);
            String ss = strings.get(2);
            if (s.equals("MESSAGE")) {
                if (ss.equals("ALL") || ss.equals("HERE")) {
                    c++;
                    if (ss.equals("HERE")) {
                        l.add(Integer.parseInt(strings.get(1)));
                    }
                } else {
                    String[] sss = ss.split(" ");
                    for (String string : sss) {
                        int jj = Integer.parseInt(string.substring(2));
                        ans[jj]++;
                    }
                }
            }
        }
        for (List<String> event : events) {
            if (event.get(0).equals("OFFLINE")) {
                int id = Integer.parseInt(event.get(2));
                int a = Integer.parseInt(event.get(1)) + 60;
                for (Integer integer : l) {
                    if (integer >= a - 60 && integer < a) {
                        ans[id]--;
                    }
                }
            }
        }
        for (int i = 0; i < numberOfUsers; i++) {
            ans[i] += c;
        }
        return ans;
    }
}
