package g1401_1500.s1494_parallel_courses_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minNumberOfSemesters() {
        assertThat(
                new Solution().minNumberOfSemesters(4, new int[][] {{2, 1}, {3, 1}, {1, 4}}, 2),
                equalTo(3));
    }

    @Test
    void minNumberOfSemesters2() {
        assertThat(
                new Solution()
                        .minNumberOfSemesters(5, new int[][] {{2, 1}, {3, 1}, {4, 1}, {1, 5}}, 2),
                equalTo(4));
    }

    @Test
    void minNumberOfSemesters3() {
        assertThat(new Solution().minNumberOfSemesters(11, new int[][] {}, 2), equalTo(6));
    }
}
