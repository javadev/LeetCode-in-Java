package g0401_0500.s0476_number_complement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findComplement() {
        assertThat(new Solution().findComplement(5), equalTo(2));
    }

    @Test
    void findComplement2() {
        assertThat(new Solution().findComplement(1), equalTo(0));
    }
}
