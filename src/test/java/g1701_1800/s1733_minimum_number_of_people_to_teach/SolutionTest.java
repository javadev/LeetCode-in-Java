package g1701_1800.s1733_minimum_number_of_people_to_teach;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTeachings() {
        assertThat(
                new Solution()
                        .minimumTeachings(
                                2,
                                new int[][] {{1}, {2}, {1, 2}},
                                new int[][] {{1, 2}, {1, 3}, {2, 3}}),
                equalTo(1));
    }

    @Test
    void minimumTeachings2() {
        assertThat(
                new Solution()
                        .minimumTeachings(
                                3,
                                new int[][] {{2}, {1, 3}, {1, 2}, {3}},
                                new int[][] {{1, 4}, {1, 2}, {1, 3}, {3, 4}, {2, 3}}),
                equalTo(2));
    }
}
