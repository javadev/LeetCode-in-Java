package g2701_2800.s2741_special_permutations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void specialPerm() {
        assertThat(new Solution().specialPerm(new int[] {2, 3, 6}), equalTo(2));
    }

    @Test
    void specialPerm2() {
        assertThat(new Solution().specialPerm(new int[] {1, 4, 3}), equalTo(2));
    }
}
