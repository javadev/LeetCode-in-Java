package g3601_3700.s3678_smallest_absent_positive_greater_than_average;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestAbsent() {
        assertThat(new Solution().smallestAbsent(new int[] {3, 5}), equalTo(6));
    }

    @Test
    void smallestAbsent2() {
        assertThat(new Solution().smallestAbsent(new int[] {-1, 1, 2}), equalTo(3));
    }

    @Test
    void smallestAbsent3() {
        assertThat(new Solution().smallestAbsent(new int[] {4, -1}), equalTo(2));
    }

    @Test
    void smallestAbsent4() {
        assertThat(new Solution().smallestAbsent(new int[] {-2, -1}), equalTo(1));
    }
}
