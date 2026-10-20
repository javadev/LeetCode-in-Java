package g3901_4000.s3952_maximum_total_value_of_covered_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTotal() {
        assertThat(new Solution().maxTotal(new int[] {9, 2, 6, 1}, "0101"), equalTo(15L));
    }

    @Test
    void maxTotal2() {
        assertThat(new Solution().maxTotal(new int[] {5, 1, 4}, "001"), equalTo(4L));
    }

    @Test
    void maxTotal3() {
        assertThat(new Solution().maxTotal(new int[] {9, 3, 5}, "011"), equalTo(14L));
    }

    @Test
    void maxTotal4() {
        assertThat(new Solution().maxTotal(new int[] {3}, "1"), equalTo(3L));
    }
}
