package g0701_0800.s0745_prefix_and_suffix_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class WordFilterTest {
    @Test
    void wordFilterTest() {
        WordFilter wordFilter = new WordFilter(new String[] {"apple"});
        assertThat(wordFilter.f("a", "e"), equalTo(0));
    }
}
