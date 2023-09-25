package g2001_2100.s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfPairs() {
        assertThat(
                new Solution().numOfPairs(new String[] {"777", "7", "77", "77"}, "7777"),
                equalTo(4));
    }

    @Test
    void numOfPairs2() {
        assertThat(
                new Solution().numOfPairs(new String[] {"123", "4", "12", "34"}, "1234"),
                equalTo(2));
    }

    @Test
    void numOfPairs3() {
        assertThat(new Solution().numOfPairs(new String[] {"1", "1", "1"}, "11"), equalTo(6));
    }
}
