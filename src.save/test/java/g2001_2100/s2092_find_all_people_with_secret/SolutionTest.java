package g2001_2100.s2092_find_all_people_with_secret;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAllPeople() {
        assertThat(
                new Solution().findAllPeople(6, new int[][] {{1, 2, 5}, {2, 3, 8}, {1, 5, 10}}, 1),
                equalTo(Arrays.asList(0, 1, 2, 3, 5)));
    }

    @Test
    void findAllPeople2() {
        assertThat(
                new Solution().findAllPeople(4, new int[][] {{3, 1, 3}, {1, 2, 2}, {0, 3, 3}}, 3),
                equalTo(Arrays.asList(0, 1, 3)));
    }

    @Test
    void findAllPeople3() {
        assertThat(
                new Solution().findAllPeople(5, new int[][] {{3, 4, 2}, {1, 2, 1}, {2, 3, 1}}, 1),
                equalTo(Arrays.asList(0, 1, 2, 3, 4)));
    }
}
