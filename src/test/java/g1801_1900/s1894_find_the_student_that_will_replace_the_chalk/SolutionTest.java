package g1801_1900.s1894_find_the_student_that_will_replace_the_chalk;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void chalkReplacer() {
        assertThat(new Solution().chalkReplacer(new int[] {5, 1, 5}, 22), equalTo(0));
    }

    @Test
    void chalkReplacer2() {
        assertThat(new Solution().chalkReplacer(new int[] {3, 4, 1, 2}, 25), equalTo(1));
    }

    @Test
    void chalkReplacer3() {
        assertThat(new Solution().chalkReplacer(new int[] {1, 2, -1, -2}, 25), equalTo(0));
    }
}
