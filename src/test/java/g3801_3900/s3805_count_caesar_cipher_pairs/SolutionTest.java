package g3801_3900.s3805_count_caesar_cipher_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        assertThat(new Solution().countPairs(new String[] {"fusion", "layout"}), equalTo(1L));
    }

    @Test
    void countPairs2() {
        assertThat(new Solution().countPairs(new String[] {"ab", "aa", "za", "aa"}), equalTo(2L));
    }
}
