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

    @Test
    void minimumAddedInteger3() {
        assertThat(
                new Solution().minimumAddedInteger(new int[] {10, 20, 30, 40}, new int[] {35, 45}),
                equalTo(5));
    }

    @Test
    void minimumAddedInteger4() {
        assertThat(
                new Solution().minimumAddedInteger(new int[] {2, 5, 7, 8}, new int[] {9, 10}),
                equalTo(2));
    }

    @Test
    void minimumAddedInteger5() {
        assertThat(
                new Solution().minimumAddedInteger(new int[] {2, 2, 2, 4, 4}, new int[] {6, 6, 8}),
                equalTo(4));
    }

    @Test
    void minimumAddedInteger6() {
        assertThat(
                new Solution().minimumAddedInteger(new int[] {5, 5, 5, 5}, new int[] {5, 5}),
                equalTo(0));
    }

    @Test
    void minimumAddedInteger7() {
        assertThat(
                new Solution()
                        .minimumAddedInteger(
                                new int[] {1_000_000, 2_000_000, 3_000_000, 4_000_000},
                                new int[] {3_000_002, 4_000_002}),
                equalTo(2));
    }
}
