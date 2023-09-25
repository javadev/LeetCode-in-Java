package g2201_2300.s2251_number_of_flowers_in_full_bloom;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fullBloomFlowers() {
        assertThat(
                new Solution()
                        .fullBloomFlowers(
                                new int[][] {{1, 6}, {3, 7}, {9, 12}, {4, 13}},
                                new int[] {2, 3, 7, 11}),
                equalTo(new int[] {1, 2, 2, 2}));
    }

    @Test
    void fullBloomFlowers2() {
        assertThat(
                new Solution().fullBloomFlowers(new int[][] {{1, 10}, {3, 3}}, new int[] {3, 3, 2}),
                equalTo(new int[] {2, 2, 1}));
    }
}
