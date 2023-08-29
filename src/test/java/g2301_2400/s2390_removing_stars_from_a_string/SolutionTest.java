package g2301_2400.s2390_removing_stars_from_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeStars() {
        assertThat(new Solution().removeStars("leet**cod*e"), equalTo("lecoe"));
    }

    @Test
    void removeStars2() {
        assertThat(new Solution().removeStars("erase*****"), equalTo(""));
    }
}
