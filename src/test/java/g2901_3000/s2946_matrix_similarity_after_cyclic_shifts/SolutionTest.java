package g2901_3000.s2946_matrix_similarity_after_cyclic_shifts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void areSimilar() {
        assertThat(
                new Solution()
                        .areSimilar(new int[][] {{1, 2, 1, 2}, {5, 5, 5, 5}, {6, 3, 6, 3}}, 2),
                equalTo(true));
    }

    @Test
    void areSimilar2() {
        assertThat(new Solution().areSimilar(new int[][] {{2, 2}, {2, 2}}, 3), equalTo(true));
    }

    @Test
    void areSimilar3() {
        assertThat(new Solution().areSimilar(new int[][] {{1, 2}}, 1), equalTo(false));
    }
}
