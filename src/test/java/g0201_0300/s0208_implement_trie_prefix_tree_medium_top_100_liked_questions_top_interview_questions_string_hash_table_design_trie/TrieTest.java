package g0201_0300.s0208_implement_trie_prefix_tree_medium_top_100_liked_questions_top_interview_questions_string_hash_table_design_trie;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class TrieTest {
    @Test
    public void trie() {
        Trie trie = new Trie();
        trie.insert("apple");
        // return True
        assertThat(trie.search("apple"), equalTo(true));
        // return False
        assertThat(trie.search("app"), equalTo(false));
        // return True
        assertThat(trie.startsWith("app"), equalTo(true));
        trie.insert("app");
        // return True
        assertThat(trie.search("app"), equalTo(true));
    }
}
