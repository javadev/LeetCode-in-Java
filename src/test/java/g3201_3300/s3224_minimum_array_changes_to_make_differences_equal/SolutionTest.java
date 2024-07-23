package g3201_3300.s3224_minimum_array_changes_to_make_differences_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minChanges() {
        assertThat(new Solution().minChanges(new int[] {1, 0, 1, 2, 4, 3}, 4), equalTo(2));
    }

    @Test
    void minChanges2() {
        assertThat(new Solution().minChanges(new int[] {0, 1, 2, 3, 3, 6, 5, 4}, 6), equalTo(2));
    }
}
