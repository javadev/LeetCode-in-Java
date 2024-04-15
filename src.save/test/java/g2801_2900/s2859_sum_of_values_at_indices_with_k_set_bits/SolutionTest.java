package g2801_2900.s2859_sum_of_values_at_indices_with_k_set_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumIndicesWithKSetBits() {
        assertThat(
                new Solution().sumIndicesWithKSetBits(Arrays.asList(5, 10, 1, 5, 2), 1),
                equalTo(13));
    }

    @Test
    void sumIndicesWithKSetBits2() {
        assertThat(new Solution().sumIndicesWithKSetBits(Arrays.asList(4, 3, 2, 1), 2), equalTo(1));
    }
}
