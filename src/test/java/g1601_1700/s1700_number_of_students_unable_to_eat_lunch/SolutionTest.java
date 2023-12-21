package g1601_1700.s1700_number_of_students_unable_to_eat_lunch;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countStudents() {
        assertThat(
                new Solution().countStudents(new int[] {1, 1, 0, 0}, new int[] {0, 1, 0, 1}),
                equalTo(0));
    }

    @Test
    void countStudents2() {
        assertThat(
                new Solution()
                        .countStudents(new int[] {1, 1, 1, 0, 0, 1}, new int[] {1, 0, 0, 0, 1, 1}),
                equalTo(3));
    }
}
