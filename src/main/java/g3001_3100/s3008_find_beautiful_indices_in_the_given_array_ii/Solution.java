package g3001_3100.s3008_find_beautiful_indices_in_the_given_array_ii;

// #Hard #String #Binary_Search #Two_Pointers #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_27_Time_36_ms_(99.66%)_Space_67.9_MB_(99.32%)

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        int[] lpsA = getLps(a);
        int[] lpsB = getLps(b);
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> matchesA = new ArrayDeque<>();
        int n = s.length();
        int aLen = a.length();
        int bLen = b.length();
        int i = 0;
        int j = 0;
        while (i < n) {
            if (s.charAt(i) == a.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lpsA[j - 1];
                }
            }
            if (j == aLen) {
                int aStart = i - aLen;
                matchesA.offer(aStart);
                j = lpsA[aLen - 1];
            }
        }
        i = j = 0;
        while (i < n && !matchesA.isEmpty()) {
            if (s.charAt(i) == b.charAt(j)) {
                i++;
                j++;
            } else {
                if (j == 0) {
                    i++;
                } else {
                    j = lpsB[j - 1];
                }
            }
            if (j == bLen) {
                int bStart = i - bLen;
                j = lpsB[bLen - 1];

                while (!matchesA.isEmpty() && bStart - matchesA.peek() > k) {
                    matchesA.poll();
                }
                while (!matchesA.isEmpty() && Math.abs(matchesA.peek() - bStart) <= k) {
                    ans.add(matchesA.poll());
                }
            }
        }
        return ans;
    }

    private int[] getLps(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int i = 1;
        int prevLps = 0;
        while (i < n) {
            if (s.charAt(i) == s.charAt(prevLps)) {
                prevLps++;
                lps[i++] = prevLps;
            } else {
                if (prevLps == 0) {
                    lps[i++] = 0;
                } else {
                    prevLps = lps[prevLps - 1];
                }
            }
        }
        return lps;
    }
}
