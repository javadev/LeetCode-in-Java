package g2001_2100.s2006_count_number_of_pairs_with_absolute_difference_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKDifference() {
        assertThat(new Solution().countKDifference(new int[] {1, 2, 2, 1}, 1), equalTo(4));
    }

    @Test
    void countKDifference2() {
        assertThat(new Solution().countKDifference(new int[] {1, 3}, 3), equalTo(0));
    }

    @Test
    void countKDifference3() {
        assertThat(new Solution().countKDifference(new int[] {3, 2, 1, 5, 4}, 2), equalTo(3));
    }
}
