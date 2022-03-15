package g1301_1400.s1312_minimum_insertion_steps_to_make_a_string_palindrome;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minInsertions() {
        assertThat(new Solution().minInsertions("zzazz"), equalTo(0));
    }

    @Test
    void minInsertions2() {
        assertThat(new Solution().minInsertions("mbadm"), equalTo(2));
    }

    @Test
    void minInsertions3() {
        assertThat(new Solution().minInsertions("leetcode"), equalTo(5));
    }
}
