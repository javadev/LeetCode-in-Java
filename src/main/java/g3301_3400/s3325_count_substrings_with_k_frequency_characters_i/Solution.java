package g3301_3400.s3325_count_substrings_with_k_frequency_characters_i;

// #Medium #2024_10_21_Time_2009_ms_(100.00%)_Space_45.2_MB_(100.00%)

import java.util.HashMap;
import java.util.PriorityQueue;

public class Solution {
    public int numberOfSubstrings(String s, int k) {
        int charCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
            for (char ele : map.keySet()) {
                queue.offer(map.get(ele));
            }
            HashMap<Character, Integer> currMap = new HashMap<>(map);
            for (int left = 0; left <= right; left++) {
                int maxEle = queue.peek();
                if (maxEle < k) {
                    break;
                }
                charCount += 1;
                char leftChar = s.charAt(left);
                int leftCharCount = currMap.get(leftChar);
                currMap.put(leftChar, leftCharCount - 1);
                queue.remove(leftCharCount);
                if (leftCharCount > 1) {
                    queue.offer(leftCharCount - 1);
                }
            }
        }
        return charCount;
    }
}
