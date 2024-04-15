package g2401_2500.s2477_minimum_fuel_cost_to_report_to_the_capital;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumFuelCost() {
        assertThat(
                new Solution()
                        .minimumFuelCost(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[0,3]"),
                                5),
                equalTo(3L));
    }

    @Test
    void minimumFuelCost2() {
        assertThat(
                new Solution()
                        .minimumFuelCost(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]"),
                                2),
                equalTo(7L));
    }

    @Test
    void minimumFuelCost3() {
        assertThat(new Solution().minimumFuelCost(new int[][] {}, 1), equalTo(0L));
    }
}
