package g3801_3900.s3820_pythagorean_distance_nodes_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void specialNodes() {
        assertThat(
                new Solution().specialNodes(4, new int[][] {{0, 1}, {0, 2}, {0, 3}}, 1, 2, 3),
                equalTo(3));
    }

    @Test
    void specialNodes2() {
        assertThat(
                new Solution().specialNodes(4, new int[][] {{0, 1}, {1, 2}, {2, 3}}, 0, 3, 2),
                equalTo(0));
    }

    @Test
    void specialNodes3() {
        assertThat(
                new Solution().specialNodes(4, new int[][] {{0, 1}, {1, 2}, {1, 3}}, 1, 3, 0),
                equalTo(1));
    }
}
