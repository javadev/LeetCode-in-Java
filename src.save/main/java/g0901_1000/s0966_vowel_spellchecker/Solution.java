package g0901_1000.s0966_vowel_spellchecker;

// #Medium #Array #String #Hash_Table #2022_03_31_Time_17_ms_(98.95%)_Space_46.7_MB_(91.62%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    private Set<String> matched;
    private Map<String, String> capitalizations;
    private Map<String, String> vowelErrors;

    private boolean isVowel(char w) {
        return w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u';
    }

    private String removeVowels(String word) {
        StringBuilder s = new StringBuilder();
        for (char w : word.toCharArray()) {
            s.append(isVowel(w) ? '*' : w);
        }
        return s.toString();
    }

    private String solveQuery(String query) {
        if (matched.contains(query)) {
            return query;
        }
        String word = query.toLowerCase();
        if (capitalizations.containsKey(word)) {
            return capitalizations.get(word);
        }
        word = removeVowels(word);
        if (vowelErrors.containsKey(word)) {
            return vowelErrors.get(word);
        }
        return "";
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        String[] answer = new String[queries.length];
        matched = new HashSet<>();
        capitalizations = new HashMap<>();
        vowelErrors = new HashMap<>();
        for (String word : wordlist) {
            matched.add(word);
            String s = word.toLowerCase();
            capitalizations.putIfAbsent(s, word);
            s = removeVowels(s);
            vowelErrors.putIfAbsent(s, word);
        }
        for (int i = 0; i < queries.length; i++) {
            answer[i] = solveQuery(queries[i]);
        }
        return answer;
    }
}
