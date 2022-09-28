package g2001_2100.s2100_find_good_days_to_rob_the_bank;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodDaysToRobBank() {
        assertThat(
                new Solution().goodDaysToRobBank(new int[] {5, 3, 3, 3, 5, 6, 2}, 2),
                equalTo(Arrays.asList(2, 3)));
    }

    @Test
    void goodDaysToRobBank2() {
        assertThat(
                new Solution().goodDaysToRobBank(new int[] {1, 1, 1, 1, 1}, 0),
                equalTo(Arrays.asList(0, 1, 2, 3, 4)));
    }

    @Test
    void goodDaysToRobBank3() {
        assertThat(
                new Solution().goodDaysToRobBank(new int[] {1, 2, 3, 4, 5, 6}, 2),
                equalTo(Collections.emptyList()));
    }
}
