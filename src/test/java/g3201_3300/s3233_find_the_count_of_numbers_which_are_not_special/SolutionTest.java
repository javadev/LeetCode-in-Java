package g3201_3300.s3233_find_the_count_of_numbers_which_are_not_special;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nonSpecialCount() {
        assertThat(new Solution().nonSpecialCount(5, 7), equalTo(3));
    }

    @Test
    void nonSpecialCount2() {
        assertThat(new Solution().nonSpecialCount(4, 16), equalTo(11));
    }
}
