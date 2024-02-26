package g3001_3100.s3003_maximize_the_number_of_partitions_after_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPartitionsAfterOperations() {
        assertThat(new Solution().maxPartitionsAfterOperations("accca", 2), equalTo(3));
    }

    @Test
    void maxPartitionsAfterOperations2() {
        assertThat(new Solution().maxPartitionsAfterOperations("aabaab", 3), equalTo(1));
    }

    @Test
    void maxPartitionsAfterOperations3() {
        assertThat(new Solution().maxPartitionsAfterOperations("xxyz", 1), equalTo(4));
    }
}
