package g1001_1100.s1009_complement_of_base_10_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bitwiseComplement() {
        assertThat(new Solution().bitwiseComplement(5), equalTo(2));
    }

    @Test
    void bitwiseComplement2() {
        assertThat(new Solution().bitwiseComplement(7), equalTo(0));
    }

    @Test
    void bitwiseComplement3() {
        assertThat(new Solution().bitwiseComplement(10), equalTo(5));
    }
}
