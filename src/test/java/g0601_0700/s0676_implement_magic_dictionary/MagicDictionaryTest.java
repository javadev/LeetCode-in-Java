package g0601_0700.s0676_implement_magic_dictionary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MagicDictionaryTest {
    @Test
    void magicDictionaryTest() {
        MagicDictionary magicDictionary = new MagicDictionary();
        magicDictionary.buildDict(new String[] {"hello", "leetcode"});
        assertThat(magicDictionary.search("hello"), equalTo(false));
        assertThat(magicDictionary.search("hhllo"), equalTo(true));
        assertThat(magicDictionary.search("hell"), equalTo(false));
        assertThat(magicDictionary.search("leetcoded"), equalTo(false));
    }
}
