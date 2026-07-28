package g3801_3900.s3869_count_fancy_numbers_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countsNumbersThatAreGoodOrHaveAGoodDigitSum() {
        Solution solution = new Solution();

        assertThat(solution.countFancy(8, 10), equalTo(3L));
        assertThat(solution.countFancy(12340, 12341), equalTo(1L));
        assertThat(solution.countFancy(123456788, 123456788), equalTo(0L));
    }
}
