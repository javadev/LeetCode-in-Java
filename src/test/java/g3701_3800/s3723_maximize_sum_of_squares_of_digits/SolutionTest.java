package g3701_3800.s3723_maximize_sum_of_squares_of_digits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumOfSquares() {
        assertThat(new Solution().maxSumOfSquares(2, 3), equalTo("30"));
    }

    @Test
    void maxSumOfSquares2() {
        assertThat(new Solution().maxSumOfSquares(2, 17), equalTo("98"));
    }

    @Test
    void maxSumOfSquares3() {
        assertThat(new Solution().maxSumOfSquares(1, 10), equalTo(""));
    }

    @Test
    void maxSumOfSquares4() {
        // sum = 27 → nines = 3
        // places = 2 < 3 → should return ""
        String result = new Solution().maxSumOfSquares(2, 27);
        assertThat(result, equalTo(""));
    }

    @Test
    void maxSumOfSquares5() {
        // sum = 28 → nines = 3, remSum = 1
        // places = 3 == nines and remSum > 0 → should return ""
        String result = new Solution().maxSumOfSquares(3, 28);
        assertThat(result, equalTo(""));
    }

    @Test
    void maxSumOfSquares6() {
        // sum = 27 → nines = 3, remSum = 0
        // places = 3 == nines and remSum == 0 → should return "999"
        String result = new Solution().maxSumOfSquares(3, 27);
        assertThat(result, equalTo("999"));
    }

    @Test
    void maxSumOfSquares7() {
        // sum = 10 → nines = 1, remSum = 1
        // ans = "9" + "1" = "91", length = 2, places = 2 → no padding
        String result = new Solution().maxSumOfSquares(2, 10);
        assertThat(result, equalTo("91"));
    }

    @Test
    void maxSumOfSquares8() {
        // sum = 10 → nines = 1, remSum = 1
        // ans = "9" + "1" = "91", length = 2, places = 4 → add two zeros
        String result = new Solution().maxSumOfSquares(4, 10);
        assertThat(result, equalTo("9100"));
    }

    @Test
    void maxSumOfSquares9() {
        // sum = 5 → nines = 0, remSum = 5 → ans = "5"
        // places = 3 → add two zeros
        String result = new Solution().maxSumOfSquares(3, 5);
        assertThat(result, equalTo("500"));
    }
}
