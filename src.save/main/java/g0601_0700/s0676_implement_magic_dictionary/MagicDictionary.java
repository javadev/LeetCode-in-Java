package g0601_0700.s0676_implement_magic_dictionary;

// #Medium #String #Hash_Table #Design #Trie #2022_03_22_Time_38_ms_(86.83%)_Space_52.7_MB_(76.19%)

public class MagicDictionary {
    private String[] dictionaryWords;

    public MagicDictionary() {
        dictionaryWords = null;
    }

    public void buildDict(String[] dictionary) {
        dictionaryWords = dictionary;
    }

    public boolean search(String searchWord) {
        for (String word : dictionaryWords) {
            if (isOffByOneLetter(word, searchWord)) {
                return true;
            }
        }
        return false;
    }

    private boolean isOffByOneLetter(String word, String searchWord) {
        if (isDifferentLengths(word, searchWord) || word.equals(searchWord)) {
            return false;
        }
        int numDifferentLetters = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isNotTheSameLetter(word.charAt(i), searchWord.charAt(i))) {
                numDifferentLetters++;
            }
            if (numDifferentLetters > 1) {
                return false;
            }
        }
        return numDifferentLetters == 1;
    }

    private boolean isDifferentLengths(String word, String searchWord) {
        return word.length() != searchWord.length();
    }

    private boolean isNotTheSameLetter(char c1, char c2) {
        return c1 != c2;
    }
}

/*
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
