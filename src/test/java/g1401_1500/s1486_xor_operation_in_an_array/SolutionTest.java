package g1401_1500.s1486_xor_operation_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorOperation() {
        assertThat(new Solution().xorOperation(5, 0), equalTo(8));
    }

    @Test
    void xorOperation2() {
        assertThat(new Solution().xorOperation(4, 3), equalTo(8));
    }
}
