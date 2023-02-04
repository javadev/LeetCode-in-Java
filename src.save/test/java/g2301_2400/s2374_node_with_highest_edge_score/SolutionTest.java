package g2301_2400.s2374_node_with_highest_edge_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void edgeScore() {
        assertThat(new Solution().edgeScore(new int[] {1, 0, 0, 0, 0, 7, 7, 5}), equalTo(7));
    }

    @Test
    void edgeScore2() {
        assertThat(new Solution().edgeScore(new int[] {2, 0, 0, 2}), equalTo(0));
    }
}
