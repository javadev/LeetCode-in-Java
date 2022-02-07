package g0801_0900.s0846_hand_of_straights;

// #Medium #Array #Hash_Table #Sorting #Greedy

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if (len % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : hand) {
            int cnt = map.getOrDefault(num, 0);
            map.put(num, ++cnt);
        }

        for (int num : hand) {
            int cnt = map.get(num);
            if (cnt <= 0) {
                continue;
            }
            map.put(num, --cnt);

            int loop = 1;
            while (loop < groupSize) {
                int curCnt = map.getOrDefault(num + loop, 0);
                if (curCnt <= 0) {
                    return false;
                }
                map.put(num + loop, --curCnt);
                ++loop;
            }
        }

        return true;
    }
}
