package g2801_2900.s2899_last_visited_integers;

// #Easy #Array #String #Simulation #2023_12_20_Time_2_ms_(96.41%)_Space_44.5_MB_(5.24%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<String> prevEle = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i).equals("prev")) {
                count = 0;
                prevEle.add(words.get(i));
                continue;
            }
            if (count >= prevEle.size()) {
                res.add(-1);
            } else {
                res.add(Integer.parseInt(prevEle.get(prevEle.size() - count - 1)));
            }
            count++;
        }
        return res;
    }
}
