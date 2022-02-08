package g0901_1000.s0996_number_of_squareful_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSquarefulPerms() {
        assertThat(new Solution().numSquarefulPerms(new int[] {1, 17, 8}), equalTo(2));
    }

    @Test
    void numSquarefulPerms2() {
        assertThat(new Solution().numSquarefulPerms(new int[] {2, 2, 2}), equalTo(1));
    }
}
