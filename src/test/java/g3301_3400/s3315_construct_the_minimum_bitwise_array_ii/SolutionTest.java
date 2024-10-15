package g3301_3400.s3315_construct_the_minimum_bitwise_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minBitwiseArray() {
        assertThat(
                new Solution().minBitwiseArray(List.of(2, 3, 5, 7)),
                equalTo(new int[] {-1, 1, 4, 3}));
    }

    @Test
    void minBitwiseArray2() {
        assertThat(
                new Solution().minBitwiseArray(List.of(11, 13, 31)),
                equalTo(new int[] {9, 12, 15}));
    }
}
