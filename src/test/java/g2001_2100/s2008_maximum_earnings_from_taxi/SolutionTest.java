package g2001_2100.s2008_maximum_earnings_from_taxi;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTaxiEarnings() {
        assertThat(
                new Solution().maxTaxiEarnings(5, new int[][] {{2, 5, 4}, {1, 5, 1}}), equalTo(7L));
    }

    @Test
    void maxTaxiEarnings2() {
        assertThat(
                new Solution()
                        .maxTaxiEarnings(
                                20,
                                new int[][] {
                                    {1, 6, 1},
                                    {3, 10, 2},
                                    {10, 12, 3},
                                    {11, 12, 2},
                                    {12, 15, 2},
                                    {13, 18, 1}
                                }),
                equalTo(20L));
    }
}
