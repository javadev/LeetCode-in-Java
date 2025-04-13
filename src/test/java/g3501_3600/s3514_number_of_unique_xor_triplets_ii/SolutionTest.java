package g3501_3600.s3514_number_of_unique_xor_triplets_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniqueXorTriplets() {
        assertThat(new Solution().uniqueXorTriplets(new int[] {1, 3}), equalTo(2));
    }

    @Test
    void uniqueXorTriplets2() {
        assertThat(new Solution().uniqueXorTriplets(new int[] {6, 7, 8, 9}), equalTo(4));
    }
}
