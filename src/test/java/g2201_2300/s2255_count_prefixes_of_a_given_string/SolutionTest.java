package g2201_2300.s2255_count_prefixes_of_a_given_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPrefixes() {
        assertThat(
                new Solution()
                        .countPrefixes(new String[] {"a", "b", "c", "ab", "bc", "abc"}, "abc"),
                equalTo(3));
    }

    @Test
    void countPrefixes2() {
        assertThat(new Solution().countPrefixes(new String[] {"a", "a"}, "aa"), equalTo(2));
    }
}
