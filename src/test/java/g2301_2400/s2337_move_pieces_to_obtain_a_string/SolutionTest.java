package g2301_2400.s2337_move_pieces_to_obtain_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canChange() {
        assertThat(new Solution().canChange("_L__R__R_", "L______RR"), equalTo(true));
    }

    @Test
    void canChange2() {
        assertThat(new Solution().canChange("R_L_", "__LR"), equalTo(false));
    }

    @Test
    void canChange3() {
        assertThat(new Solution().canChange("_R", "R_"), equalTo(false));
    }

    @Test
    void canChange4() {
        assertThat(new Solution().canChange("_L__R__R_L", "L______RR_"), equalTo(false));
    }
}
