package g3601_3700.s3618_split_array_by_prime_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void splitArray() {
        assertThat(new Solution().splitArray(new int[] {2, 3, 4}), equalTo(1L));
    }

    @Test
    void splitArray2() {
        assertThat(new Solution().splitArray(new int[] {-1, 5, 7, 0}), equalTo(3L));
    }
}
