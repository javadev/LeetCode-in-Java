package g3001_3100.s3069_distribute_elements_into_two_arrays_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultArray() {
        assertThat(new Solution().resultArray(new int[] {2, 1, 3}), equalTo(new int[] {2, 3, 1}));
    }

    @Test
    void resultArray2() {
        assertThat(
                new Solution().resultArray(new int[] {5, 4, 3, 8}),
                equalTo(new int[] {5, 3, 4, 8}));
    }
}
