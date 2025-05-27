package g3501_3600.s3563_lexicographically_smallest_string_after_adjacent_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lexicographicallySmallestString() {
        assertThat(new Solution().lexicographicallySmallestString("abc"), equalTo("a"));
    }

    @Test
    void lexicographicallySmallestString2() {
        assertThat(new Solution().lexicographicallySmallestString("bcda"), equalTo(""));
    }

    @Test
    void lexicographicallySmallestString3() {
        assertThat(new Solution().lexicographicallySmallestString("zdce"), equalTo("zdce"));
    }
}
