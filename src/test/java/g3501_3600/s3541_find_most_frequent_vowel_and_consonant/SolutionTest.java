package g3501_3600.s3541_find_most_frequent_vowel_and_consonant;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFreqSum() {
        assertThat(new Solution().maxFreqSum("successes"), equalTo(6));
    }

    @Test
    void maxFreqSum2() {
        assertThat(new Solution().maxFreqSum("aeiaeia"), equalTo(3));
    }
}
