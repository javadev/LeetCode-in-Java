package g2401_2500.s2434_using_a_robot_to_print_the_lexicographically_smallest_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void robotWithString() {
        assertThat(new Solution().robotWithString("zza"), equalTo("azz"));
    }

    @Test
    void robotWithString2() {
        assertThat(new Solution().robotWithString("bac"), equalTo("abc"));
    }

    @Test
    void robotWithString3() {
        assertThat(new Solution().robotWithString("bdda"), equalTo("addb"));
    }
}
