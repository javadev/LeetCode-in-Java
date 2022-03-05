package g1101_1200.s1172_dinner_plate_stacks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class DinnerPlatesTest {
    @Test
    void dinnerPlatesTest() {
        DinnerPlates D = new DinnerPlates(2); // Initialize with capacity = 2
        D.push(1);
        D.push(2);
        D.push(3);
        D.push(4);
        D.push(5);
        assertThat(D.popAtStack(0), equalTo(2));
        D.push(20);
        D.push(21);
        assertThat(D.popAtStack(0), equalTo(20));
        assertThat(D.popAtStack(2), equalTo(21));
        assertThat(D.pop(), equalTo(5));
        assertThat(D.pop(), equalTo(4));
        assertThat(D.pop(), equalTo(3));
        assertThat(D.pop(), equalTo(1));
        assertThat(D.pop(), equalTo(-1));
    }
}
