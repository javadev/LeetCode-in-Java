package g3301_3400.s3399_smallest_substring_with_identical_characters_ii;

// #Hard #2024_12_24_Time_11_ms_(100.00%)_Space_45.7_MB_(54.55%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int minLength(String s, int numOps) {
        int l = s.length();
        int lingyi = 0;
        int yiling = 0;
        List<Integer> pq = new ArrayList<>();
        char thisone = s.charAt(0);
        int chang = 1;
        if (thisone == '0') {
            yiling++;
        } else {
            lingyi++;
        }
        for (int i = 1; i < l; i++) {
            char cur = s.charAt(i);
            if (cur == thisone) {
                chang++;
            } else {
                if (chang >= 2) {
                    pq.add(chang);
                }
                chang = 1;
                thisone = cur;
            }
            if (i % 2 == 0) {
                if (cur == '0') {
                    yiling++;
                } else {
                    lingyi++;
                }
            } else {
                if (cur == '0') {
                    lingyi++;
                } else {
                    yiling++;
                }
            }
        }
        if (numOps >= lingyi || numOps >= yiling) {
            return 1;
        }
        if (chang >= 2) {
            pq.add(chang);
        }
        int one = -1;
        int two = -1;
        for (int cur : pq) {
            if (cur > one) {
                two = one;
                one = cur;
            } else if (cur > two) {
                two = cur;
            }
        }
        if (two == -1) {
            return one / (numOps + 1) > 1 ? one / (numOps + 1) : 2;
        }
        if (numOps == 0) {
            return one;
        }
        if (numOps == 1) {
            return (one / 2 > two) ? (one / 2 == 1 ? 2 : one / 2) : two;
        }
        int left = 2;
        int right = l / (numOps + 1);
        while (left < right) {
            int mid = left + (right - left) / 2;
            int sum = 0;
            for (Integer integer : pq) {
                sum += integer / (mid + 1);
            }
            if (sum <= numOps) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
