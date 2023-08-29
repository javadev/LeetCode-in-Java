package g1901_2000.s1964_find_the_longest_valid_obstacle_course_at_each_position;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestObstacleCourseAtEachPosition() {
        assertThat(
                new Solution().longestObstacleCourseAtEachPosition(new int[] {1, 2, 3, 2}),
                equalTo(new int[] {1, 2, 3, 3}));
    }

    @Test
    void longestObstacleCourseAtEachPosition2() {
        assertThat(
                new Solution().longestObstacleCourseAtEachPosition(new int[] {2, 2, 1}),
                equalTo(new int[] {1, 2, 1}));
    }

    @Test
    void longestObstacleCourseAtEachPosition3() {
        assertThat(
                new Solution().longestObstacleCourseAtEachPosition(new int[] {3, 1, 5, 6, 4, 2}),
                equalTo(new int[] {1, 1, 2, 3, 2, 2}));
    }
}
