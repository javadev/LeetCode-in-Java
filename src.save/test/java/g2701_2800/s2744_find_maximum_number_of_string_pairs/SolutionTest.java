package g2701_2800.s2744_find_maximum_number_of_string_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumNumberOfStringPairs() {
        assertThat(
                new Solution()
                        .maximumNumberOfStringPairs(new String[] {"cd", "ac", "dc", "ca", "zz"}),
                equalTo(2));
    }

    @Test
    void maximumNumberOfStringPairs2() {
        assertThat(
                new Solution().maximumNumberOfStringPairs(new String[] {"ab", "ba", "cc"}),
                equalTo(1));
    }

    @Test
    void maximumNumberOfStringPairs3() {
        assertThat(
                new Solution().maximumNumberOfStringPairs(new String[] {"aa", "ab"}), equalTo(0));
    }
}
