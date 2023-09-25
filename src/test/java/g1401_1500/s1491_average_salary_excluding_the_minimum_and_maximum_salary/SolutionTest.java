package g1401_1500.s1491_average_salary_excluding_the_minimum_and_maximum_salary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void average() {
        assertThat(new Solution().average(new int[] {4000, 3000, 1000, 2000}), equalTo(2500.00000));
    }

    @Test
    void average2() {
        assertThat(new Solution().average(new int[] {1000, 2000, 3000}), equalTo(2000.00000));
    }
}
