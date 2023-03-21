package g2501_2600.s2512_reward_top_k_students;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void topStudents() {
        assertThat(
                new Solution()
                        .topStudents(
                                new String[] {"smart", "brilliant", "studious"},
                                new String[] {"not"},
                                new String[] {"this student is studious", "the student is smart"},
                                new int[] {1, 2},
                                2),
                equalTo(Arrays.asList(1, 2)));
    }

    @Test
    void topStudents2() {
        assertThat(
                new Solution()
                        .topStudents(
                                new String[] {"smart", "brilliant", "studious"},
                                new String[] {"not"},
                                new String[] {
                                    "this student is not studious", "the student is smart"
                                },
                                new int[] {1, 2},
                                2),
                equalTo(Arrays.asList(2, 1)));
    }
}
