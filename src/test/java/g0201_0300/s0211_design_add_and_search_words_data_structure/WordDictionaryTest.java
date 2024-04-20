package g0201_0300.s0211_design_add_and_search_words_data_structure;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class WordDictionaryTest {
    @Test
    void worldDataStructure() {
        String[] input = {"bad", "dad", "mad"};
        WordDictionary dictionary = new WordDictionary();
        for (String s : input) {
            dictionary.addWord(s);
        }
        assertThat(dictionary.search("pad"), equalTo(false));
        assertThat(dictionary.search("bad"), equalTo(true));
        assertThat(dictionary.search(".ad"), equalTo(true));
        assertThat(dictionary.search("b.."), equalTo(true));
    }
}
