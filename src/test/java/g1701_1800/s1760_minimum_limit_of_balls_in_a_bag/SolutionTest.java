package g1701_1800.s1760_minimum_limit_of_balls_in_a_bag;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumSize() {
        assertThat(new Solution().minimumSize(new int[] {9}, 2), equalTo(3));
    }

    @Test
    void minimumSize2() {
        assertThat(new Solution().minimumSize(new int[] {2, 4, 8, 2}, 4), equalTo(2));
    }

    @Test
    void minimumSize3() {
        assertThat(new Solution().minimumSize(new int[] {7, 17}, 2), equalTo(7));
    }
}
