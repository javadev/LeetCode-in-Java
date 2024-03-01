package g1401_1500.s1431_kids_with_the_greatest_number_of_candies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kidsWithCandies() {
        assertThat(
                new Solution().kidsWithCandies(new int[] {2, 3, 5, 1, 3}, 3),
                equalTo(Arrays.asList(true, true, true, false, true)));
    }

    @Test
    void kidsWithCandies2() {
        assertThat(
                new Solution().kidsWithCandies(new int[] {4, 2, 1, 1, 2}, 1),
                equalTo(Arrays.asList(true, false, false, false, false)));
    }

    @Test
    void kidsWithCandies3() {
        assertThat(
                new Solution().kidsWithCandies(new int[] {12, 1, 12}, 10),
                equalTo(Arrays.asList(true, false, true)));
    }
}
