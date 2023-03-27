package g2401_2500.s2465_number_of_distinct_averages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distinctAverages() {
        assertThat(new Solution().distinctAverages(new int[] {4, 1, 4, 0, 3, 5}), equalTo(2));
    }

    @Test
    void distinctAverages2() {
        assertThat(new Solution().distinctAverages(new int[] {1, 100}), equalTo(1));
    }
}
