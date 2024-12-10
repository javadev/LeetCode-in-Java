package g3301_3400.s3379_transformed_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructTransformedArray() {
        assertThat(
                new Solution().constructTransformedArray(new int[] {3, -2, 1, 1}),
                equalTo(new int[] {1, 1, 1, 3}));
    }

    @Test
    void constructTransformedArray2() {
        assertThat(
                new Solution().constructTransformedArray(new int[] {-1, 4, -1}),
                equalTo(new int[] {-1, -1, 4}));
    }
}
