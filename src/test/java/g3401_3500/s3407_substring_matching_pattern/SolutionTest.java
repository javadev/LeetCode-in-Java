package g3401_3500.s3407_substring_matching_pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasMatch() {
        assertThat(new Solution().hasMatch("leetcode", "ee*e"), equalTo(true));
    }

    @Test
    void hasMatch2() {
        assertThat(new Solution().hasMatch("car", "c*v"), equalTo(false));
    }

    @Test
    void hasMatch3() {
        assertThat(new Solution().hasMatch("luck", "u*"), equalTo(true));
    }
}
