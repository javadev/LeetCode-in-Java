package g3301_3400.s3343_count_number_of_balanced_permutations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBalancedPermutations() {
        assertThat(new Solution().countBalancedPermutations("123"), equalTo(2));
    }

    @Test
    void countBalancedPermutations2() {
        assertThat(new Solution().countBalancedPermutations("112"), equalTo(1));
    }

    @Test
    void countBalancedPermutations3() {
        assertThat(new Solution().countBalancedPermutations("12345"), equalTo(0));
    }
}
