package g1801_1900.s1830_minimum_number_of_operations_to_make_string_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void makeStringSorted() {
        assertThat(new Solution().makeStringSorted("cba"), equalTo(5));
    }

    @Test
    void makeStringSorted2() {
        assertThat(new Solution().makeStringSorted("aabaa"), equalTo(2));
    }
}
