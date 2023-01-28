package g1801_1900.s1845_seat_reservation_manager;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SeatManagerTest {
    @Test
    void seatManagerTest() {
        SeatManager seatManager = new SeatManager(5);
        assertThat(seatManager.reserve(), equalTo(1));
        assertThat(seatManager.reserve(), equalTo(2));
        seatManager.unreserve(2);
        assertThat(seatManager.reserve(), equalTo(2));
        assertThat(seatManager.reserve(), equalTo(3));
        assertThat(seatManager.reserve(), equalTo(4));
        assertThat(seatManager.reserve(), equalTo(5));
        seatManager.unreserve(5);
    }
}
