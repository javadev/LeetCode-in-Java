package g1001_1100.s1079_letter_tile_possibilities;

// #Medium #String #Backtracking #2022_02_26_Time_60_ms_(25.58%)_Space_55.8_MB_(11.39%)

import java.util.HashSet;

public class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> numPos = new HashSet<>();
        int[] flag = new int[tiles.length()];
        getNumbers(tiles, numPos, flag, "");
        return numPos.size();
    }

    private void getNumbers(String tiles, HashSet<String> numPos, int[] flag, String str) {
        for (int i = 0; i < tiles.length(); i++) {
            if (flag[i] == 0) {
                char ch = tiles.charAt(i);
                str += ch;
                flag[i] = 1;
                numPos.add(str);
                getNumbers(tiles, numPos, flag, str);
                str = str.substring(0, str.length() - 1);
                flag[i] = 0;
            }
        }
    }
}
