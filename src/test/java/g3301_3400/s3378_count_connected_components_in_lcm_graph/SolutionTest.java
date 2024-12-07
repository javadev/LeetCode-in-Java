package g3301_3400.s3378_count_connected_components_in_lcm_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countComponents() {
        assertThat(new Solution().countComponents(new int[] {2, 4, 8, 3, 9}, 5), equalTo(4));
    }

    @Test
    void countComponents2() {
        assertThat(new Solution().countComponents(new int[] {2, 4, 8, 3, 9, 12}, 10), equalTo(2));
    }
}
