package g0801_0900.s0825_friends_of_appropriate_ages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numFriendRequests() {
        assertThat(new Solution().numFriendRequests(new int[] {16, 16}), equalTo(2));
    }

    @Test
    void numFriendRequests2() {
        assertThat(new Solution().numFriendRequests(new int[] {16, 17, 18}), equalTo(2));
    }

    @Test
    void numFriendRequests3() {
        assertThat(new Solution().numFriendRequests(new int[] {20, 30, 100, 110, 120}), equalTo(3));
    }
}
