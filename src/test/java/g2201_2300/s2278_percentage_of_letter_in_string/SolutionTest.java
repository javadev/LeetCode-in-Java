package g2201_2300.s2278_percentage_of_letter_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void percentageLetter() {
        assertThat(new Solution().percentageLetter("foobar", 'o'), equalTo(33));
    }

    @Test
    void percentageLetter2() {
        assertThat(new Solution().percentageLetter("jjjj", 'k'), equalTo(0));
    }
}
