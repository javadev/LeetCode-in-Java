package g3601_3700.s3638_maximum_balanced_shipments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxBalancedShipments() {
        assertThat(new Solution().maxBalancedShipments(new int[] {2, 5, 1, 4, 3}), equalTo(2));
    }

    @Test
    void maxBalancedShipments2() {
        assertThat(new Solution().maxBalancedShipments(new int[] {4, 4}), equalTo(0));
    }
}
