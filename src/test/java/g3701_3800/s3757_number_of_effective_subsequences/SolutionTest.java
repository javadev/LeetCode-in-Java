package g3701_3800.s3757_number_of_effective_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countEffective() {
        assertThat(new Solution().countEffective(new int[] {1, 2, 3}), equalTo(3));
    }

    @Test
    void countEffective2() {
        assertThat(new Solution().countEffective(new int[] {7, 4, 6}), equalTo(4));
    }

    @Test
    void countEffective3() {
        assertThat(new Solution().countEffective(new int[] {8, 8}), equalTo(1));
    }

    @Test
    void countEffective4() {
        assertThat(new Solution().countEffective(new int[] {2, 2, 1}), equalTo(5));
    }
}
