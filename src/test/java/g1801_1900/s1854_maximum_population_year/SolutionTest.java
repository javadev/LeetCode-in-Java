package g1801_1900.s1854_maximum_population_year;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumPopulation() {
        assertThat(
                new Solution().maximumPopulation(new int[][] {{1993, 1999}, {2000, 2010}}),
                equalTo(1993));
    }

    @Test
    void maximumPopulation2() {
        assertThat(
                new Solution()
                        .maximumPopulation(new int[][] {{1950, 1961}, {1960, 1971}, {1970, 1981}}),
                equalTo(1960));
    }
}
