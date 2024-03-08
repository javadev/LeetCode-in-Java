package g0801_0900.s0870_advantage_shuffle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void advantageCount() {
        assertThat(
                new Solution().advantageCount(new int[] {2, 7, 11, 15}, new int[] {1, 10, 4, 11}),
                equalTo(new int[] {2, 11, 7, 15}));
    }

    @Test
    void advantageCount2() {
        assertThat(
                new Solution()
                        .advantageCount(new int[] {12, 24, 8, 32}, new int[] {13, 25, 32, 11}),
                equalTo(new int[] {24, 32, 8, 12}));
    }
}
