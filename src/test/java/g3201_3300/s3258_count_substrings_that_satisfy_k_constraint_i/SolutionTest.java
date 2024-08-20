package g3201_3300.s3258_count_substrings_that_satisfy_k_constraint_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKConstraintSubstrings() {
        assertThat(new Solution().countKConstraintSubstrings("10101", 1), equalTo(12));
    }

    @Test
    void countKConstraintSubstrings2() {
        assertThat(new Solution().countKConstraintSubstrings("1010101", 2), equalTo(25));
    }
}
