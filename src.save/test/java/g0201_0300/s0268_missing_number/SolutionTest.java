package g0201_0300.s0268_missing_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void missingNumber() {
        assertThat(new Solution().missingNumber(new int[] {3, 0, 1}), equalTo(2));
    }

    @Test
    void missingNumber2() {
        assertThat(new Solution().missingNumber(new int[] {3, 0, 1}), equalTo(2));
    }

    @Test
    void missingNumber3() {
        assertThat(new Solution().missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}), equalTo(8));
    }

    @Test
    void missingNumber4() {
        assertThat(new Solution().missingNumber(new int[] {0}), equalTo(1));
    }
}
