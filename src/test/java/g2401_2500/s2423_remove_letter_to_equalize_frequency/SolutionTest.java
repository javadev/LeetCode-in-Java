package g2401_2500.s2423_remove_letter_to_equalize_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void equalFrequency() {
        assertThat(new Solution().equalFrequency("abcc"), equalTo(true));
    }

    @Test
    void equalFrequency2() {
        assertThat(new Solution().equalFrequency("aazz"), equalTo(false));
    }
}
