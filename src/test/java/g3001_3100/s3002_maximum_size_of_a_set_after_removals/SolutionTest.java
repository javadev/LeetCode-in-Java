package g3001_3100.s3002_maximum_size_of_a_set_after_removals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSetSize() {
        assertThat(
                new Solution().maximumSetSize(new int[] {1, 2, 1, 2}, new int[] {1, 1, 1, 1}),
                equalTo(2));
    }

    @Test
    void maximumSetSize2() {
        assertThat(
                new Solution()
                        .maximumSetSize(new int[] {1, 2, 3, 4, 5, 6}, new int[] {2, 3, 2, 3, 2, 3}),
                equalTo(5));
    }

    @Test
    void maximumSetSize3() {
        assertThat(
                new Solution()
                        .maximumSetSize(new int[] {1, 1, 2, 2, 3, 3}, new int[] {4, 4, 5, 5, 6, 6}),
                equalTo(6));
    }
}
