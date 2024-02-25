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

    @Test
    void minMovesToCaptureTheQueen3() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 3, 1, 5, 1), equalTo(2));
    }

    @Test
    void minMovesToCaptureTheQueen4() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 1, 3, 1, 5), equalTo(2));
    }

    @Test
    void minMovesToCaptureTheQueen5() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 3, 3, 5, 5), equalTo(1));
    }

    @Test
    void minMovesToCaptureTheQueen6() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 3, 1, 5, 3), equalTo(1));
    }

    @Test
    void minMovesToCaptureTheQueen7() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 1, 3, 3, 5), equalTo(1));
    }

    @Test
    void minMovesToCaptureTheQueen8() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 3, 3, 5, 1), equalTo(1));
    }

    @Test
    void minMovesToCaptureTheQueen9() {
        assertThat(new Solution().minMovesToCaptureTheQueen(1, 1, 2, 3, 5, 5), equalTo(2));
    }
}
