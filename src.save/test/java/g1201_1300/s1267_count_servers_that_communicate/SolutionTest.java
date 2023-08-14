package g1201_1300.s1267_count_servers_that_communicate;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countServers() {
        assertThat(new Solution().countServers(new int[][] {{1, 0}, {0, 1}}), equalTo(0));
    }

    @Test
    void countServers2() {
        assertThat(new Solution().countServers(new int[][] {{1, 0}, {1, 1}}), equalTo(3));
    }

    @Test
    void countServers3() {
        assertThat(
                new Solution()
                        .countServers(
                                new int[][] {
                                    {1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}
                                }),
                equalTo(4));
    }
}
