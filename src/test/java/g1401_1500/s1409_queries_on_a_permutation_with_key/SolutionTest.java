package g1401_1500.s1409_queries_on_a_permutation_with_key;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void processQueries() {
        assertThat(
                new Solution().processQueries(new int[] {3, 1, 2, 1}, 5),
                equalTo(new int[] {2, 1, 2, 1}));
    }

    @Test
    void processQueries2() {
        assertThat(
                new Solution().processQueries(new int[] {4, 1, 2, 2}, 4),
                equalTo(new int[] {3, 1, 2, 0}));
    }

    @Test
    void processQueries3() {
        assertThat(
                new Solution().processQueries(new int[] {7, 5, 5, 8, 3}, 8),
                equalTo(new int[] {6, 5, 0, 7, 5}));
    }
}
