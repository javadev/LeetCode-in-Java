package g2001_2100.s2049_count_nodes_with_the_highest_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countHighestScoreNodes() {
        assertThat(new Solution().countHighestScoreNodes(new int[] {-1, 2, 0, 2, 0}), equalTo(3));
    }

    @Test
    void countHighestScoreNodes2() {
        assertThat(new Solution().countHighestScoreNodes(new int[] {-1, 2, 0}), equalTo(2));
    }
}
