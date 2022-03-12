package g1201_1300.s1235_maximum_profit_in_job_scheduling;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void jobScheduling() {
        assertThat(
                new Solution()
                        .jobScheduling(
                                new int[] {1, 2, 3, 3},
                                new int[] {3, 4, 5, 6},
                                new int[] {50, 10, 40, 70}),
                equalTo(120));
    }

    @Test
    void jobScheduling2() {
        assertThat(
                new Solution()
                        .jobScheduling(
                                new int[] {1, 2, 3, 4, 6},
                                new int[] {3, 5, 10, 6, 9},
                                new int[] {20, 20, 100, 70, 60}),
                equalTo(150));
    }

    @Test
    void jobScheduling3() {
        assertThat(
                new Solution()
                        .jobScheduling(
                                new int[] {1, 1, 1}, new int[] {2, 3, 4}, new int[] {5, 6, 4}),
                equalTo(6));
    }
}
