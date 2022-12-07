package g0901_1000.s0925_long_pressed_name;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isLongPressedName() {
        assertThat(new Solution().isLongPressedName("alex", "aaleex"), equalTo(true));
    }

    @Test
    void isLongPressedName2() {
        assertThat(new Solution().isLongPressedName("saeed", "ssaaedd"), equalTo(false));
    }
}
