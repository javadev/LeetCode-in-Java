package g1801_1900.s1866_number_of_ways_to_rearrange_sticks_with_k_sticks_visible;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rearrangeSticks() {
        assertThat(new Solution().rearrangeSticks(3, 2), equalTo(3));
    }

    @Test
    void rearrangeSticks2() {
        assertThat(new Solution().rearrangeSticks(5, 5), equalTo(1));
    }

    @Test
    void rearrangeSticks3() {
        assertThat(new Solution().rearrangeSticks(20, 11), equalTo(647427950));
    }
}
