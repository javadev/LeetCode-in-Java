package g2801_2900.s2843_count_symmetric_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSymmetricIntegers() {
        assertThat(new Solution().countSymmetricIntegers(1, 100), equalTo(9));
    }

    @Test
    void countSymmetricIntegers2() {
        assertThat(new Solution().countSymmetricIntegers(1200, 1230), equalTo(4));
    }
}
