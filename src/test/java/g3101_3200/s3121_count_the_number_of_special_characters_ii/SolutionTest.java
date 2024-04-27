package g3101_3200.s3121_count_the_number_of_special_characters_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSpecialChars() {
        assertThat(new Solution().numberOfSpecialChars("aaAbcBC"), equalTo(3));
    }

    @Test
    void numberOfSpecialChars2() {
        assertThat(new Solution().numberOfSpecialChars("abc"), equalTo(0));
    }

    @Test
    void numberOfSpecialChars3() {
        assertThat(new Solution().numberOfSpecialChars("AbBCab"), equalTo(0));
    }
}
