package g2001_2100.s2019_the_score_of_students_solving_math_expression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void scoreOfStudents() {
        assertThat(
                new Solution().scoreOfStudents("3+5*2", new int[] {13, 0, 10, 13, 13, 16, 16}),
                equalTo(19));
    }

    @Test
    void scoreOfStudents2() {
        assertThat(
                new Solution().scoreOfStudents("6+0*1", new int[] {12, 9, 6, 4, 8, 6}),
                equalTo(10));
    }

    @Test
    void scoreOfStudents3() {
        assertThat(
                new Solution().scoreOfStudents("3+5*2", new int[] {13, 0, 10, 13, 13, 16, 16}),
                equalTo(19));
    }
}
