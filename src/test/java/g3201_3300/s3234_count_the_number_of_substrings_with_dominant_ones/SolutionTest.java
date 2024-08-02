package g3201_3300.s3234_count_the_number_of_substrings_with_dominant_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSubstrings() {
        assertThat(new Solution().numberOfSubstrings("00011"), equalTo(5));
    }

    @Test
    void numberOfSubstrings2() {
        assertThat(new Solution().numberOfSubstrings("101101"), equalTo(16));
    }
}
