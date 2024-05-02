package g3101_3200.s3132_find_the_integer_added_to_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumAddedInteger() {
        assertThat(
                new Solution()
                        .minimumAddedInteger(new int[] {4, 20, 16, 12, 8}, new int[] {14, 18, 10}),
                equalTo(-2));
    }

    @Test
    void minimumAddedInteger2() {
        assertThat(
                new Solution().minimumAddedInteger(new int[] {3, 5, 5, 3}, new int[] {7, 7}),
                equalTo(2));
    }
}
