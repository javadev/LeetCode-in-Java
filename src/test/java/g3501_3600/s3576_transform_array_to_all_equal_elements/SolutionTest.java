package g3501_3600.s3576_transform_array_to_all_equal_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakeEqual() {
        assertThat(new Solution().canMakeEqual(new int[] {1, -1, 1, -1, 1}, 3), equalTo(true));
    }

    @Test
    void canMakeEqual2() {
        assertThat(new Solution().canMakeEqual(new int[] {-1, -1, -1, 1, 1, 1}, 5), equalTo(false));
    }

    @Test
    void canMakeEqual3() {
        assertThat(new Solution().canMakeEqual(new int[] {1}, 3), equalTo(true));
    }
}
