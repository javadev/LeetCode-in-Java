package g3001_3100.s3074_apple_redistribution_into_boxes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumBoxes() {
        assertThat(
                new Solution().minimumBoxes(new int[] {1, 3, 2}, new int[] {4, 3, 1, 5, 2}),
                equalTo(2));
    }

    @Test
    void minimumBoxes2() {
        assertThat(
                new Solution().minimumBoxes(new int[] {5, 5, 5}, new int[] {2, 4, 2, 7}),
                equalTo(4));
    }
}
