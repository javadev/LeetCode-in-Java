package g3501_3600.s3583_count_special_triplets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void specialTriplets() {
        assertThat(new Solution().specialTriplets(new int[] {6, 3, 6}), equalTo(1));
    }

    @Test
    void specialTriplets2() {
        assertThat(new Solution().specialTriplets(new int[] {0, 1, 0, 0}), equalTo(1));
    }

    @Test
    void specialTriplets3() {
        assertThat(new Solution().specialTriplets(new int[] {8, 4, 2, 8, 4}), equalTo(2));
    }
}
