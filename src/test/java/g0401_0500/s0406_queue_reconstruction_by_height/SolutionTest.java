package g0401_0500.s0406_queue_reconstruction_by_height;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void reconstructQueue() {
        assertThat(
                new Solution()
                        .reconstructQueue(
                                new int[][] {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}),
                equalTo(new int[][] {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}}));
    }

    @Test
    void reconstructQueue2() {
        assertThat(
                new Solution()
                        .reconstructQueue(
                                new int[][] {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}}),
                equalTo(new int[][] {{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6, 0}}));
    }
}
