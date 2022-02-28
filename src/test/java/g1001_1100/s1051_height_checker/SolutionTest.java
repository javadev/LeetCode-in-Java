package g1001_1100.s1051_height_checker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void heightChecker() {
        assertThat(new Solution().heightChecker(new int[] {1, 1, 4, 2, 1, 3}), equalTo(3));
    }

    @Test
    void heightChecker2() {
        assertThat(new Solution().heightChecker(new int[] {5, 1, 2, 3, 4}), equalTo(5));
    }

    @Test
    void heightChecker3() {
        assertThat(new Solution().heightChecker(new int[] {1, 2, 3, 4, 5}), equalTo(0));
    }
}
