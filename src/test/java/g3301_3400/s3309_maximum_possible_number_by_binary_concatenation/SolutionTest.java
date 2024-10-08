package g3301_3400.s3309_maximum_possible_number_by_binary_concatenation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxGoodNumber() {
        assertThat(new Solution().maxGoodNumber(new int[] {1, 2, 3}), equalTo(30));
    }

    @Test
    void maxGoodNumber2() {
        assertThat(new Solution().maxGoodNumber(new int[] {2, 8, 16}), equalTo(1296));
    }
}
