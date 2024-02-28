package g3001_3100.s3014_minimum_number_of_pushes_to_type_word_i;

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
        assertThat(new Solution().minimumPushes("xycdefghij"), equalTo(12));
    }
}
