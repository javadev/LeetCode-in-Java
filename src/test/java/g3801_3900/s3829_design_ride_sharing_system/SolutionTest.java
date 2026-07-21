package g3801_3900.s3829_design_ride_sharing_system;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rideSharingSystem() {
        RideSharingSystem rideSharingSystem = new RideSharingSystem();
        rideSharingSystem.addRider(3);
        rideSharingSystem.addDriver(2);
        rideSharingSystem.addRider(1);
        assertThat(rideSharingSystem.matchDriverWithRider(), equalTo(new int[] {2, 3}));
        rideSharingSystem.addDriver(5);
        rideSharingSystem.cancelRider(3);
        assertThat(rideSharingSystem.matchDriverWithRider(), equalTo(new int[] {5, 1}));
        assertThat(rideSharingSystem.matchDriverWithRider(), equalTo(new int[] {-1, -1}));
    }

    @Test
    void rideSharingSystem2() {
        RideSharingSystem rideSharingSystem = new RideSharingSystem();
        rideSharingSystem.addRider(8);
        rideSharingSystem.addDriver(8);
        rideSharingSystem.addDriver(6);
        assertThat(rideSharingSystem.matchDriverWithRider(), equalTo(new int[] {8, 8}));
        rideSharingSystem.addRider(2);
        rideSharingSystem.cancelRider(2);
        assertThat(rideSharingSystem.matchDriverWithRider(), equalTo(new int[] {-1, -1}));
    }
}
