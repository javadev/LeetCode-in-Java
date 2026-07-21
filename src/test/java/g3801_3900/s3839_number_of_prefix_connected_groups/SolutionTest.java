package g3801_3900.s3839_number_of_prefix_connected_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void prefixConnected() {
        assertThat(
                new Solution()
                        .prefixConnected(new String[] {"apple", "apply", "banana", "bandit"}, 2),
                equalTo(2));
    }

    @Test
    void prefixConnected2() {
        assertThat(
                new Solution().prefixConnected(new String[] {"car", "cat", "cartoon"}, 3),
                equalTo(1));
    }

    @Test
    void prefixConnected3() {
        assertThat(
                new Solution()
                        .prefixConnected(new String[] {"bat", "dog", "dog", "doggy", "bat"}, 3),
                equalTo(2));
    }
}
