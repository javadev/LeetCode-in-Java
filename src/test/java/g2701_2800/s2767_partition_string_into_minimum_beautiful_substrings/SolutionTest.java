package g2701_2800.s2767_partition_string_into_minimum_beautiful_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumBeautifulSubstrings() {
        int result = new Solution().minimumBeautifulSubstrings("1011");
        assertThat(result, equalTo(2));
    }

    @Test
    void minimumBeautifulSubstrings2() {
        int result = new Solution().minimumBeautifulSubstrings("0");
        assertThat(result, equalTo(-1));
    }
}
