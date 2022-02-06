package g0801_0900.s0878_nth_magical_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nthMagicalNumber() {
        assertThat(new Solution().nthMagicalNumber(1, 2, 3), equalTo(2));
    }

    @Test
    void nthMagicalNumber2() {
        assertThat(new Solution().nthMagicalNumber(4, 2, 3), equalTo(6));
    }
}
