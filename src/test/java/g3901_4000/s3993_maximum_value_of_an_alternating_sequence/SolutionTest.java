package g3901_4000.s3993_maximum_value_of_an_alternating_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumValue() {
        assertThat(new Solution().maximumValue(4, 3, 5), equalTo(12L));
    }

    @Test
    void maximumValue2() {
        assertThat(new Solution().maximumValue(2, 4, 3), equalTo(7L));
    }

    @Test
    void maximumValue3() {
        assertThat(new Solution().maximumValue(1, 5, 3), equalTo(5L));
    }
}
