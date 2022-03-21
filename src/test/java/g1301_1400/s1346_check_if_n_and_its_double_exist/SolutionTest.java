package g1301_1400.s1346_check_if_n_and_its_double_exist;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkIfExist() {
        assertThat(new Solution().checkIfExist(new int[] {10, 2, 5, 3}), equalTo(true));
    }

    @Test
    void checkIfExist2() {
        assertThat(new Solution().checkIfExist(new int[] {7, 1, 14, 11}), equalTo(true));
    }

    @Test
    void checkIfExist3() {
        assertThat(new Solution().checkIfExist(new int[] {3, 1, 7, 11}), equalTo(false));
    }
}
