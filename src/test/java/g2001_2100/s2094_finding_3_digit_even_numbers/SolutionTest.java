package g2001_2100.s2094_finding_3_digit_even_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findEvenNumbers() {
        assertThat(
                new Solution().findEvenNumbers(new int[] {2, 1, 3, 0}),
                equalTo(new int[] {102, 120, 130, 132, 210, 230, 302, 310, 312, 320}));
    }

    @Test
    void findEvenNumbers2() {
        assertThat(
                new Solution().findEvenNumbers(new int[] {2, 2, 8, 8, 2}),
                equalTo(new int[] {222, 228, 282, 288, 822, 828, 882}));
    }

    @Test
    void findEvenNumbers3() {
        assertThat(new Solution().findEvenNumbers(new int[] {3, 7, 5}), equalTo(new int[] {}));
    }
}
