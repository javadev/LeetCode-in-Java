package g3401_3500.s3438_find_valid_pair_of_adjacent_digits_in_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findValidPair() {
        assertThat(new Solution().findValidPair("2523533"), equalTo("23"));
    }

    @Test
    void findValidPair2() {
        assertThat(new Solution().findValidPair("221"), equalTo("21"));
    }

    @Test
    void findValidPair3() {
        assertThat(new Solution().findValidPair("22"), equalTo(""));
    }
}
