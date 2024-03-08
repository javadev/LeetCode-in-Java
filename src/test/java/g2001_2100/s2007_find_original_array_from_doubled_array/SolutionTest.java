package g2001_2100.s2007_find_original_array_from_doubled_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findOriginalArray() {
        assertThat(
                new Solution().findOriginalArray(new int[] {1, 3, 4, 2, 6, 8}),
                equalTo(new int[] {1, 3, 4}));
    }

    @Test
    void findOriginalArray2() {
        assertThat(new Solution().findOriginalArray(new int[] {6, 3, 0, 1}), equalTo(new int[] {}));
    }

    @Test
    void findOriginalArray3() {
        assertThat(new Solution().findOriginalArray(new int[] {1}), equalTo(new int[] {}));
    }
}
