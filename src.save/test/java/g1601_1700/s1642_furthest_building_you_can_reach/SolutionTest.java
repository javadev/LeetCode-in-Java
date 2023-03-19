package g1601_1700.s1642_furthest_building_you_can_reach;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void furthestBuilding() {
        assertThat(
                new Solution().furthestBuilding(new int[] {4, 2, 7, 6, 9, 14, 12}, 5, 1),
                equalTo(4));
    }

    @Test
    void furthestBuilding2() {
        assertThat(
                new Solution().furthestBuilding(new int[] {4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2),
                equalTo(7));
    }

    @Test
    void furthestBuilding3() {
        assertThat(new Solution().furthestBuilding(new int[] {14, 3, 19, 3}, 17, 0), equalTo(3));
    }
}
