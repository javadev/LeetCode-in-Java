package g0601_0700.s0632_smallest_range_covering_elements_from_k_lists;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestRange() {
        assertThat(
                new Solution()
                        .smallestRange(
                                Arrays.asList(
                                        Arrays.asList(4, 10, 15, 24, 26),
                                        Arrays.asList(0, 9, 12, 20),
                                        Arrays.asList(5, 18, 22, 30))),
                equalTo(new int[] {24, 20}));
    }

    @Test
    void smallestRange2() {
        assertThat(
                new Solution()
                        .smallestRange(
                                Arrays.asList(
                                        Arrays.asList(1, 2, 3),
                                        Arrays.asList(1, 2, 3),
                                        Arrays.asList(1, 2, 3))),
                equalTo(new int[] {1, 1}));
    }
}
