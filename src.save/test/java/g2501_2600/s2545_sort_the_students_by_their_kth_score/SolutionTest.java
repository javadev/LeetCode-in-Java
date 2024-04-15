package g2501_2600.s2545_sort_the_students_by_their_kth_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortTheStudents() {
        assertThat(
                new Solution()
                        .sortTheStudents(
                                new int[][] {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}}, 2),
                equalTo(new int[][] {{7, 5, 11, 2}, {10, 6, 9, 1}, {4, 8, 3, 15}}));
    }

    @Test
    void sortTheStudents2() {
        assertThat(
                new Solution().sortTheStudents(new int[][] {{3, 4}, {5, 6}}, 0),
                equalTo(new int[][] {{5, 6}, {3, 4}}));
    }
}
