package g4001_4100.s4036_lexicographically_largest_string_after_pair_transformations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestString() {
        assertThat(
                new Solution().largestString(new int[] {1, 3, 0}),
                equalTo(new String[] {"a", "ba", ""}));
    }

    @Test
    void largestString2() {
        assertThat(
                new Solution().largestString(new int[] {(1 << 25) | 1}),
                equalTo(new String[] {"za"}));
    }
}
