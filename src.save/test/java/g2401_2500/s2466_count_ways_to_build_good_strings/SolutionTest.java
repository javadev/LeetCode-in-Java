package g2401_2500.s2466_count_ways_to_build_good_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodStrings() {
        assertThat(new Solution().countGoodStrings(3, 3, 1, 1), equalTo(8));
    }

    @Test
    void countGoodStrings2() {
        assertThat(new Solution().countGoodStrings(2, 3, 1, 2), equalTo(5));
    }
}
