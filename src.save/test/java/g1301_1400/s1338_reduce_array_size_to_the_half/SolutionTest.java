package g1301_1400.s1338_reduce_array_size_to_the_half;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSetSize() {
        assertThat(new Solution().minSetSize(new int[] {3, 3, 3, 3, 5, 5, 5, 2, 2, 7}), equalTo(2));
    }

    @Test
    void minSetSize2() {
        assertThat(new Solution().minSetSize(new int[] {7, 7, 7, 7, 7, 7}), equalTo(1));
    }
}
