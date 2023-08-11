package g0801_0900.s0843_guess_the_word;

// #Hard #Array #String #Math #Game_Theory #Interactive
// #2022_03_24_Time_2_ms_(68.01%)_Space_41.5_MB_(70.30%)

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
public class Solution {
    interface Master {
        int guess(String word);
    }

    private int next = 0;

    public void findSecretWord(String[] wordlist, Master master) {
        List<String> list = Arrays.asList(wordlist);
        Collections.shuffle(list);
        boolean[] test = new boolean[wordlist.length];
        while (true) {
            int num = master.guess(list.get(next));
            if (num == 6) {
                break;
            }
            updateList(list, test, num);
        }
    }

    private void updateList(List<String> list, boolean[] test, int num) {
        int index = next;
        for (int i = index + 1; i < test.length; i++) {
            if (test[i]) {
                continue;
            }
            int samePart = getSame(list.get(index), list.get(i));
            if (samePart != num) {
                test[i] = true;
            } else if (next == index) {
                next = i;
            }
        }
    }

    private int getSame(String word1, String word2) {
        int ret = 0;
        for (int i = 0; i < 6; i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                ret++;
            }
        }
        return ret;
    }
}
