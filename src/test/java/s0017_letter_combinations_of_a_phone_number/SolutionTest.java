package s0017_letter_combinations_of_a_phone_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void letterCombinations() {
        assertThat(
                new Solution().letterCombinations("23").toString(),
                equalTo("[ad, ae, af, bd, be, bf, cd, ce, cf]"));
    }
}
