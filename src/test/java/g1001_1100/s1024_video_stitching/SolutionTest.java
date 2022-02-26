package g1001_1100.s1024_video_stitching;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void videoStitching() {
        assertThat(
                new Solution()
                        .videoStitching(
                                new int[][] {{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}}, 10),
                equalTo(3));
    }

    @Test
    void videoStitching2() {
        assertThat(
                new Solution()
                        .videoStitching(
                                new int[][] {
                                    {0, 1}, {6, 8}, {0, 2}, {5, 6}, {0, 4}, {0, 3}, {6, 7}, {1, 3},
                                    {4, 7}, {1, 4}, {2, 5}, {2, 6}, {3, 4}, {4, 5}, {5, 7}, {6, 9}
                                },
                                9),
                equalTo(3));
    }

    @Test
    void videoStitching3() {
        assertThat(new Solution().videoStitching(new int[][] {{0, 1}, {1, 2}}, 5), equalTo(-1));
    }
}
