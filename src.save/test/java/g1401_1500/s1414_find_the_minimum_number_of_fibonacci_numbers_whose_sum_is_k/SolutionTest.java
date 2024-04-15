package g1401_1500.s1414_find_the_minimum_number_of_fibonacci_numbers_whose_sum_is_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinFibonacciNumbers() {
        assertThat(new Solution().findMinFibonacciNumbers(7), equalTo(2));
    }

    @Test
    void findMinFibonacciNumbers2() {
        assertThat(new Solution().findMinFibonacciNumbers(10), equalTo(2));
    }

    @Test
    void findMinFibonacciNumbers3() {
        assertThat(new Solution().findMinFibonacciNumbers(19), equalTo(3));
    }
}
