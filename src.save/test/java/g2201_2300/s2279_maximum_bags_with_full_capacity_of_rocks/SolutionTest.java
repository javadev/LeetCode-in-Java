package g2201_2300.s2279_maximum_bags_with_full_capacity_of_rocks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumBags() {
        assertThat(
                new Solution().maximumBags(new int[] {2, 3, 4, 5}, new int[] {1, 2, 4, 4}, 2),
                equalTo(3));
    }

    @Test
    void maximumBags2() {
        assertThat(
                new Solution().maximumBags(new int[] {10, 2, 2}, new int[] {2, 2, 0}, 100),
                equalTo(3));
    }

    @Test
    void maximumBags3() {
        assertThat(
                new Solution()
                        .maximumBags(
                                new int[] {91, 54, 63, 99, 24, 45, 78},
                                new int[] {35, 32, 45, 98, 6, 1, 25},
                                17),
                equalTo(1));
    }
}
