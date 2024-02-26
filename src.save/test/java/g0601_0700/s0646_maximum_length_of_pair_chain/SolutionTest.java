package g0601_0700.s0646_maximum_length_of_pair_chain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLongestChain() {
        assertThat(
                new Solution().findLongestChain(new int[][] {{1, 2}, {2, 3}, {3, 4}}), equalTo(2));
    }

    @Test
    void findLongestChain2() {
        assertThat(
                new Solution().findLongestChain(new int[][] {{1, 2}, {7, 8}, {4, 5}}), equalTo(3));
    }
}
