package g2001_2100.s2016_maximum_difference_between_increasing_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumDifference() {
        assertThat(new Solution().maximumDifference(new int[] {7, 1, 5, 4}), equalTo(4));
    }

    @Test
    void maximumDifference2() {
        assertThat(new Solution().maximumDifference(new int[] {9, 4, 3, 2}), equalTo(-1));
    }

    @Test
    void maximumDifference3() {
        assertThat(new Solution().maximumDifference(new int[] {1, 5, 2, 10}), equalTo(9));
    }
}
