package g3801_3900.s3863_minimum_operations_to_sort_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("dog"), equalTo(1));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("card"), equalTo(2));
    }

    @Test
    void minOperations3() {
        assertThat(new Solution().minOperations("gf"), equalTo(-1));
    }

    @Test
    void minOperations4() {
        assertThat(new Solution().minOperations("abc"), equalTo(0));
    }
}
