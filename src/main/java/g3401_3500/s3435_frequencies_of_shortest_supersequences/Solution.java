package g3401_3500.s3435_frequencies_of_shortest_supersequences;

// #Hard #Array #String #Bit_Manipulation #Graph #Enumeration #Topological_Sort
// #2025_01_27_Time_751_(100.00%)_Space_49.95_(100.00%)

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
        int[] ed = new int[26];
        Arrays.fill(bg, -1);
        Arrays.fill(ed, 0);
        int[] tans = initializeArrays(words);
        List<String> wtc = buildWtcList(words, tans);
        updateBgEdArrays(wtc, bg, ed);
        List<List<Integer>> ans = new ArrayList<>();
        if (wtc.isEmpty()) {
            ans.add(convertArrayToList(tans));
        } else {
            processNonEmptyWtc(wtc, tans, bg, ed, ans);
        }
        return ans;
    }

    private int[] initializeArrays(List<String> words) {
        Map<String, Boolean> mp = new HashMap<>();
        Map<Character, Boolean> mp2 = new HashMap<>();
        for (String word : words) {
            mp.put(word, true);
            mp2.put(word.charAt(0), true);
            mp2.put(word.charAt(1), true);
        }
        int[] tans = new int[26];
        for (char c = 'a'; c <= 'z'; c++) {
            String aux = "" + c + c;
            if (mp.containsKey(aux)) {
                tans[c - 'a'] = 2;
            } else if (mp2.containsKey(c)) {
                tans[c - 'a'] = 1;
            }
        }
        return tans;
    }

    private List<String> buildWtcList(List<String> words, int[] tans) {
        List<String> wtc = new ArrayList<>();
        for (String word : words) {
            if (tans[word.charAt(0) - 'a'] != 2 && tans[word.charAt(1) - 'a'] != 2) {
                wtc.add(word);
            }
        }
        return wtc;
    }

    private void updateBgEdArrays(List<String> wtc, int[] bg, int[] ed) {
        for (String word : wtc) {
            int l = word.charAt(0) - 'a';
            if (bg[l] == -1) bg[l] = wtc.indexOf(word);
            ed[l] = wtc.indexOf(word);
        }
    }

    private void processNonEmptyWtc(
            List<String> wtc, int[] tans, int[] bg, int[] ed, List<List<Integer>> ans) {
        List<Integer> ns = buildNsList(tans);
        List<Integer> gm = buildGmList(wtc, tans, bg, ed, ns);
        int minb = findMinBits(gm);
        addMinimalAnswers(gm, minb, ns, tans, ans);
    }

    private List<Integer> buildNsList(int[] tans) {
        List<Integer> ns = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (tans[i] == 1) {
                ns.add(i);
            }
        }
        return ns;
    }

    private List<Integer> buildGmList(
            List<String> wtc, int[] tans, int[] bg, int[] ed, List<Integer> ns) {
        List<Integer> gm = new ArrayList<>();
        for (int i = 0; i < (1 << ns.size()); i++) {
            if (isValidConfiguration(i, wtc, tans, bg, ed, ns)) {
                gm.add(i);
            }
        }
        return gm;
    }

    private boolean isValidConfiguration(
            int i, List<String> wtc, int[] tans, int[] bg, int[] ed, List<Integer> ns) {
        int[] indg = new int[26];
        updateTansForConfiguration(i, tans, ns);
        for (String word : wtc) {
            if (tans[word.charAt(0) - 'a'] != 2 && tans[word.charAt(1) - 'a'] != 2) {
                indg[word.charAt(1) - 'a']++;
            }
        }
        List<Integer> chk = buildChkList(indg, tans);
        processChkList(chk, wtc, tans, bg, ed, indg);
        return Arrays.stream(indg).max().orElse(0) == 0;
    }

    private void updateTansForConfiguration(int i, int[] tans, List<Integer> ns) {
        for (int j = 0; j < ns.size(); j++) {
            if ((i & (1 << j)) != 0) {
                tans[ns.get(j)] = 2;
            } else {
                tans[ns.get(j)] = 1;
            }
        }
    }

    private List<Integer> buildChkList(int[] indg, int[] tans) {
        List<Integer> chk = new ArrayList<>();
        for (int j = 0; j < 26; j++) {
            if (indg[j] == 0 && tans[j] == 1) {
                chk.add(j);
            }
        }
        return chk;
    }

    private void processChkList(
            List<Integer> chk, List<String> wtc, int[] tans, int[] bg, int[] ed, int[] indg) {
        while (!chk.isEmpty()) {
            int u = chk.remove(chk.size() - 1);
            if (bg[u] == -1) continue;

            for (int j = bg[u]; j <= ed[u]; j++) {
                int l = wtc.get(j).charAt(1) - 'a';
                if (tans[l] == 2) continue;
                indg[l]--;
                if (indg[l] == 0) {
                    chk.add(l);
                }
            }
        }
    }

    private int findMinBits(List<Integer> gm) {
        int minb = 20;
        for (int x : gm) {
            minb = Math.min(minb, countSetBits(x));
        }
        return minb;
    }

    private void addMinimalAnswers(
            List<Integer> gm, int minb, List<Integer> ns, int[] tans, List<List<Integer>> ans) {
        for (int x : gm) {
            if (countSetBits(x) == minb) {
                updateTansForConfiguration(x, tans, ns);
                ans.add(convertArrayToList(tans));
            }
        }
    }

    private int countSetBits(int x) {
        int count = 0;
        while (x > 0) {
            if ((x & 1) != 0) {
                count++;
            }
            x >>= 1;
        }
        return count;
    }

    private List<Integer> convertArrayToList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }
}
