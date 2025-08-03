package g3601_3700.s3637_trionic_array_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isTrionic() {
        assertThat(new Solution().isTrionic(new int[] {1, 3, 5, 4, 2, 6}), equalTo(true));
    }

    @Test
    void isTrionic2() {
        assertThat(new Solution().isTrionic(new int[] {2, 1, 3}), equalTo(false));
    }
}
