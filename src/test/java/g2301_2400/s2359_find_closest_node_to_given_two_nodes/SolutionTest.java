package g2301_2400.s2359_find_closest_node_to_given_two_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestMeetingNode() {
        assertThat(new Solution().closestMeetingNode(new int[] {2, 2, 3, -1}, 0, 1), equalTo(2));
    }

    @Test
    void closestMeetingNode2() {
        assertThat(new Solution().closestMeetingNode(new int[] {1, 2, -1}, 0, 2), equalTo(2));
    }
}
