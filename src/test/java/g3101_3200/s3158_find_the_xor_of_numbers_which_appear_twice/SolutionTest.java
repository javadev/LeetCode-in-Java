package g3101_3200.s3158_find_the_xor_of_numbers_which_appear_twice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void duplicateNumbersXOR() {
        assertThat(new Solution().duplicateNumbersXOR(new int[] {1, 2, 1, 3}), equalTo(1));
    }

    @Test
    void duplicateNumbersXOR2() {
        assertThat(new Solution().duplicateNumbersXOR(new int[] {1, 2, 3}), equalTo(0));
    }

    @Test
    void duplicateNumbersXOR3() {
        assertThat(new Solution().duplicateNumbersXOR(new int[] {1, 2, 2, 1}), equalTo(3));
    }
}
