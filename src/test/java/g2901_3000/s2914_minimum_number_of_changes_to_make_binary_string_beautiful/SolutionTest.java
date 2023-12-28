package g2901_3000.s2914_minimum_number_of_changes_to_make_binary_string_beautiful;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minChanges() {
        assertThat(new Solution().minChanges("1001"), equalTo(2));
    }

    @Test
    void minChanges2() {
        assertThat(new Solution().minChanges("10"), equalTo(1));
    }

    @Test
    void minChanges3() {
        assertThat(new Solution().minChanges("0000"), equalTo(0));
    }
}
