package g1401_1500.s1450_number_of_students_doing_homework_at_a_given_time;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void busyStudent() {
        assertThat(
                new Solution().busyStudent(new int[] {1, 2, 3}, new int[] {3, 2, 7}, 4),
                equalTo(1));
    }

    @Test
    void busyStudent2() {
        assertThat(new Solution().busyStudent(new int[] {4}, new int[] {4}, 4), equalTo(1));
    }
}
