package g2801_2900.s2861_maximum_number_of_alloys;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumberOfAlloys() {
        assertThat(
                new Solution()
                        .maxNumberOfAlloys(
                                3,
                                2,
                                15,
                                Arrays.asList(Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 10)),
                                Arrays.asList(0, 0, 0),
                                Arrays.asList(1, 2, 3)),
                equalTo(2));
    }

    @Test
    void maxNumberOfAlloys2() {
        assertThat(
                new Solution()
                        .maxNumberOfAlloys(
                                3,
                                2,
                                15,
                                Arrays.asList(Arrays.asList(1, 1, 1), Arrays.asList(1, 1, 10)),
                                Arrays.asList(0, 0, 100),
                                Arrays.asList(1, 2, 3)),
                equalTo(5));
    }

    @Test
    void maxNumberOfAlloys3() {
        assertThat(
                new Solution()
                        .maxNumberOfAlloys(
                                2,
                                3,
                                10,
                                Arrays.asList(
                                        Arrays.asList(2, 1),
                                        Arrays.asList(1, 2),
                                        Arrays.asList(1, 1)),
                                Arrays.asList(1, 1),
                                Arrays.asList(5, 5)),
                equalTo(2));
    }
}
