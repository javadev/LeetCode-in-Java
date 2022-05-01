package g0001_0100.s0060_permutation_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getPermutation() {
        assertThat(new Solution().getPermutation(3, 3), equalTo("213"));
    }
}
