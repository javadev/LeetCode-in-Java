package g0601_0700.s0630_course_schedule_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scheduleCourse() {
        int[][] input = new int[][] {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        assertThat(new Solution().scheduleCourse(input), equalTo(3));
    }

    @Test
    void scheduleCourse2() {
        assertThat(new Solution().scheduleCourse(new int[][] {{1, 2}}), equalTo(1));
    }

    @Test
    void scheduleCourse3() {
        assertThat(new Solution().scheduleCourse(new int[][] {{3, 2}, {4, 3}}), equalTo(0));
    }

    @Test
    void scheduleCourse4() {
        int[][] input =
                new int[][] {
                    {100, 200},
                    {200, 1300},
                    {1000, 1250},
                    {2000, 3200},
                    {300, 1200}
                };
        assertThat(new Solution().scheduleCourse(input), equalTo(4));
    }
}
