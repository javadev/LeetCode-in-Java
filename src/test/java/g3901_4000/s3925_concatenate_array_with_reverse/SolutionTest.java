package g3901_4000.s3925_concatenate_array_with_reverse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void concatWithReverse() {
        assertThat(
                new Solution().concatWithReverse(new int[] {1, 2, 3}),
                equalTo(new int[] {1, 2, 3, 3, 2, 1}));
    }

    @Test
    void concatWithReverse2() {
        assertThat(new Solution().concatWithReverse(new int[] {1}), equalTo(new int[] {1, 1}));
    }

    @Test
    void concatWithReverse3() {
        assertThat(
                new Solution().concatWithReverse(new int[] {2, 2}),
                equalTo(new int[] {2, 2, 2, 2}));
    }

    @Test
    void concatWithReverse4() {
        assertThat(
                new Solution().concatWithReverse(new int[] {100, 1}),
                equalTo(new int[] {100, 1, 1, 100}));
    }
}
