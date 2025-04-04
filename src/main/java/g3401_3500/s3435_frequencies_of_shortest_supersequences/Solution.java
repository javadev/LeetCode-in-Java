package g3401_3500.s3435_frequencies_of_shortest_supersequences;

// #Hard #Array #String #Bit_Manipulation #Graph #Enumeration #Topological_Sort
// #2025_04_04_Time_20_ms_(97.26%)_Space_45.52_MB_(83.56%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private int min = Integer.MAX_VALUE;
    private List<int[]> lists = new ArrayList<>();

    public List<List<Integer>> supersequences(String[] words) {
        boolean[][] pairs = new boolean[26][26];
        int[] counts = new int[26];
        for (String word : words) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            if (!pairs[a][b]) {
                pairs[a][b] = true;
                counts[a]++;
                counts[b]++;
            }
        }
        List<Integer>[] links = new ArrayList[26];
        for (int i = 0; i < 26; i++) {
            links[i] = new ArrayList<>();
        }
        int[] counts1 = new int[26];
        int[] sides = new int[26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (pairs[i][j]) {
                    links[i].add(j);
                    counts1[j]++;
                    sides[i] |= 1;
                    sides[j] |= 2;
                }
            }
        }
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            if (counts[i] <= 1) {
                arr[i] = counts[i];
            } else if (counts1[i] == 0 || sides[i] != 3) {
                arr[i] = 1;
            } else if (pairs[i][i]) {
                arr[i] = 2;
            } else {
                arr[i] = -1;
            }
        }
        dfs(links, 0, arr, new int[26], 0);
        List<List<Integer>> res = new ArrayList<>();
        for (int[] arr1 : lists) {
            List<Integer> list = new ArrayList<>();
            for (int n : arr1) {
                list.add(n);
            }
            res.add(list);
        }
        return res;
    }

    private void dfs(List<Integer>[] links, int i, int[] arr1, int[] arr, int n) {
        if (n > min) {
            return;
        }
        if (i == 26) {
            if (!chk(links, arr)) {
                return;
            }
            if (n < min) {
                min = n;
                lists = new ArrayList<>();
                lists.add(arr.clone());
            } else if (n == min) {
                lists.add(arr.clone());
            }
            return;
        }
        if (arr1[i] >= 0) {
            arr[i] = arr1[i];
            dfs(links, i + 1, arr1, arr, n + arr1[i]);
        } else {
            arr[i] = 1;
            dfs(links, i + 1, arr1, arr, n + 1);
            arr[i] = 2;
            dfs(links, i + 1, arr1, arr, n + 2);
        }
    }

    private boolean chk(List<Integer>[] links, int[] arr) {
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1 && dfs1(links, arr, new boolean[26], i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs1(List<Integer>[] links, int[] arr, boolean[] seens, int i) {
        seens[i] = true;
        for (int next : links[i]) {
            if (arr[next] == 1 && (seens[next] || dfs1(links, arr, seens, next))) {
                return true;
            }
        }
        seens[i] = false;
        return false;
    }
}
