package g2501_2600.s2515_shortest_distance_to_target_string_in_a_circular_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closetTarget() {
        assertThat(
                new Solution()
                        .closetTarget(
                                new String[] {"hello", "i", "am", "leetcode", "hello"}, "hello", 1),
                equalTo(1));
    }

    @Test
    void closetTarget2() {
        assertThat(
                new Solution().closetTarget(new String[] {"a", "b", "leetcode"}, "leetcode", 0),
                equalTo(1));
    }

    @Test
    void closetTarget3() {
        assertThat(
                new Solution().closetTarget(new String[] {"i", "eat", "leetcode"}, "ate", 0),
                equalTo(-1));
    }
}
