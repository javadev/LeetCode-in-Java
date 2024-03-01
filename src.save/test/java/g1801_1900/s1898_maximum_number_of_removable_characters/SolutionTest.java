package g1801_1900.s1898_maximum_number_of_removable_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumRemovals() {
        assertThat(new Solution().maximumRemovals("abcacb", "ab", new int[] {3, 1, 0}), equalTo(2));
    }

    @Test
    void maximumRemovals2() {
        assertThat(
                new Solution().maximumRemovals("abcbddddd", "abcd", new int[] {3, 2, 1, 4, 5, 6}),
                equalTo(1));
    }
}
