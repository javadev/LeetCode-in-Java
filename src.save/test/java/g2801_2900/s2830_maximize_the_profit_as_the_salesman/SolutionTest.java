package g2801_2900.s2830_maximize_the_profit_as_the_salesman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeTheProfit() {
        int[][] input = {{0, 0, 1}, {0, 2, 2}, {1, 3, 2}};
        assertThat(new Solution().maximizeTheProfit(5, ArrayUtils.getLists(input)), equalTo(3));
    }

    @Test
    void maximizeTheProfit2() {
        int[][] input = {{0, 0, 1}, {0, 2, 10}, {1, 3, 2}};
        assertThat(new Solution().maximizeTheProfit(5, ArrayUtils.getLists(input)), equalTo(10));
    }
}
