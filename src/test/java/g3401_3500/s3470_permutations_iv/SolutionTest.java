package g3401_3500.s3470_permutations_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void permute() {
        assertThat(new Solution().permute(4, 6), equalTo(new int[] {3, 4, 1, 2}));
    }

    @Test
    void permute2() {
        assertThat(new Solution().permute(3, 2), equalTo(new int[] {3, 2, 1}));
    }

    @Test
    void permute3() {
        assertThat(new Solution().permute(2, 3), equalTo(new int[] {}));
    }
}
