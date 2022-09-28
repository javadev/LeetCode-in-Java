package g0401_0500.s0442_find_all_duplicates_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findDuplicates() {
        assertThat(
                new Solution().findDuplicates(new int[] {4, 3, 2, 7, 8, 2, 3, 1}),
                equalTo(Arrays.asList(2, 3)));
    }

    @Test
    void findDuplicates2() {
        assertThat(new Solution().findDuplicates(new int[] {1, 1, 2}), equalTo(Arrays.asList(1)));
    }
}
