package g3401_3500.s3452_sum_of_good_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfGoodNumbers() {
        assertThat(new Solution().sumOfGoodNumbers(new int[] {1, 3, 2, 1, 5, 4}, 2), equalTo(12));
    }

    @Test
    void sumOfGoodNumbers2() {
        assertThat(new Solution().sumOfGoodNumbers(new int[] {2, 1}, 1), equalTo(2));
    }
}
