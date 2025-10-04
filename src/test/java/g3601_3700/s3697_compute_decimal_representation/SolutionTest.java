package g3601_3700.s3697_compute_decimal_representation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void decimalRepresentation() {
        assertThat(new Solution().decimalRepresentation(537), equalTo(new int[] {500, 30, 7}));
    }

    @Test
    void decimalRepresentation2() {
        assertThat(new Solution().decimalRepresentation(102), equalTo(new int[] {100, 2}));
    }

    @Test
    void decimalRepresentation3() {
        assertThat(new Solution().decimalRepresentation(6), equalTo(new int[] {6}));
    }
}
