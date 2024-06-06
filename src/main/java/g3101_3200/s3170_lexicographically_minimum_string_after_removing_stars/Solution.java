package g3101_3200.s3170_lexicographically_minimum_string_after_removing_stars;

// #Medium #String #Hash_Table #Greedy #Stack #Heap_Priority_Queue
// #2024_06_06_Time_29_ms_(99.93%)_Space_45.6_MB_(92.80%)

import java.util.Arrays;

public class Solution {
    public String clearStars(String s) {
        char[] arr = s.toCharArray();
        int[] idxChain = new int[arr.length];
        int[] lastIdx = new int[26];
        Arrays.fill(idxChain, -1);
        Arrays.fill(lastIdx, -1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*') {
                for (int j = 0; j < 26; j++) {
                    if (lastIdx[j] != -1) {
                        arr[lastIdx[j]] = '#';
                        lastIdx[j] = idxChain[lastIdx[j]];
                        break;
                    }
                }
                arr[i] = '#';
            } else {
                idxChain[i] = lastIdx[arr[i] - 'a'];
                lastIdx[arr[i] - 'a'] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '#') sb.append(c);
        }
        return sb.toString();
    }
}
