package g0701_0800.s0731_my_calendar_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MyCalendarTwoTest {
    @Test
    void myCalendarTwoTest() {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        assertThat(myCalendarTwo.book(10, 20), equalTo(true));
        assertThat(myCalendarTwo.book(50, 60), equalTo(true));
        assertThat(myCalendarTwo.book(10, 40), equalTo(true));
        assertThat(myCalendarTwo.book(5, 15), equalTo(false));
        assertThat(myCalendarTwo.book(5, 10), equalTo(true));
        assertThat(myCalendarTwo.book(25, 55), equalTo(true));
    }
}
