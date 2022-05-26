package g2001_2100.s2048_next_greater_numerically_balanced_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nextBeautifulNumber() {
        assertThat(new Solution().nextBeautifulNumber(1), equalTo(22));
    }

    @Test
    void nextBeautifulNumber2() {
        assertThat(new Solution().nextBeautifulNumber(1000), equalTo(1333));
    }

    @Test
    void nextBeautifulNumber3() {
        assertThat(new Solution().nextBeautifulNumber(3000), equalTo(3133));
    }
}
