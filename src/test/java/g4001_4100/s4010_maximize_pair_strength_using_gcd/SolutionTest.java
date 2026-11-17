package g4001_4100.s4010_maximize_pair_strength_using_gcd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPairStrength() {
        assertThat(new Solution().maxPairStrength(new int[] {2, 3, 5}), equalTo(15L));
    }

    @Test
    void maxPairStrength2() {
        assertThat(new Solution().maxPairStrength(new int[] {4, 6, 8}), equalTo(12L));
    }
}
