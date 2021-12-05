package g0101_0200.s0189_rotate_array_medium_top_100_liked_questions_top_interview_questions_array_math_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void rotate() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(array, 3);
        assertThat(array, equalTo(new int[] {5, 6, 7, 1, 2, 3, 4}));
    }

    @Test
    public void rotate2() {
        int[] array = new int[] {-1, -100, 3, 99};
        new Solution().rotate(array, 2);
        assertThat(array, equalTo(new int[] {3, 99, -1, -100}));
    }
}
