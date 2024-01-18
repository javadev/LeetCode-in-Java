package g0601_0700.s0691_stickers_to_spell_word;

// #Hard #Array #String #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_03_22_Time_34_ms_(70.23%)_Space_54.1_MB_(35.88%)

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    // count the characters of every sticker
    private int[][] counts;
    // For each character, save the sticker index which has this character
    private HashMap<Character, HashSet<Integer>> map = new HashMap<>();
    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int minStickers(String[] stickers, String target) {
        counts = new int[stickers.length][26];
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), new HashSet<>());
        }
        for (int i = 0; i < stickers.length; i++) {
            for (char c : stickers[i].toCharArray()) {
                counts[i][c - 'a']++;
                map.get(c).add(i);
            }
        }
        int res = dp(0, target);
        if (res > target.length()) {
            return -1;
        }
        return res;
    }

    private int dp(int bits, String target) {
        int len = target.length();
        if (bits == (1 << len) - 1) {
            // all bits are 1
            return 0;
        }
        if (cache.containsKey(bits)) {
            return cache.get(bits);
        }
        int index = 0;
        // find the first bit which is 0
        for (int i = 0; i < len; i++) {
            if ((bits & (1 << i)) == 0) {
                index = i;
                break;
            }
        }
        // In worst case, each character use 1 sticker. So, len + 1 means impossible
        int res = len + 1;
        for (int key : map.get(target.charAt(index))) {
            int[] count = counts[key].clone();
            int mask = bits;
            for (int i = index; i < len; i++) {
                if ((mask & (1 << i)) != 0) {
                    // this bit has already been 1
                    continue;
                }
                char c = target.charAt(i);
                if (count[c - 'a'] > 0) {
                    count[c - 'a']--;
                    mask |= (1 << i);
                }
            }
            int val = dp(mask, target) + 1;
            res = Math.min(res, val);
        }
        cache.put(bits, res);
        return res;
    }
}
