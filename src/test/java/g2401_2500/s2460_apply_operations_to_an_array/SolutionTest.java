package g2401_2500.s2460_apply_operations_to_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void applyOperations() {
        assertThat(
                new Solution().applyOperations(new int[] {1, 2, 2, 1, 1, 0}),
                equalTo(new int[] {1, 4, 2, 0, 0, 0}));
    }

    @Test
    void applyOperations2() {
        assertThat(new Solution().applyOperations(new int[] {0, 1}), equalTo(new int[] {1, 0}));
    }
}
