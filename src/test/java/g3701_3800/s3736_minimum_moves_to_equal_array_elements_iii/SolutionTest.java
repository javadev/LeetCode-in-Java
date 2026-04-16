package g3701_3800.s3736_minimum_moves_to_equal_array_elements_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new int[] {2, 1, 3}), equalTo(3));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(new int[] {4, 4, 5}), equalTo(2));
    }
}
