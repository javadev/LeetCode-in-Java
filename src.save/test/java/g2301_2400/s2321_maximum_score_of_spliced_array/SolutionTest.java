package g2301_2400.s2321_maximum_score_of_spliced_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumsSplicedArray() {
        assertThat(
                new Solution().maximumsSplicedArray(new int[] {60, 60, 60}, new int[] {10, 90, 10}),
                equalTo(210));
    }

    @Test
    void maximumsSplicedArray2() {
        assertThat(
                new Solution()
                        .maximumsSplicedArray(
                                new int[] {20, 40, 20, 70, 30}, new int[] {50, 20, 50, 40, 20}),
                equalTo(220));
    }

    @Test
    void maximumsSplicedArray3() {
        assertThat(
                new Solution().maximumsSplicedArray(new int[] {7, 11, 13}, new int[] {1, 1, 1}),
                equalTo(31));
    }

    @Test
    void maximumsSplicedArray4() {
        assertThat(
                new Solution().maximumsSplicedArray(new int[] {1, 1, 1}, new int[] {7, 11, 13}),
                equalTo(31));
    }
}
