package g0701_0800.s0710_random_pick_with_blacklist;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final Map<Integer, Integer> map;
    private final SecureRandom r;
    private final int upperLimit;

    public Solution(int n, int[] blacklist) {
        map = new HashMap<>();
        r = new SecureRandom();
        upperLimit = n - blacklist.length;
        for (int val : blacklist) {
            map.put(val, -1);
        }
        int j = n - 1;
        for (int val : blacklist) {
            if (val < upperLimit) {
                while (map.containsKey(j)) {
                    j--;
                }
                map.put(val, j);
                j--;
            }
        }
    }

    public int pick() {
        int val = r.nextInt(upperLimit);
        if (map.containsKey(val)) {
            return map.get(val);
        }
        return val;
    }
}
