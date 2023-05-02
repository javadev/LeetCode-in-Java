package g1901_2000.s1904_the_number_of_full_rounds_you_have_played;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfRounds() {
        assertThat(new Solution().numberOfRounds("09:31", "10:14"), equalTo(1));
    }

    @Test
    void numberOfRounds2() {
        assertThat(new Solution().numberOfRounds("21:30", "03:00"), equalTo(22));
    }

    @Test
    void numberOfRounds3() {
        assertThat(new Solution().numberOfRounds("21:30", "21:30"), equalTo(0));
    }
}
