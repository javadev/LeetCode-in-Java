package g1501_1600.s1583_count_unhappy_friends;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void unhappyFriends() {
        assertThat(
                new Solution()
                        .unhappyFriends(
                                4,
                                new int[][] {{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}},
                                new int[][] {{0, 1}, {2, 3}}),
                equalTo(2));
    }

    @Test
    void unhappyFriends2() {
        assertThat(
                new Solution().unhappyFriends(2, new int[][] {{1}, {0}}, new int[][] {{1, 0}}),
                equalTo(0));
    }

    @Test
    void unhappyFriends3() {
        assertThat(
                new Solution()
                        .unhappyFriends(
                                4,
                                new int[][] {{1, 3, 2}, {2, 3, 0}, {1, 3, 0}, {0, 2, 1}},
                                new int[][] {{1, 3}, {0, 2}}),
                equalTo(4));
    }
}
