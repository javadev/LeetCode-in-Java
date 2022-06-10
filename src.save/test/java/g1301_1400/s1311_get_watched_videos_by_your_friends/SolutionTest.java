package g1301_1400.s1311_get_watched_videos_by_your_friends;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void watchedVideosByFriends() {
        assertThat(
                new Solution()
                        .watchedVideosByFriends(
                                Arrays.asList(
                                        Arrays.asList("A", "B"),
                                        Collections.singletonList("C"),
                                        Arrays.asList("B", "C"),
                                        Collections.singletonList("D")),
                                new int[][] {{1, 2}, {0, 3}, {0, 3}, {1, 2}},
                                0,
                                1),
                equalTo(Arrays.asList("B", "C")));
    }

    @Test
    void watchedVideosByFriends2() {
        assertThat(
                new Solution()
                        .watchedVideosByFriends(
                                Arrays.asList(
                                        Arrays.asList("A", "B"),
                                        Collections.singletonList("C"),
                                        Arrays.asList("B", "C"),
                                        Collections.singletonList("D")),
                                new int[][] {{1, 2}, {0, 3}, {0, 3}, {1, 2}},
                                0,
                                2),
                equalTo(Collections.singletonList("D")));
    }
}
