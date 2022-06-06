package g2101_2200.s2197_replace_non_coprime_numbers_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void replaceNonCoprimes() {
        assertThat(
                new Solution().replaceNonCoprimes(new int[] {6, 4, 3, 2, 7, 6, 2}),
                equalTo(Arrays.asList(12, 7, 6)));
    }

    @Test
    void replaceNonCoprimes2() {
        assertThat(
                new Solution().replaceNonCoprimes(new int[] {2, 2, 1, 1, 3, 3, 3}),
                equalTo(Arrays.asList(2, 1, 1, 3)));
    }
}
