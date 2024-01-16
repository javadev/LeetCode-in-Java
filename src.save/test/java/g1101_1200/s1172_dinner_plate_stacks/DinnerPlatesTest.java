package g1101_1200.s1172_dinner_plate_stacks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class DinnerPlatesTest {
    @Test
    void dinnerPlatesTest() {
        DinnerPlates d = new DinnerPlates(2);
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        d.push(5);
        assertThat(d.popAtStack(0), equalTo(2));
        d.push(20);
        d.push(21);
        assertThat(d.popAtStack(0), equalTo(20));
        assertThat(d.popAtStack(2), equalTo(21));
        assertThat(d.pop(), equalTo(5));
        assertThat(d.pop(), equalTo(4));
        assertThat(d.pop(), equalTo(3));
        assertThat(d.pop(), equalTo(1));
        assertThat(d.pop(), equalTo(-1));
    }
}
