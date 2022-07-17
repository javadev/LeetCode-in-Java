package g2001_2100.s2032_two_out_of_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void twoOutOfThree() {
        assertThat(
                new Solution()
                        .twoOutOfThree(new int[] {1, 1, 3, 2}, new int[] {2, 3}, new int[] {3}),
                equalTo(Arrays.asList(2, 3)));
    }

    @Test
    void twoOutOfThree2() {
        assertThat(
                new Solution().twoOutOfThree(new int[] {3, 1}, new int[] {2, 3}, new int[] {1, 2}),
                equalTo(Arrays.asList(1, 2, 3)));
    }

    @Test
    void twoOutOfThree3() {
        assertThat(
                new Solution()
                        .twoOutOfThree(new int[] {1, 2, 2}, new int[] {4, 3, 3}, new int[] {5}),
                equalTo(Collections.emptyList()));
    }
}
