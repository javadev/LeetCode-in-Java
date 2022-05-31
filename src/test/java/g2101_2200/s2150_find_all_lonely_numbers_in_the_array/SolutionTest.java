package g2101_2200.s2150_find_all_lonely_numbers_in_the_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLonely() {
        assertThat(
                new Solution().findLonely(new int[] {10, 6, 5, 8}), equalTo(Arrays.asList(10, 8)));
    }

    @Test
    void findLonely2() {
        assertThat(new Solution().findLonely(new int[] {1, 3, 5, 3}), equalTo(Arrays.asList(1, 5)));
    }
}
