package g2001_2100.s2076_process_restricted_friend_requests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void friendRequests() {
        assertThat(
                new Solution()
                        .friendRequests(3, new int[][] {{0, 1}}, new int[][] {{0, 2}, {2, 1}}),
                equalTo(new boolean[] {true, false}));
    }

    @Test
    void friendRequests2() {
        assertThat(
                new Solution()
                        .friendRequests(3, new int[][] {{0, 1}}, new int[][] {{1, 2}, {0, 2}}),
                equalTo(new boolean[] {true, false}));
    }

    @Test
    void friendRequests3() {
        assertThat(
                new Solution()
                        .friendRequests(
                                5,
                                new int[][] {{0, 1}, {1, 2}, {2, 3}},
                                new int[][] {{0, 4}, {1, 2}, {3, 1}, {3, 4}}),
                equalTo(new boolean[] {true, false, true, false}));
    }
}
