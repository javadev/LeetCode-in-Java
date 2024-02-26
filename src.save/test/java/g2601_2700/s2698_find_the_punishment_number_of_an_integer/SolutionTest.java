package g2601_2700.s2698_find_the_punishment_number_of_an_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void punishmentNumber() {
        assertThat(new Solution().punishmentNumber(10), equalTo(182));
    }

    @Test
    void punishmentNumber2() {
        assertThat(new Solution().punishmentNumber(37), equalTo(1478));
    }
}
