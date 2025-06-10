package g3501_3600.s3572_maximize_ysum_by_picking_a_triplet_of_distinct_xvalues;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumDistinctTriplet() {
        assertThat(
                new Solution()
                        .maxSumDistinctTriplet(
                                new int[] {1, 2, 1, 3, 2}, new int[] {5, 3, 4, 6, 2}),
                equalTo(14));
    }

    @Test
    void maxSumDistinctTriplet2() {
        assertThat(
                new Solution()
                        .maxSumDistinctTriplet(new int[] {1, 2, 1, 2}, new int[] {4, 5, 6, 7}),
                equalTo(-1));
    }
}
