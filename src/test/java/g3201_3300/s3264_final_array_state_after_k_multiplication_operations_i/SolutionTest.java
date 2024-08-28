package g3201_3300.s3264_final_array_state_after_k_multiplication_operations_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getFinalState() {
        assertThat(
                new Solution().getFinalState(new int[] {2, 1, 3, 5, 6}, 5, 2),
                equalTo(new int[] {8, 4, 6, 5, 6}));
    }

    @Test
    void getFinalState2() {
        assertThat(
                new Solution().getFinalState(new int[] {1, 2}, 3, 4), equalTo(new int[] {16, 8}));
    }
}
