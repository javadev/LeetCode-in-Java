package g3101_3200.s3137_minimum_number_of_operations_to_make_word_k_periodic;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperationsToMakeKPeriodic() {
        assertThat(new Solution().minimumOperationsToMakeKPeriodic("leetcodeleet", 4), equalTo(1));
    }

    @Test
    void minimumOperationsToMakeKPeriodic2() {
        assertThat(new Solution().minimumOperationsToMakeKPeriodic("leetcoleet", 2), equalTo(3));
    }
}
