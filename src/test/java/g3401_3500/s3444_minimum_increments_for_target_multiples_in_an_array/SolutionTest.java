package g3401_3500.s3444_minimum_increments_for_target_multiples_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumIncrements() {
        assertThat(
                new Solution().minimumIncrements(new int[] {1, 2, 3}, new int[] {4}), equalTo(1));
    }

    @Test
    void minimumIncrements2() {
        assertThat(
                new Solution().minimumIncrements(new int[] {8, 4}, new int[] {10, 5}), equalTo(2));
    }

    @Test
    void minimumIncrements3() {
        assertThat(
                new Solution().minimumIncrements(new int[] {7, 9, 10}, new int[] {7}), equalTo(0));
    }
}
