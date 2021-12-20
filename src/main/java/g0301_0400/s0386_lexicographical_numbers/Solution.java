package g0301_0400.s0386_lexicographical_numbers;

// #Medium #Depth_First_Search #Trie

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.min(n, 9); i++) {
            dfs(i, list, n);
        }
        return list;
    }

    private void dfs(int x, List<Integer> list, int n) {
        list.add(x);
        for (int i = 0; i < 10 && x * 10 + i <= n; i++) {
            dfs(x * 10 + i, list, n);
        }
    }
}

