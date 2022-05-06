package g1801_1900.s1825_finding_mk_average;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MKAverageTest {
    @Test
    void mKAverage() {
        MKAverage obj = new MKAverage(3, 1);
        obj.addElement(3);
        obj.addElement(1);
        assertThat(obj.calculateMKAverage(), equalTo(-1));
        obj.addElement(10);
        assertThat(obj.calculateMKAverage(), equalTo(3));
        obj.addElement(5);
        obj.addElement(5);
        obj.addElement(5);
        assertThat(obj.calculateMKAverage(), equalTo(5));
    }
}
