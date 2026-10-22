package g2401_2500.s2462_total_cost_to_hire_k_workers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalCost() {
        assertThat(
                new Solution().totalCost(new int[] {17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4),
                equalTo(11L));
    }

    @Test
    void totalCost2() {
        assertThat(new Solution().totalCost(new int[] {1, 2, 4, 1}, 3, 3), equalTo(4L));
    }

    @Test
    void totalCost3() {
        // Hire everyone; sorting branch
        assertThat(new Solution().totalCost(new int[] {1, 2, 3, 4, 5}, 5, 1), equalTo(15L));
    }

    @Test
    void totalCost4() {
        // Single hire, suffix candidate is cheaper
        assertThat(new Solution().totalCost(new int[] {5, 1, 3}, 1, 1), equalTo(3L));
    }

    @Test
    void totalCost5() {
        // Tie between prefix and suffix, prefix (lower index) is chosen
        assertThat(new Solution().totalCost(new int[] {3, 1, 3}, 1, 1), equalTo(3L));
    }

    @Test
    void totalCost6() {
        // Candidates cover the whole array
        assertThat(new Solution().totalCost(new int[] {5, 4, 3, 2, 1}, 2, 5), equalTo(3L));
    }

    @Test
    void totalCost7() {
        // Heap path, picks from both sides
        assertThat(
                new Solution().totalCost(new int[] {10, 1, 10, 1, 10, 1, 10}, 2, 2), equalTo(2L));
    }

    @Test
    void totalCost8() {
        // Heap path, longer simulation mixing prefix and suffix picks
        assertThat(
                new Solution()
                        .totalCost(
                                new int[] {
                                    31, 25, 72, 79, 74, 65, 84, 91, 18, 59, 27, 9, 81, 33, 17, 58
                                },
                                11,
                                2),
                equalTo(423L));
    }

    @Test
    void totalCost9() {
        // Single element
        assertThat(new Solution().totalCost(new int[] {7}, 1, 1), equalTo(7L));
    }

    @Test
    void totalCost10() {
        // Result exceeds int range, verifies long accumulation
        int[] costs = new int[100000];
        Arrays.fill(costs, 100000);
        assertThat(new Solution().totalCost(costs, 100000, 1), equalTo(10000000000L));
    }
}
