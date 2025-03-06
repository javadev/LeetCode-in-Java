package g3401_3500.s3467_transform_array_by_parity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void transformArray() {
        assertThat(
                new Solution().transformArray(new int[] {4, 3, 2, 1}),
                equalTo(new int[] {0, 0, 1, 1}));
    }

    @Test
    void transformArray2() {
        assertThat(
                new Solution().transformArray(new int[] {1, 5, 1, 4, 2}),
                equalTo(new int[] {0, 0, 1, 1, 1}));
    }
}
