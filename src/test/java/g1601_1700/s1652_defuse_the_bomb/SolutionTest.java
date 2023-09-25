package g1601_1700.s1652_defuse_the_bomb;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decrypt() {
        assertThat(
                new Solution().decrypt(new int[] {5, 7, 1, 4}, 3),
                equalTo(new int[] {12, 10, 16, 13}));
    }

    @Test
    void decrypt2() {
        assertThat(
                new Solution().decrypt(new int[] {1, 2, 3, 4}, 0), equalTo(new int[] {0, 0, 0, 0}));
    }

    @Test
    void decrypt3() {
        assertThat(
                new Solution().decrypt(new int[] {2, 4, 9, 3}, -2),
                equalTo(new int[] {12, 5, 6, 13}));
    }
}
