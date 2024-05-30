package g3101_3200.s3159_find_occurrences_of_an_element_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void occurrencesOfElement() {
        assertThat(
                new Solution()
                        .occurrencesOfElement(new int[] {1, 3, 1, 7}, new int[] {1, 3, 2, 4}, 1),
                equalTo(new int[] {0, -1, 2, -1}));
    }

    @Test
    void occurrencesOfElement2() {
        assertThat(
                new Solution().occurrencesOfElement(new int[] {1, 2, 3}, new int[] {10}, 5),
                equalTo(new int[] {-1}));
    }
}
