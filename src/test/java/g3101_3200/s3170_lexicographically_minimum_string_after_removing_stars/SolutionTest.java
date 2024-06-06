package g3101_3200.s3170_lexicographically_minimum_string_after_removing_stars;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void clearStars() {
        assertThat(new Solution().clearStars("aaba*"), equalTo("aab"));
    }

    @Test
    void clearStars2() {
        assertThat(new Solution().clearStars("abc"), equalTo("abc"));
    }
}
