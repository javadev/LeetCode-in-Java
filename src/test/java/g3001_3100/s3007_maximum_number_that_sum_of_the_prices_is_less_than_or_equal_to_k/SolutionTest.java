package g3001_3100.s3007_maximum_number_that_sum_of_the_prices_is_less_than_or_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaximumNumber() {
        assertThat(new Solution().findMaximumNumber(9, 1), equalTo(6L));
    }

    @Test
    void findMaximumNumber2() {
        assertThat(new Solution().findMaximumNumber(7, 2), equalTo(9L));
    }
}
