package g3701_3800.s3750_minimum_number_of_flips_to_reverse_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumFlips() {
        assertThat(new Solution().minimumFlips(7), equalTo(0));
    }

    @Test
    void minimumFlips2() {
        assertThat(new Solution().minimumFlips(10), equalTo(4));
    }
}
