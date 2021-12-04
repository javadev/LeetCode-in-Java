package g0201_0300.s0268_missing_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void missingNumber() {
        assertThat(new Solution().missingNumber(new int[] {3, 0, 1}), equalTo(2));
    }

    @Test
    public void missingNumber2() {
        assertThat(new Solution().missingNumber(new int[] {3, 0, 1}), equalTo(2));
    }

    @Test
    public void missingNumber3() {
        assertThat(new Solution().missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}), equalTo(8));
    }

    @Test
    public void missingNumber4() {
        assertThat(new Solution().missingNumber(new int[] {0}), equalTo(1));
    }
}
