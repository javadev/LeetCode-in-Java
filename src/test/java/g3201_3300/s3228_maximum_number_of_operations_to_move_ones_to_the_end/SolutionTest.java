package g3201_3300.s3228_maximum_number_of_operations_to_move_ones_to_the_end;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxOperations() {
        assertThat(new Solution().maxOperations("1001101"), equalTo(4));
    }

    @Test
    void maxOperations2() {
        assertThat(new Solution().maxOperations("00111"), equalTo(0));
    }
}
