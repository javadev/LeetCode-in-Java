package g2801_2900.s2813_maximum_elegance_of_a_k_length_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaximumElegance() {
        assertThat(
                new Solution().findMaximumElegance(new int[][] {{3, 2}, {5, 1}, {10, 1}}, 2),
                equalTo(17L));
    }

    @Test
    void findMaximumElegance2() {
        assertThat(
                new Solution().findMaximumElegance(new int[][] {{3, 1}, {3, 1}, {2, 2}, {5, 3}}, 3),
                equalTo(19L));
    }

    @Test
    void findMaximumElegance3() {
        assertThat(
                new Solution().findMaximumElegance(new int[][] {{1, 1}, {2, 1}, {3, 1}}, 3),
                equalTo(7L));
    }
}
