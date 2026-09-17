package g3901_4000.s3912_valid_elements_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    @Test
    void findValidElements() {
        assertThat(
                new Solution().findValidElements(new int[] {1, 2, 4, 2, 3, 2}),
                equalTo(List.of(1, 2, 4, 3, 2)));
    }

    @Test
    void findValidElements2() {
        assertThat(
                new Solution().findValidElements(new int[] {5, 5, 5, 5}), equalTo(List.of(5, 5)));
    }

    @Test
    void findValidElements3() {
        assertThat(new Solution().findValidElements(new int[] {1}), equalTo(List.of(1)));
    }

    @Test
    void findValidElements4() {
        assertThat(
                new Solution().findValidElements(new int[] {1, 2, 3, 4}),
                equalTo(List.of(1, 2, 3, 4)));
    }

    @Test
    void findValidElements5() {
        assertThat(
                new Solution().findValidElements(new int[] {4, 3, 2, 1}),
                equalTo(List.of(4, 3, 2, 1)));
    }

    @Test
    void findValidElements6() {
        assertThat(new Solution().findValidElements(new int[] {5, 1, 5}), equalTo(List.of(5, 5)));
    }
}
