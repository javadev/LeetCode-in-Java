package g0001_0100.s0048_rotate_image;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void rotateImage() {
        int[][] expected = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        int[][] input = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        new Solution().rotate(input);

        for (int i = 0; i < expected.length; i++) {
            assertThat(Arrays.toString(input[i]), equalTo(Arrays.toString(expected[i])));
        }
    }
}
