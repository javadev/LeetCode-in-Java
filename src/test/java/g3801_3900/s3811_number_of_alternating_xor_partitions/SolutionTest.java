package g3801_3900.s3811_number_of_alternating_xor_partitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void alternatingXOR() {
        assertThat(new Solution().alternatingXOR(new int[] {2, 3, 1, 4}, 1, 5), equalTo(1));
    }

    @Test
    void alternatingXOR2() {
        assertThat(new Solution().alternatingXOR(new int[] {1, 0, 0}, 1, 0), equalTo(3));
    }

    @Test
    void alternatingXOR3() {
        assertThat(new Solution().alternatingXOR(new int[] {7}, 1, 7), equalTo(0));
    }
}
