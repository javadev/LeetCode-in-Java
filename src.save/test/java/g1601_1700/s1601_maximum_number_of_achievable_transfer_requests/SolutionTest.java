package g1601_1700.s1601_maximum_number_of_achievable_transfer_requests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumRequests() {
        assertThat(
                new Solution()
                        .maximumRequests(
                                5, new int[][] {{0, 1}, {1, 0}, {0, 1}, {1, 2}, {2, 0}, {3, 4}}),
                equalTo(5));
    }

    @Test
    void maximumRequests2() {
        assertThat(
                new Solution().maximumRequests(3, new int[][] {{0, 0}, {1, 2}, {2, 1}}),
                equalTo(3));
    }

    @Test
    void maximumRequests3() {
        assertThat(
                new Solution().maximumRequests(4, new int[][] {{0, 3}, {3, 1}, {1, 2}, {2, 0}}),
                equalTo(4));
    }
}
