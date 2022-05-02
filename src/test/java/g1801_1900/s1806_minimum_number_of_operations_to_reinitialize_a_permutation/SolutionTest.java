package g1801_1900.s1806_minimum_number_of_operations_to_reinitialize_a_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reinitializePermutation() {
        assertThat(new Solution().reinitializePermutation(2), equalTo(1));
    }

    @Test
    void reinitializePermutation2() {
        assertThat(new Solution().reinitializePermutation(4), equalTo(2));
    }
}
