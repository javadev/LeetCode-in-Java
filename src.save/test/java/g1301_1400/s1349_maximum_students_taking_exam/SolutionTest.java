package g1301_1400.s1349_maximum_students_taking_exam;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxStudents() {
        char[][] input =
                new char[][] {
                    {'#', '.', '#', '#', '.', '#'},
                    {'.', '#', '#', '#', '#', '.'},
                    {'#', '.', '#', '#', '.', '#'}
                };
        assertThat(new Solution().maxStudents(input), equalTo(4));
    }

    @Test
    void maxStudents2() {
        char[][] input = new char[][] {{'.', '#'}, {'#', '#'}, {'#', '.'}, {'#', '#'}, {'.', '#'}};
        assertThat(new Solution().maxStudents(input), equalTo(3));
    }

    @Test
    void maxStudents3() {
        char[][] input =
                new char[][] {
                    {'#', '.', '.', '.', '#'},
                    {'.', '#', '.', '#', '.'},
                    {'.', '.', '#', '.', '.'},
                    {'.', '#', '.', '#', '.'},
                    {'#', '.', '.', '.', '#'}
                };
        assertThat(new Solution().maxStudents(input), equalTo(10));
    }
}
