package g1201_1300.s1237_find_positive_integer_solution_for_a_given_equation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSolution() {
        Solution.CustomFunction customFunction =
                new Solution.CustomFunction() {
                    int index = 0;

                    @Override
                    public int f(int x, int y) {
                        return index++;
                    }
                };
        assertThat(
                new Solution().findSolution(customFunction, 1),
                equalTo(Arrays.asList(Arrays.asList(2, 1000))));
    }
}
