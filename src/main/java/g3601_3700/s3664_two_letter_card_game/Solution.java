package g3601_3700.s3664_two_letter_card_game;

// #Medium #Array #String #Hash_Table #Counting #Enumeration #Biweekly_Contest_164
// #2025_09_26_Time_8_ms_(99.01%)_Space_60.52_MB_(32.53%)

public class Solution {
    public int score(String[] cards, char x) {
        // store input midway as required
        // counts for "x?" group by second char and "?x" group by first char
        int[] left = new int[10];
        int[] right = new int[10];
        int xx = 0;
        for (String c : cards) {
            char a = c.charAt(0);
            char b = c.charAt(1);
            if (a == x && b == x) {
                xx++;
            } else if (a == x) {
                left[b - 'a']++;
            } else if (b == x) {
                right[a - 'a']++;
            }
        }
        // max pairs inside a group where pairs must come from different buckets:
        // pairs = min(total/2, total - maxBucket)
        int l = 0;
        int maxL = 0;
        for (int v : left) {
            l += v;
            if (v > maxL) {
                maxL = v;
            }
        }
        int r = 0;
        int maxR = 0;
        for (int v : right) {
            r += v;
            if (v > maxR) {
                maxR = v;
            }
        }
        int pairsLeft = Math.min(l / 2, l - maxL);
        int pairsRight = Math.min(r / 2, r - maxR);
        // leftovers after internal pairing
        int leftoverL = l - 2 * pairsLeft;
        int leftoverR = r - 2 * pairsRight;
        int leftovers = leftoverL + leftoverR;
        // First, use "xx" to pair with any leftovers
        int useWithXX = Math.min(xx, leftovers);
        int xxLeft = xx - useWithXX;
        // If "xx" still remain, we can break existing internal pairs:
        // breaking 1 internal pair frees 2 cards, which can pair with 2 "xx" to gain +1 net point
        int extraByBreaking = Math.min(xxLeft / 2, pairsLeft + pairsRight);
        return pairsLeft + pairsRight + useWithXX + extraByBreaking;
    }
}
