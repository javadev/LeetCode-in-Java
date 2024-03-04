package g3001_3100.s3040_maximum_number_of_operations_with_the_same_score_ii;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void maxOperations() {
        assertThat(new Solution().maxOperations(new int[]{3,2,1,2,3,4}), equalTo(3));
    }

    @Test
    void maxOperations2() {
        assertThat(new Solution().maxOperations(new int[]{3,2,6,1,4}), equalTo(2));
    }
}
