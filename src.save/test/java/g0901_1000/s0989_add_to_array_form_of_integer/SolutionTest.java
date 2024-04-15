package g0901_1000.s0989_add_to_array_form_of_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addToArrayForm() {
        assertThat(
                new Solution().addToArrayForm(new int[] {1, 2, 0, 0}, 34),
                equalTo(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    void addToArrayForm2() {
        assertThat(
                new Solution().addToArrayForm(new int[] {2, 7, 4}, 181),
                equalTo(Arrays.asList(4, 5, 5)));
    }

    @Test
    void addToArrayForm3() {
        assertThat(
                new Solution().addToArrayForm(new int[] {2, 1, 5}, 806),
                equalTo(Arrays.asList(1, 0, 2, 1)));
    }
}
