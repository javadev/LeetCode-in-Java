package g1201_1300.s1281_subtract_the_product_and_sum_of_digits_of_an_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subtractProductAndSum() {
        assertThat(new Solution().subtractProductAndSum(234), equalTo(15));
    }

    @Test
    void subtractProductAndSum2() {
        assertThat(new Solution().subtractProductAndSum(4421), equalTo(21));
    }
}
