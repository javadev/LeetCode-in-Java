package g2801_2900.s2844_minimum_operations_to_make_a_special_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(new Solution().minimumOperations("2245047"), equalTo(2));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations("2908305"), equalTo(3));
    }

    @Test
    void minimumOperations3() {
        assertThat(new Solution().minimumOperations("10"), equalTo(1));
    }
}
