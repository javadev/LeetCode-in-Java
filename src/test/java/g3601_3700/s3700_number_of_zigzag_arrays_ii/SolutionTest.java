package g3601_3700.s3700_number_of_zigzag_arrays_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void zigZagArrays() {
        assertThat(new Solution().zigZagArrays(3, 4, 5), equalTo(2));
    }

    @Test
    void zigZagArrays2() {
        assertThat(new Solution().zigZagArrays(3, 1, 3), equalTo(10));
    }
}
