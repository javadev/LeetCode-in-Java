package g1701_1800.s1750_minimum_length_of_string_after_deleting_similar_ends;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumLength() {
        assertThat(new Solution().minimumLength("ca"), equalTo(2));
    }

    @Test
    void minimumLength2() {
        assertThat(new Solution().minimumLength("cabaabac"), equalTo(0));
    }

    @Test
    void minimumLength3() {
        assertThat(new Solution().minimumLength("aabccabba"), equalTo(3));
    }
}
