package g3401_3500.s3435_frequencies_of_shortest_supersequences;

// #Hard #2025_01_26_Time_728_(100.00%)_Space_50.28_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> supersequences(String[] wordsArray) {
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));
        Collections.sort(words);
        int[] bg = new int[26];
        Arrays.fill(bg, -1);
        int[] ed = new int[26];
        Arrays.fill(ed, 0);
        Map<String, Boolean> mp = new HashMap<>();
        Map<Character, Boolean> mp2 = new HashMap<>();
        for (String x : words) {
            mp.put(x, true);
            mp2.put(x.charAt(0), true);
            mp2.put(x.charAt(1), true);
        }
        int[] tans = new int[26];
        Arrays.fill(tans, 0);
        for (char c = 'a'; c <= 'z'; c++) {
            String aux = "" + c + c;
            if (mp.containsKey(aux)) {
                tans[c - 'a'] = 2;
            } else if (mp2.containsKey(c)) {
                tans[c - 'a'] = 1;
            }
        }
        List<String> wtc = new ArrayList<>();
        for (String x : words) {
            if (tans[x.charAt(0) - 'a'] != 2 && tans[x.charAt(1) - 'a'] != 2) {
                wtc.add(x);
            }
        }
        for (int i = 0; i < wtc.size(); i++) {
            int l = wtc.get(i).charAt(0) - 'a';
            if (bg[l] == -1) {
                bg[l] = i;
            }
            ed[l] = i;
        }
        List<List<Integer>> ans = new ArrayList<>();
        if (wtc.isEmpty()) {
            List<Integer> tansList = new ArrayList<>();
            for (int t : tans) {
                tansList.add(t);
            }
            ans.add(tansList);
            return ans;
        } else {
            List<Integer> ns = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                if (tans[i] == 1) {
                    ns.add(i);
                }
            }
            List<Integer> gm = new ArrayList<>();
            for (int i = 0; i < (1 << ns.size()); i++) {
                int[] indg = new int[26];
                Arrays.fill(indg, 0);
                for (int j = 0; j < ns.size(); j++) {
                    if ((i & (1 << j)) != 0) {
                        tans[ns.get(j)] = 2;
                    } else {
                        tans[ns.get(j)] = 1;
                    }
                }
                for (String w : wtc) {
                    if (tans[w.charAt(0) - 'a'] != 2 && tans[w.charAt(1) - 'a'] != 2) {
                        indg[w.charAt(1) - 'a']++;
                    }
                }
                List<Integer> chk = new ArrayList<>();
                for (int j = 0; j < 26; j++) {
                    if (indg[j] == 0 && tans[j] == 1) {
                        chk.add(j);
                    }
                }
                while (!chk.isEmpty()) {
                    int u = chk.remove(chk.size() - 1);
                    if (bg[u] == -1) {
                        continue;
                    }
                    for (int j = bg[u]; j <= ed[u]; j++) {
                        int l = wtc.get(j).charAt(1) - 'a';
                        if (tans[l] == 2) {
                            continue;
                        }
                        indg[l]--;
                        if (indg[l] == 0) {
                            chk.add(l);
                        }
                    }
                }
                if (Arrays.stream(indg).max().getAsInt() == 0) {
                    gm.add(i);
                }
            }
            int minb = 20;
            for (int x : gm) {
                minb = Math.min(minb, Integer.bitCount(x));
            }
            for (int x : gm) {
                if (Integer.bitCount(x) == minb) {
                    for (int j = 0; j < ns.size(); j++) {
                        if ((x & (1 << j)) != 0) {
                            tans[ns.get(j)] = 2;
                        } else {
                            tans[ns.get(j)] = 1;
                        }
                    }
                    List<Integer> tansList = new ArrayList<>();
                    for (int t : tans) {
                        tansList.add(t);
                    }
                    ans.add(tansList);
                }
            }
            return ans;
        }
    }
}
