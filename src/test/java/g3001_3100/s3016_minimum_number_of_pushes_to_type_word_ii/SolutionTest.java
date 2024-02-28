package g3001_3100.s3016_minimum_number_of_pushes_to_type_word_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumPushes() {
        assertThat(new Solution().minimumPushes("abcde"), equalTo(5));
    }

    @Test
    void minimumPushes2() {
        assertThat(new Solution().minimumPushes("xyzxyzxyzxyz"), equalTo(12));
    }

    @Test
    void minimumPushes3() {
        assertThat(new Solution().minimumPushes("aabbccddeeffgghhiiiiii"), equalTo(24));
    }
}
