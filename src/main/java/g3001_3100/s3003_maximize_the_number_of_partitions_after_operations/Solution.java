package g3001_3100.s3003_maximize_the_number_of_partitions_after_operations;

// #Hard #String #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2024_02_26_Time_1_ms_(100.00%)_Space_42.1_MB_(99.44%)

@SuppressWarnings("java:S6541")
public class Solution {
    private static final int ALPHABET_SIZE = 'z' - 'a' + 1;

    public int maxPartitionsAfterOperations(String s, int k) {
        if (k == ALPHABET_SIZE) {
            return 1;
        }
        int n = s.length();
        int[] ansr = new int[n];
        int[] usedr = new int[n];
        int used = 0;
        int cntUsed = 0;
        int ans = 1;
        for (int i = n - 1; i >= 0; --i) {
            int ch = s.charAt(i) - 'a';
            if ((used & (1 << ch)) == 0) {
                if (cntUsed == k) {
                    cntUsed = 0;
                    used = 0;
                    ans++;
                }
                used |= (1 << ch);
                cntUsed++;
            }
            ansr[i] = ans;
            usedr[i] = used;
        }
        int ansl = 0;
        ans = ansr[0];
        int l = 0;
        while (l < n) {
            used = 0;
            cntUsed = 0;
            int usedBeforeLast = 0;
            int usedTwiceBeforeLast = 0;
            int last = -1;
            int r = l;
            while (r < n) {
                int ch = s.charAt(r) - 'a';
                if ((used & (1 << ch)) == 0) {
                    if (cntUsed == k) {
                        break;
                    }
                    usedBeforeLast = used;
                    last = r;
                    used |= (1 << ch);
                    cntUsed++;
                } else if (cntUsed < k) {
                    usedTwiceBeforeLast |= (1 << ch);
                }
                r++;
            }
            if (cntUsed == k) {
                if (last - l > Integer.bitCount(usedBeforeLast)) {
                    ans = Math.max(ans, ansl + 1 + ansr[last]);
                }
                if (last + 1 < r) {
                    if (last + 2 >= n) {
                        ans = Math.max(ans, ansl + 1 + 1);
                    } else {
                        if (Integer.bitCount(usedr[last + 2]) == k) {
                            int canUse = ((1 << ALPHABET_SIZE) - 1) & ~used & ~usedr[last + 2];
                            if (canUse > 0) {
                                ans = Math.max(ans, ansl + 1 + 1 + ansr[last + 2]);
                            } else {
                                ans = Math.max(ans, ansl + 1 + ansr[last + 2]);
                            }
                            int l1 = s.charAt(last + 1) - 'a';
                            if ((usedTwiceBeforeLast & (1 << l1)) == 0) {
                                ans = Math.max(ans, ansl + 1 + ansr[last + 1]);
                            }
                        } else {
                            ans = Math.max(ans, ansl + 1 + ansr[last + 2]);
                        }
                    }
                }
            }
            l = r;
            ansl++;
        }
        return ans;
    }
}
