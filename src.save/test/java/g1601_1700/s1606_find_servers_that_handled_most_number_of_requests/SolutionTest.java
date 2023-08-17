package g1601_1700.s1606_find_servers_that_handled_most_number_of_requests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void busiestServers() {
        assertThat(
                new Solution()
                        .busiestServers(3, new int[] {1, 2, 3, 4, 5}, new int[] {5, 2, 3, 3, 3}),
                equalTo(Collections.singletonList(1)));
    }

    @Test
    void busiestServers2() {
        assertThat(
                new Solution().busiestServers(3, new int[] {1, 2, 3, 4}, new int[] {1, 2, 1, 2}),
                equalTo(Collections.singletonList(0)));
    }

    @Test
    void busiestServers3() {
        assertThat(
                new Solution().busiestServers(3, new int[] {1, 2, 3}, new int[] {10, 12, 11}),
                equalTo(Arrays.asList(0, 1, 2)));
    }
}
