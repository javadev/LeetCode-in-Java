package g3301_3400.s3370_smallest_number_with_all_set_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestNumber() {
        assertThat(new Solution().smallestNumber(5), equalTo(7));
    }

    @Test
    void smallestNumber2() {
        assertThat(new Solution().smallestNumber(10), equalTo(15));
    }

    @Test
    void smallestNumber3() {
        assertThat(new Solution().smallestNumber(3), equalTo(3));
    }
}
