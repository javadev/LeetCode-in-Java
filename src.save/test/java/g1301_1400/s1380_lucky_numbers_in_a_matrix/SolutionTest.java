package g1301_1400.s1380_lucky_numbers_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void luckyNumbers() {
        assertThat(
                new Solution().luckyNumbers(new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}),
                equalTo(Collections.singletonList(15)));
    }

    @Test
    void luckyNumbers2() {
        assertThat(
                new Solution()
                        .luckyNumbers(new int[][] {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}}),
                equalTo(Collections.singletonList(12)));
    }

    @Test
    void luckyNumbers3() {
        assertThat(
                new Solution().luckyNumbers(new int[][] {{7, 8}, {1, 2}}),
                equalTo(Collections.singletonList(7)));
    }
}
