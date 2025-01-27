package g3401_3500.s3433_count_mentions_per_user;

// #Medium #Array #Math #Sorting #Simulation #2025_01_27_Time_29_(100.00%)_Space_45.65_(100.00%)

import java.util.List;

public class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        events.sort(
                (a, b) -> {
                    int time1 = Integer.parseInt(a.get(1));
                    int time2 = Integer.parseInt(b.get(1));
                    if (time1 == time2
                            && a.get(0).equals("OFFLINE")
                            && b.get(0).equals("MESSAGE")) {
                        return -1;
                    }
                    return Integer.parseInt(a.get(1)) - Integer.parseInt(b.get(1));
                });
        int[] ans = new int[numberOfUsers];
        int[] usertimestamp = new int[numberOfUsers];
        for (List<String> event : events) {
            String msg = event.get(0);
            int time = Integer.parseInt(event.get(1));
            if (msg.equals("OFFLINE")) {
                usertimestamp[Integer.parseInt(event.get(2))] = time + 60;
            } else {
                String mentionsString = event.get(2);
                if (mentionsString.equals("ALL")) {
                    for (int i = 0; i < numberOfUsers; i++) {
                        ans[i]++;
                    }
                } else if (mentionsString.equals("HERE")) {
                    for (int i = 0; i < numberOfUsers; i++) {
                        if (usertimestamp[i] <= time) {
                            ans[i]++;
                        }
                    }
                } else {
                    for (String id : event.get(2).split(" ")) {
                        int curr = Integer.parseInt(id.substring(2));
                        ans[curr]++;
                    }
                }
            }
        }
        return ans;
    }
}
