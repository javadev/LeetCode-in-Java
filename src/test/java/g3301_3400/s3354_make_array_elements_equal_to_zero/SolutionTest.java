package g3301_3400.s3354_make_array_elements_equal_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countValidSelections() {
        assertThat(new Solution().countValidSelections(new int[] {1, 0, 2, 0, 3}), equalTo(2));
    }

    @Test
    void countValidSelections2() {
        assertThat(
                new Solution().countValidSelections(new int[] {2, 3, 4, 0, 4, 1, 0}), equalTo(0));
    }

    @Test
    void countValidSelections3() {
        assertThat(
                new Solution()
                        .countValidSelections(new int[] {16, 13, 10, 0, 0, 0, 10, 6, 7, 8, 7}),
                equalTo(3));
    }
}
