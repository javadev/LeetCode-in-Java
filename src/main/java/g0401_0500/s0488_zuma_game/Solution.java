package g0401_0500.s0488_zuma_game;

// #Hard #String #Dynamic_Programming #Breadth_First_Search #Memoization
// #2022_08_19_Time_370_ms_(90.36%)_Space_95.2_MB_(69.88%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findMinStep(String board, String hand) {
        return dfs(board, hand);
    }

    private int dfs(String board, String hand) {
        return findMinStepDp(board, hand, new HashMap<>());
    }

    private int findMinStepDp(String board, String hand, Map<String, Map<String, Integer>> dp) {
        if (board.length() == 0) {
            return 0;
        }
        if (hand.length() == 0) {
            return -1;
        }
        if (dp.get(board) != null && dp.get(board).get(hand) != null) {
            return dp.get(board).get(hand);
        }
        int min = -1;
        for (int i = 0; i <= board.length(); i++) {
            for (int j = 0; j < hand.length(); j++) {
                if ((j == 0 || hand.charAt(j) != hand.charAt(j - 1))
                        && (i == 0 || board.charAt(i - 1) != hand.charAt(j))
                        && ((i < board.length() && board.charAt(i) == hand.charAt(j))
                                || (i > 0
                                        && i < board.length()
                                        && board.charAt(i - 1) == board.charAt(i)
                                        && board.charAt(i) != hand.charAt(j)))) {

                    StringBuilder newS = new StringBuilder(board);
                    newS.insert(i, hand.charAt(j));
                    int sR =
                            findMinStepDp(
                                    removeRepeated(newS.toString()),
                                    hand.substring(0, j) + hand.substring(j + 1, hand.length()),
                                    dp);
                    if (sR != -1) {
                        min = min == -1 ? sR + 1 : Integer.min(min, sR + 1);
                    }
                }
            }
        }
        dp.putIfAbsent(board, new HashMap<>());
        dp.get(board).put(hand, min);
        return min;
    }

    private String removeRepeated(String original) {
        int count = 1;
        int i = 1;
        while (i < original.length()) {
            if (original.charAt(i) == original.charAt(i - 1)) {
                count++;
                i++;
            } else {
                if (count >= 3) {
                    return removeRepeated(
                            original.substring(0, i - count)
                                    + original.substring(i, original.length()));
                } else {
                    count = 1;
                    i++;
                }
            }
        }
        if (count >= 3) {
            return removeRepeated(original.substring(0, original.length() - count));
        } else {
            return original;
        }
    }
}
