package g1301_1400.s1397_find_all_good_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findGoodStrings() {
        assertThat(new Solution().findGoodStrings(2, "aa", "da", "b"), equalTo(51));
    }

    @Test
    void findGoodStrings2() {
        assertThat(new Solution().findGoodStrings(8, "leetcode", "leetgoes", "leet"), equalTo(0));
    }

    @Test
    void findGoodStrings3() {
        assertThat(new Solution().findGoodStrings(2, "gx", "gz", "x"), equalTo(2));
    }
}
