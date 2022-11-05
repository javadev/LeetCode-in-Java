package g2301_2400.s2315_count_asterisks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countAsterisks() {
        assertThat(new Solution().countAsterisks("l|*e*et|c**o|*de|"), equalTo(2));
    }

    @Test
    void countAsterisks2() {
        assertThat(new Solution().countAsterisks("iamprogrammer"), equalTo(0));
    }

    @Test
    void countAsterisks3() {
        assertThat(new Solution().countAsterisks("yo|uar|e**|b|e***au|tifu|l"), equalTo(5));
    }
}
