package g2701_2800.s2745_construct_the_longest_new_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestString() {
        assertThat(new Solution().longestString(2, 5, 1), equalTo(12));
    }

    @Test
    void longestString2() {
        assertThat(new Solution().longestString(3, 2, 2), equalTo(14));
    }
}
