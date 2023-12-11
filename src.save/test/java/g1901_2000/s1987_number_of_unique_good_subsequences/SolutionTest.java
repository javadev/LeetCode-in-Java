package g1901_2000.s1987_number_of_unique_good_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfUniqueGoodSubsequences() {
        assertThat(new Solution().numberOfUniqueGoodSubsequences("001"), equalTo(2));
    }

    @Test
    void numberOfUniqueGoodSubsequences2() {
        assertThat(new Solution().numberOfUniqueGoodSubsequences("11"), equalTo(2));
    }

    @Test
    void numberOfUniqueGoodSubsequences3() {
        assertThat(new Solution().numberOfUniqueGoodSubsequences("101"), equalTo(5));
    }
}
