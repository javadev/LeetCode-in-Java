package g3501_3600.s3508_implement_router;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class RouterTest {
    @Test
    void router() {
        // Initialize Router with memoryLimit of 3.
        Router router = new Router(3);
        // Packet is added. Return True.
        assertThat(router.addPacket(1, 4, 90), equalTo(true));
        // Packet is added. Return True.
        assertThat(router.addPacket(2, 5, 90), equalTo(true));
        // This is a duplicate packet. Return False.
        assertThat(router.addPacket(1, 4, 90), equalTo(false));
        // Packet is added. Return True
        assertThat(router.addPacket(3, 5, 95), equalTo(true));
        // Packet is added, [1, 4, 90] is removed as number of packets exceeds memoryLimit. Return
        // True.
        assertThat(router.addPacket(4, 5, 105), equalTo(true));
        // Return [2, 5, 90] and remove it from router.
        assertThat(router.forwardPacket(), equalTo(new int[] {2, 5, 90}));
        // Packet is added. Return True.
        assertThat(router.addPacket(5, 2, 110), equalTo(true));
        // The only packet with destination 5 and timestamp in the inclusive range
        assertThat(router.getCount(5, 100, 110), equalTo(1));
    }

    @Test
    void router2() {
        // Initialize Router with memoryLimit of 2.
        Router router = new Router(2);
        // Packet is added. Return True.
        assertThat(router.addPacket(7, 4, 90), equalTo(true));
        // Return [7, 4, 90] and remove it from router.
        assertThat(router.forwardPacket(), equalTo(new int[] {7, 4, 90}));
        // Return [] and remove it from router.
        assertThat(router.forwardPacket(), equalTo(new int[] {}));
    }

    @Test
    void router3() {
        // Initialize Router with memoryLimit of 3.
        Router router = new Router(3);
        // Packet is added. Return True.
        assertThat(router.addPacket(1, 4, 6), equalTo(true));
        // The only packet with destination 0 and timestamp in the inclusive range
        assertThat(router.getCount(4, 1, 4), equalTo(0));
    }

    @Test
    void router4() {
        // Initialize Router with memoryLimit of 2.
        Router router = new Router(2);
        // Packet is added. Return True.
        assertThat(router.addPacket(2, 5, 1), equalTo(true));
        // Return [2, 5, 1] and remove it from router.
        assertThat(router.forwardPacket(), equalTo(new int[] {2, 5, 1}));
        // The only packet with destination 0 and timestamp in the inclusive range
        assertThat(router.getCount(5, 1, 1), equalTo(0));
    }
}
