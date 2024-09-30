package g3301_3400.s3303_find_the_occurrence_of_first_almost_equal_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minStartingIndex() {
        assertThat(new Solution().minStartingIndex("abcdefg", "bcdffg"), equalTo(1));
    }

    @Test
    void minStartingIndex2() {
        assertThat(new Solution().minStartingIndex("ababbababa", "bacaba"), equalTo(4));
    }

    @Test
    void minStartingIndex3() {
        assertThat(new Solution().minStartingIndex("abcd", "dba"), equalTo(-1));
    }

    @Test
    void minStartingIndex4() {
        assertThat(new Solution().minStartingIndex("dde", "d"), equalTo(0));
    }
}
