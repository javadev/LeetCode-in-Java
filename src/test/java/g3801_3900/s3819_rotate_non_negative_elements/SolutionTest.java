package g3801_3900.s3819_rotate_non_negative_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rotateElements() {
        assertThat(
                new Solution().rotateElements(new int[] {1, -2, 3, -4}, 3),
                equalTo(new int[] {3, -2, 1, -4}));
    }

    @Test
    void rotateElements2() {
        assertThat(
                new Solution().rotateElements(new int[] {-3, -2, 7}, 1),
                equalTo(new int[] {-3, -2, 7}));
    }

    @Test
    void rotateElements3() {
        assertThat(
                new Solution().rotateElements(new int[] {5, 4, -9, 6}, 2),
                equalTo(new int[] {6, 5, -9, 4}));
    }
}
