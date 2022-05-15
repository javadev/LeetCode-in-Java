package g0301_0400.s0386_lexicographical_numbers;

// #Medium #Depth_First_Search #Trie #Acceptance_59.0%
// #2022_03_16_Time_4_ms_(87.17%)_Space_56.9_MB_(38.24%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> lst = new ArrayList<>();
        dfs(lst, n, 0);
        return lst;
    }

    private void dfs(List<Integer> lst, int n, int num) {
        for (int i = 0; i <= 9; i++) {
            int cur = 10 * num + i;
            // get rid of 0
            if (cur == 0) {
                continue;
            }
            // when larger than n, return to the previous level
            if (cur > n) {
                return;
            }
            lst.add(cur);
            dfs(lst, n, cur);
        }
    }
}
