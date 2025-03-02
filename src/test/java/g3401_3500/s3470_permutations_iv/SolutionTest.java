package g3401_3500.s3470_permutations_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void permute() {
        assertThat(new Solution().permute(4, 6L), equalTo(new int[] {3, 4, 1, 2}));
    }

    @Test
    void permute2() {
        assertThat(new Solution().permute(3, 2L), equalTo(new int[] {3, 2, 1}));
    }

    @Test
    void permute3() {
        assertThat(new Solution().permute(2, 3L), equalTo(new int[] {}));
    }

    @Test
    void permute4() {
        assertThat(
                new Solution().permute(43, 142570305460935L),
                equalTo(
                        new int[] {
                            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                            21, 22, 43, 40, 27, 36, 25, 34, 31, 32, 29, 28, 33, 24, 23, 26, 41, 42,
                            35, 38, 37, 30, 39
                        }));
    }
}
