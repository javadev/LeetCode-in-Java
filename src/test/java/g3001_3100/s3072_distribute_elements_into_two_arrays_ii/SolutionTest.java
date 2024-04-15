package g3001_3100.s3072_distribute_elements_into_two_arrays_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultArray() {
        assertThat(
                new Solution().resultArray(new int[] {2, 1, 3, 3}),
                equalTo(new int[] {2, 3, 1, 3}));
    }

    @Test
    void resultArray2() {
        assertThat(
                new Solution().resultArray(new int[] {5, 14, 3, 1, 2}),
                equalTo(new int[] {5, 3, 2, 14, 1}));
    }

    @Test
    void resultArray3() {
        assertThat(
                new Solution().resultArray(new int[] {3, 3, 3, 3}),
                equalTo(new int[] {3, 3, 3, 3}));
    }
}
