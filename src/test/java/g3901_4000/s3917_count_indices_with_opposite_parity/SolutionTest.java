package g3901_4000.s3917_count_indices_with_opposite_parity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOppositeParity() {
        assertThat(
                new Solution().countOppositeParity(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {2, 1, 1, 0}));
    }

    @Test
    void countOppositeParity2() {
        assertThat(new Solution().countOppositeParity(new int[] {1}), equalTo(new int[] {0}));
    }
}
