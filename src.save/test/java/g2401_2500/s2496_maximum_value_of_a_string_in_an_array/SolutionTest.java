package g2401_2500.s2496_maximum_value_of_a_string_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumValue() {
        assertThat(
                new Solution().maximumValue(new String[] {"alic3", "bob", "3", "4", "00000"}),
                equalTo(5));
    }

    @Test
    void maximumValue2() {
        assertThat(
                new Solution().maximumValue(new String[] {"1", "01", "001", "0001"}), equalTo(1));
    }
}
