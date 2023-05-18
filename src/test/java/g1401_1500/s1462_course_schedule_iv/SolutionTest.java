package g1401_1500.s1462_course_schedule_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkIfPrerequisite() {
        assertThat(
                new Solution()
                        .checkIfPrerequisite(2, new int[][] {{1, 0}}, new int[][] {{0, 1}, {1, 0}}),
                equalTo(Arrays.asList(false, true)));
    }

    @Test
    void checkIfPrerequisite2() {
        assertThat(
                new Solution().checkIfPrerequisite(2, new int[][] {}, new int[][] {{1, 0}, {0, 1}}),
                equalTo(Arrays.asList(false, false)));
    }

    @Test
    void checkIfPrerequisite3() {
        assertThat(
                new Solution()
                        .checkIfPrerequisite(
                                3,
                                new int[][] {{1, 2}, {1, 0}, {2, 0}},
                                new int[][] {{1, 0}, {1, 2}}),
                equalTo(Arrays.asList(true, true)));
    }
}
