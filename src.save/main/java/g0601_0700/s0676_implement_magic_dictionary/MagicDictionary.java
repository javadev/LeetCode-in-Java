package g0601_0700.s0676_implement_magic_dictionary;

// #Medium #String #Hash_Table #Design #Trie

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
