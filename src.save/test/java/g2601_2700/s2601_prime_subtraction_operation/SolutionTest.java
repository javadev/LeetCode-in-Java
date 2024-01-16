package g2601_2700.s2601_prime_subtraction_operation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void primeSubOperation() {
        assertThat(new Solution().primeSubOperation(new int[] {4, 9, 6, 10}), equalTo(true));
    }

    @Test
    void primeSubOperation2() {
        assertThat(new Solution().primeSubOperation(new int[] {6, 8, 11, 12}), equalTo(true));
    }

    @Test
    void primeSubOperation3() {
        assertThat(new Solution().primeSubOperation(new int[] {5, 8, 3}), equalTo(false));
    }
}
