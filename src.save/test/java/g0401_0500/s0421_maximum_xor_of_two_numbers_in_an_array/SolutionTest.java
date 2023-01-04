package g0401_0500.s0421_maximum_xor_of_two_numbers_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaximumXOR() {
        assertThat(new Solution().findMaximumXOR(new int[] {3, 10, 5, 25, 2, 8}), equalTo(28));
    }

    @Test
    void findMaximumXOR2() {
        assertThat(
                new Solution()
                        .findMaximumXOR(new int[] {14, 70, 53, 83, 49, 91, 36, 80, 92, 51, 66, 70}),
                equalTo(127));
    }
}
