package g0301_0400.s0399_evaluate_division;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void calcEquation() {
        List<List<String>> equations =
                new ArrayList<>(Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c")));
        double[] values = new double[] {2.0, 3.0};
        List<List<String>> queries =
                new ArrayList<>(
                        Arrays.asList(
                                Arrays.asList("a", "c"),
                                Arrays.asList("b", "a"),
                                Arrays.asList("a", "e"),
                                Arrays.asList("a", "a"),
                                Arrays.asList("x", "x")));
        double[] expected = {6.00000, 0.50000, -1.00000, 1.00000, -1.00000};

        assertThat(new Solution().calcEquation(equations, values, queries), equalTo(expected));
    }

    @Test
    void calcEquation2() {
        List<List<String>> equations =
                new ArrayList<>(
                        Arrays.asList(
                                Arrays.asList("a", "b"),
                                Arrays.asList("b", "c"),
                                Arrays.asList("bc", "cd")));
        double[] values = new double[] {1.5, 2.5, 5.0};
        List<List<String>> queries =
                new ArrayList<>(
                        Arrays.asList(
                                Arrays.asList("a", "c"),
                                Arrays.asList("c", "b"),
                                Arrays.asList("bc", "cd"),
                                Arrays.asList("cd", "bc")));
        double[] expected = {3.75000, 0.40000, 5.00000, 0.20000};

        assertThat(new Solution().calcEquation(equations, values, queries), equalTo(expected));
    }

    @Test
    void calcEquation3() {
        List<List<String>> equations = new ArrayList<>(Arrays.asList(Arrays.asList("a", "b")));
        double[] values = new double[] {0.5};
        List<List<String>> queries =
                new ArrayList<>(
                        Arrays.asList(
                                Arrays.asList("a", "b"),
                                Arrays.asList("b", "a"),
                                Arrays.asList("a", "c"),
                                Arrays.asList("x", "y")));
        double[] expected = {0.50000, 2.00000, -1.00000, -1.00000};

        assertThat(new Solution().calcEquation(equations, values, queries), equalTo(expected));
    }
}
