package g1301_1400.s1386_cinema_seat_allocation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumberOfFamilies() {
        assertThat(
                new Solution()
                        .maxNumberOfFamilies(
                                3, new int[][] {{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}}),
                equalTo(4));
    }

    @Test
    void maxNumberOfFamilies2() {
        assertThat(
                new Solution().maxNumberOfFamilies(2, new int[][] {{2, 1}, {1, 8}, {2, 6}}),
                equalTo(2));
    }

    @Test
    void maxNumberOfFamilies3() {
        assertThat(
                new Solution().maxNumberOfFamilies(4, new int[][] {{4, 3}, {1, 4}, {4, 6}, {1, 7}}),
                equalTo(4));
    }
}
