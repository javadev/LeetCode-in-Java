package g3901_4000.s3960_frequency_balance_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getLength() {
        assertThat(new Solution().getLength(new int[] {1, 2, 2, 1, 2, 3, 3, 3}), equalTo(5));
    }

    @Test
    void getLength2() {
        assertThat(new Solution().getLength(new int[] {5, 5, 5, 5}), equalTo(4));
    }

    @Test
    void getLength3() {
        assertThat(new Solution().getLength(new int[] {1, 2, 3, 4}), equalTo(1));
    }

    @Test
    void getLength4() {
        assertThat(new Solution().getLength(new int[] {1, 1}), equalTo(2));
    }
}
