package g3401_3500.s3433_count_mentions_per_user;

// #Medium #Array #Math #Sorting #Simulation #2025_01_28_Time_12_ms_(99.94%)_Space_45.54_MB_(94.71%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] ans = new int[numberOfUsers];
        List<Integer> l = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < events.size(); i++) {
            String s = events.get(i).get(0);
            String ss = events.get(i).get(2);
            if (s.equals("MESSAGE")) {
                if (ss.equals("ALL") || ss.equals("HERE")) {
                    c++;
                    if (ss.equals("HERE")) {
                        l.add(Integer.parseInt(events.get(i).get(1)));
                    }
                } else {
                    String[] sss = ss.split(" ");
                    for (int j = 0; j < sss.length; j++) {
                        int jj = Integer.parseInt(sss[j].substring(2, sss[j].length()));
                        ans[jj]++;
                    }
                }
            }
        }
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).get(0).equals("OFFLINE")) {
                int id = Integer.parseInt(events.get(i).get(2));
                int a = Integer.parseInt(events.get(i).get(1)) + 60;
                for (int j = 0; j < l.size(); j++) {
                    if (l.get(j) >= a - 60 && l.get(j) < a) {
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
