package g3201_3300.s3226_number_of_bit_changes_to_make_two_integers_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minChanges() {
        assertThat(new Solution().minChanges(13, 4), equalTo(2));
    }

    @Test
    void minChanges2() {
        assertThat(new Solution().minChanges(21, 21), equalTo(0));
    }

    @Test
    void minChanges3() {
        assertThat(new Solution().minChanges(14, 13), equalTo(-1));
    }
}
