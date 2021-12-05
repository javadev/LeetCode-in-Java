package g0001_0100.s0041_first_missing_positive;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstMissingPositive() {
        assertThat(new Solution().firstMissingPositive(new int[] {1, 2, 0}), equalTo(3));
    }

    @Test
    void firstMissingPositive2() {
        assertThat(new Solution().firstMissingPositive(new int[] {3, 4, -1, 1}), equalTo(2));
    }

    @Test
    void firstMissingPositive3() {
        assertThat(new Solution().firstMissingPositive(new int[] {7, 8, 9, 11, 12}), equalTo(1));
    }
}
