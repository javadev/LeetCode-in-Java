package g2201_2300.s2227_encrypt_and_decrypt_strings;

// #Hard #Array #String #Hash_Table #Design #Trie
// #2022_06_12_Time_143_ms_(74.74%)_Space_85.3_MB_(46.84%)

import java.util.HashMap;
import java.util.Map;

public class Encrypter {
    private Map<Character, String> eMap;
    private Map<String, Integer> dMap;

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        eMap = new HashMap<>();
        dMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            eMap.put(keys[i], values[i]);
        }
        for (String s : dictionary) {
            String str = encrypt(s);
            if (!str.equals("") && !str.equals("null")) {
                dMap.put(str, dMap.getOrDefault(str, 0) + 1);
            }
        }
    }

    public String encrypt(String word1) {
        StringBuilder sb = new StringBuilder();
        for (char c : word1.toCharArray()) {
            sb.append(eMap.get(c));
        }
        return sb.toString();
    }

    public int decrypt(String word2) {
        return dMap.getOrDefault(word2, 0);
    }
}

/*
 * Your Encrypter object will be instantiated and called as such:
 * Encrypter obj = new Encrypter(keys, values, dictionary);
 * String param_1 = obj.encrypt(word1);
 * int param_2 = obj.decrypt(word2);
 */
