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

    @Test
    void splitArray3() {
        assertThat(
                new Solution()
                        .splitArray(
                                new int[] {
                                    -54818575,
                                    801071518,
                                    745054848,
                                    -415289833,
                                    161564441,
                                    706292027,
                                    306478283,
                                    943480367,
                                    222076810,
                                    992619933
                                }),
                equalTo(449455001L));
    }
}
