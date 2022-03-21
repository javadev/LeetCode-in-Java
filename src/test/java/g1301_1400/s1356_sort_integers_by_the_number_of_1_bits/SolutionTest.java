package g1301_1400.s1356_sort_integers_by_the_number_of_1_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortByBits() {
        assertThat(
                new Solution().sortByBits(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}),
                equalTo(new int[] {0, 1, 2, 4, 8, 3, 5, 6, 7}));
    }

    @Test
    void sortByBits2() {
        assertThat(
                new Solution().sortByBits(new int[] {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}),
                equalTo(new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}));
    }
}
