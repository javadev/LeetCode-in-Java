package g3401_3500.s3456_find_special_substring_of_length_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasSpecialSubstring() {
        assertThat(new Solution().hasSpecialSubstring("aaabaaa", 3), equalTo(true));
    }

    @Test
    void hasSpecialSubstring2() {
        assertThat(new Solution().hasSpecialSubstring("abc", 2), equalTo(false));
    }

    @Test
    void hasSpecialSubstring3() {
        assertThat(new Solution().hasSpecialSubstring("ccc", 2), equalTo(false));
    }
}
