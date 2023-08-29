package g0401_0500.s0448_find_all_numbers_disappeared_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDisappearedNumbers() {
        assertThat(
                new Solution().findDisappearedNumbers(new int[] {4, 3, 2, 7, 8, 2, 3, 1}),
                equalTo(Arrays.asList(5, 6)));
    }

    @Test
    void findDisappearedNumbers2() {
        assertThat(
                new Solution().findDisappearedNumbers(new int[] {1, 1}), equalTo(Arrays.asList(2)));
    }
}
