package g0901_1000.s0903_valid_permutations_for_di_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numPermsDISequence() {
        assertThat(new Solution().numPermsDISequence("DID"), equalTo(5));
    }

    @Test
    void numPermsDISequence2() {
        assertThat(new Solution().numPermsDISequence("D"), equalTo(1));
    }
}
