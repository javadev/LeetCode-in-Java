package g3001_3100.s3001_minimum_moves_to_capture_the_queen;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMovesToCaptureTheQueen() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 8, 8, 2, 3), equalTo(2));
    }

    @Test
    void minMovesToCaptureTheQueen2() {
        assertThat(new Solution().minMovesToCaptureTheQueen(5, 3, 3, 4, 5, 2), equalTo(1));
    }
}
