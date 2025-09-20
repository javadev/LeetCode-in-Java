package g3601_3700.s3680_generate_schedule;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generateSchedule() {
        assertThat(new Solution().generateSchedule(3), equalTo(new int[] {}));
    }

    @Test
    void generateSchedule2() {
        assertThat(
                new Solution().generateSchedule(5),
                equalTo(
                        new int[][] {
                            {0, 2}, {1, 3}, {2, 4}, {3, 0}, {4, 1}, {0, 3}, {1, 4}, {2, 0}, {3, 1},
                            {4, 2}, {0, 1}, {4, 3}, {1, 2}, {0, 4}, {2, 3}, {1, 0}, {3, 4}, {2, 1},
                            {4, 0}, {3, 2}
                        }));
    }
}
