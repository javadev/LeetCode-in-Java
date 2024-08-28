package g3201_3300.s3266_final_array_state_after_k_multiplication_operations_ii;

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
                new Solution().getFinalState(new int[] {100000, 2000}, 2, 1000000),
                equalTo(new int[] {999999307, 999999993}));
    }
}
