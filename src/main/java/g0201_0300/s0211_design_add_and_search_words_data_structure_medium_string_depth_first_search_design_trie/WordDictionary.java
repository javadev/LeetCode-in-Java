package g0201_0300.s0211_design_add_and_search_words_data_structure_medium_string_depth_first_search_design_trie;

import java.util.ArrayList;

@SuppressWarnings({"unchecked", "java:S3626"})
public class WordDictionary {

    private ArrayList<String>[] dict = new ArrayList[501];

    public WordDictionary() {
        // Initialize your data structure here.
    }

    // Adds a word into the data structure.
    public void addWord(String word) {
        ArrayList<String> a = dict[word.length()];
        if (a == null) {
            a = new ArrayList<>();
        }
        a.add(word);
        dict[word.length()] = a;
    }

    // Returns if the word is in the data structure. A word could contain the dot character '.' to
    // represent any one letter.
    public boolean search(String word) {
        if (dict[word.length()] == null) {
            return false;
        }
        ArrayList<String> a = dict[word.length()];
        for (String s : a) {
            boolean match = true;
            for (int i = 0; i < word.length() && match; i++) {
                if (word.charAt(i) != '.' && s.charAt(i) != word.charAt(i)) {
                    match = false;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}

/*
 * Your WordDictionary object will be instantiated and called as such: WordDictionary obj = new
 * WordDictionary(); obj.addWord(word); boolean param_2 = obj.search(word);
 */
