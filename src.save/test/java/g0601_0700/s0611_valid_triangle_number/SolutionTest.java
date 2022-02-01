package g0601_0700.s0611_valid_triangle_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void triangleNumber() {
        assertThat(new Solution().triangleNumber(new int[] {2, 2, 3, 4}), equalTo(3));
    }

    @Test
    void triangleNumber2() {
        assertThat(new Solution().triangleNumber(new int[] {4, 2, 3, 4}), equalTo(4));
    }
}
