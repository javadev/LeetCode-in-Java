package g3501_3600.s3533_concatenated_divisibility;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void concatenatedDivisibility() {
        assertThat(
                new Solution().concatenatedDivisibility(new int[] {3, 12, 45}, 5),
                equalTo(new int[] {3, 12, 45}));
    }

    @Test
    void concatenatedDivisibility2() {
        assertThat(
                new Solution().concatenatedDivisibility(new int[] {10, 5}, 10),
                equalTo(new int[] {5, 10}));
    }

    @Test
    void concatenatedDivisibility3() {
        assertThat(
                new Solution().concatenatedDivisibility(new int[] {1, 2, 3}, 5),
                equalTo(new int[] {}));
    }
}
