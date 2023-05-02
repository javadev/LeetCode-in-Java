package g1501_1600.s1593_split_a_string_into_the_max_number_of_unique_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxUniqueSplit() {
        assertThat(new Solution().maxUniqueSplit("ababccc"), equalTo(5));
    }

    @Test
    void maxUniqueSplit2() {
        assertThat(new Solution().maxUniqueSplit("aba"), equalTo(2));
    }

    @Test
    void maxUniqueSplit3() {
        assertThat(new Solution().maxUniqueSplit("aa"), equalTo(1));
    }
}
