package g0801_0900.s0855_exam_room;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class ExamRoomTest {
    @Test
    void examRoomTest() {

        ExamRoom examRoom = new ExamRoom(10);
        assertThat(examRoom.seat(), equalTo(0));
        assertThat(examRoom.seat(), equalTo(9));
        assertThat(examRoom.seat(), equalTo(4));
        assertThat(examRoom.seat(), equalTo(2));
        examRoom.leave(4);
        assertThat(examRoom.seat(), equalTo(5));
    }
}
