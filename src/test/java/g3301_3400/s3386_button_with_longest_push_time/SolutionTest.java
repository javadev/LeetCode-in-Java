package g3301_3400.s3386_button_with_longest_push_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void buttonWithLongestTime() {
        assertThat(
                new Solution().buttonWithLongestTime(new int[][] {{1, 2}, {2, 5}, {3, 9}, {1, 15}}),
                equalTo(1));
    }

    @Test
    void buttonWithLongestTime2() {
        assertThat(
                new Solution().buttonWithLongestTime(new int[][] {{10, 5}, {1, 7}}), equalTo(10));
    }
}
