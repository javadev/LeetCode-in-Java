package g2201_2300.s2227_encrypt_and_decrypt_strings;

// #Hard #Array #String #Hash_Table #Design #Trie
// #2022_06_12_Time_177_ms_(57.37%)_Space_91.1_MB_(25.26%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Encrypter {
    private final Map<Character, Integer> keysMap;
    private final Map<String, Set<Integer>> valuesMap;
    private final char[] keys;
    private final String[] values;
    private final Trie trie;
    private final Map<String, Integer> decMem;
    private final Map<String, String> encMem;

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        this.keys = keys;
        this.values = values;
        this.keysMap = new HashMap<>();
        this.valuesMap = new HashMap<>();
        this.trie = new Trie();
        decMem = new HashMap<>();
        encMem = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            keysMap.put(keys[i], i);
        }
        for (int i = 0; i < this.values.length; i++) {
            Set<Integer> st = valuesMap.getOrDefault(values[i], new HashSet<>());
            st.add(i);
            valuesMap.put(values[i], st);
        }
        for (String s : dictionary) {
            trie.add(s);
        }
    }

    public String encrypt(String word1) {
        if (encMem.containsKey(word1)) {
            return encMem.get(word1);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < word1.length(); i++) {
            if (!keysMap.containsKey(word1.charAt(i))) {
                return "";
            }
            String repl = this.values[keysMap.get(word1.charAt(i))];
            res.append(repl);
        }
        String ans = res.toString();
        encMem.put(word1, ans);
        return ans;
    }

    public int decrypt(String word2) {
        if (decMem.containsKey(word2)) {
            return decMem.get(word2);
        }
        int ans = decryptRec(word2, 0, new StringBuilder(), this.trie);
        decMem.put(word2, ans);
        return ans;
    }

    public int decryptRec(String word2, int start, StringBuilder prefix, Trie t) {
        if (start >= word2.length()) {
            if (this.trie.wordExists(prefix)) {
                return 1;
            }
            return 0;
        }
        String hashed = word2.substring(start, start + 2);
        Set<Integer> indcs = valuesMap.getOrDefault(hashed, new HashSet<>());
        int ans = 0;
        for (Integer i : indcs) {
            char repl = keys[i];
            prefix.append(repl);
            if (t.links.containsKey(repl)) {
                ans = ans + decryptRec(word2, start + 2, prefix, t.links.get(repl));
            }
            prefix.deleteCharAt(prefix.length() - 1);
        }
        return ans;
    }

    private static class Trie {
        Map<Character, Trie> links = new HashMap<>();
        boolean isTerminal = false;
        String word = null;

        public void add(String s) {
            Trie cur = this;
            for (int i = 0; i < s.length(); i++) {
                Trie next = cur.links.getOrDefault(s.charAt(i), new Trie());
                cur.links.put(s.charAt(i), next);
                if (i == s.length() - 1) {
                    next.isTerminal = true;
                    next.word = s;
                }
                cur = next;
            }
        }

        public boolean prefixExists(StringBuilder p) {
            Trie t = this;
            for (int i = 0; i < p.length(); i++) {
                if (!t.links.containsKey(p.charAt(i))) {
                    return false;
                }
                t = t.links.get(p.charAt(i));
            }
            return true;
        }

        public boolean wordExists(StringBuilder p) {
            Trie t = this;
            for (int i = 0; i < p.length(); i++) {
                if (!t.links.containsKey(p.charAt(i))) {
                    return false;
                }
                if (i == p.length() - 1 && t.links.get(p.charAt(i)).isTerminal) {
                    return true;
                }
                t = t.links.get(p.charAt(i));
            }
            return false;
        }
    }
}
