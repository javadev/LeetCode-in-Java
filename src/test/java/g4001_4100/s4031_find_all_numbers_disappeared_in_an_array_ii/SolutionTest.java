package g4001_4100.s4031_find_all_numbers_disappeared_in_an_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDisappearedNumbers() {
        assertThat(new Solution().findDisappearedNumbers(new int[] {2, 3, 7, 2}, 1, 8),
                equalTo(Arrays.asList(Arrays.asList(1, 1), Arrays.asList(4, 6), Arrays.asList(8, 8))));
    }

    @Test
    void findDisappearedNumbers2() {
        assertThat(new Solution().findDisappearedNumbers(new int[] {1, 2, 3}, 1, 3), equalTo(Collections.emptyList()));
    }

    @Test
    void findDisappearedNumbers3() {
        assertThat(new Solution().findDisappearedNumbers(new int[] {}, 4, 6), equalTo(Arrays.asList(Arrays.asList(4, 6))));
    }
}

