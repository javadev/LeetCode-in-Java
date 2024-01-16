package g0001_0100.s0060_permutation_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getPermutation() {
        assertThat(new Solution().getPermutation(3, 3), equalTo("213"));
    }

    @Test
    void getPermutation2() {
        assertThat(new Solution().getPermutation(4, 9), equalTo("2314"));
    }

    @Test
    void getPermutation3() {
        assertThat(new Solution().getPermutation(3, 1), equalTo("123"));
    }
}
