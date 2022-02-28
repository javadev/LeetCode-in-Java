package g0701_0800.s0729_my_calendar_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyCalendarTest {
    @Test
    void myCalendarTest() {
        MyCalendar myCalendar = new MyCalendar();
        assertThat(myCalendar.book(10, 20), equalTo(true));
        assertThat(myCalendar.book(15, 25), equalTo(false));
        assertThat(myCalendar.book(20, 30), equalTo(true));
    }
}
