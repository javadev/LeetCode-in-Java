package g0601_0700.s0690_employee_importance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.Employee;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getImportance() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee(1, 5, Arrays.asList(2, 3)),
                        new Employee(2, 3, Arrays.asList()),
                        new Employee(3, 3, Arrays.asList()));
        assertThat(new Solution().getImportance(employees, 1), equalTo(11));
    }

    @Test
    void getImportance2() {
        List<Employee> employees =
                Arrays.asList(
                        new Employee(1, 5, Arrays.asList(2, 3)),
                        new Employee(2, 3, Arrays.asList(4)),
                        new Employee(3, 4, Arrays.asList()),
                        new Employee(4, 1, Arrays.asList()));
        assertThat(new Solution().getImportance(employees, 1), equalTo(13));
    }
}
