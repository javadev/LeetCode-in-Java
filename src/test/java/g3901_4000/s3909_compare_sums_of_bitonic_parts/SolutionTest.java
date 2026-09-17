package g3901_4000.s3909_compare_sums_of_bitonic_parts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void compareBitonicSums() {
        assertThat(new Solution().compareBitonicSums(new int[] {1, 3, 2, 1}), equalTo(1));
    }

    @Test
    void compareBitonicSums2() {
        assertThat(new Solution().compareBitonicSums(new int[] {2, 4, 5, 2}), equalTo(0));
    }

    @Test
    void compareBitonicSums3() {
        assertThat(new Solution().compareBitonicSums(new int[] {1, 2, 4, 3}), equalTo(-1));
    }

    @Test
    void compareBitonicSums4() {
        assertThat(new Solution().compareBitonicSums(new int[] {1, 2, 1}), equalTo(-1));
    }

    @Test
    void compareBitonicSums5() {
        assertThat(
                new Solution()
                        .compareBitonicSums(
                                new int[] {999999997, 999999998, 999999999, 1000000000, 1}),
                equalTo(0));
    }
}
