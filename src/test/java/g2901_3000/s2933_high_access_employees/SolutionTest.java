package g2901_3000.s2933_high_access_employees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findHighAccessEmployees() {
        assertThat(
                new Solution()
                        .findHighAccessEmployees(
                                Arrays.asList(
                                        Arrays.asList("a", "0549"),
                                        Arrays.asList("b", "0457"),
                                        Arrays.asList("a", "0532"),
                                        Arrays.asList("a", "0621"),
                                        Arrays.asList("b", "0540"))),
                equalTo(List.of("a")));
    }

    @Test
    void findHighAccessEmployees2() {
        assertThat(
                new Solution()
                        .findHighAccessEmployees(
                                Arrays.asList(
                                        Arrays.asList("d", "0002"),
                                        Arrays.asList("c", "0808"),
                                        Arrays.asList("c", "0829"),
                                        Arrays.asList("e", "0215"),
                                        Arrays.asList("d", "1508"),
                                        Arrays.asList("d", "1444"),
                                        Arrays.asList("d", "1410"),
                                        Arrays.asList("c", "0809"))),
                equalTo(List.of("c", "d")));
    }

    @Test
    void findHighAccessEmployees3() {
        assertThat(
                new Solution()
                        .findHighAccessEmployees(
                                Arrays.asList(
                                        Arrays.asList("cd", "1025"),
                                        Arrays.asList("ab", "1025"),
                                        Arrays.asList("cd", "1046"),
                                        Arrays.asList("cd", "1055"),
                                        Arrays.asList("ab", "1124"),
                                        Arrays.asList("ab", "1120"))),
                equalTo(List.of("cd", "ab")));
    }
}
