package g1101_1200.s1160_find_words_that_can_be_formed_by_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCharacters() {
        assertThat(
                new Solution().countCharacters(new String[] {"cat", "bt", "hat", "tree"}, "atach"),
                equalTo(6));
    }

    @Test
    void countCharacters2() {
        assertThat(
                new Solution()
                        .countCharacters(
                                new String[] {"hello", "world", "leetcode"}, "welldonehoneyr"),
                equalTo(10));
    }
}
