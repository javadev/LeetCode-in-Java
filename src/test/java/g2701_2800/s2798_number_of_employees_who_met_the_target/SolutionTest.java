package g2701_2800.s2798_number_of_employees_who_met_the_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfEmployeesWhoMetTarget() {
        int[] hours1 = {0, 1, 2, 3, 4};
        assertThat(new Solution().numberOfEmployeesWhoMetTarget(hours1, 2), equalTo(3));
    }

    @Test
    void numberOfEmployeesWhoMetTarget2() {
        int[] hours2 = {5, 1, 4, 2, 2};
        assertThat(new Solution().numberOfEmployeesWhoMetTarget(hours2, 6), equalTo(0));
    }
}
