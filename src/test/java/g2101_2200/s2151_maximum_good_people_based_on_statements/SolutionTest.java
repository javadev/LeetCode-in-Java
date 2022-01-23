package g2101_2200.s2151_maximum_good_people_based_on_statements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumGood() {
        assertThat(
                new Solution().maximumGood(new int[][] {{2, 1, 2}, {1, 2, 2}, {2, 0, 2}}),
                equalTo(2));
    }

    @Test
    void maximumGood2() {
        assertThat(new Solution().maximumGood(new int[][] {{2, 0}, {0, 2}}), equalTo(1));
    }
}
