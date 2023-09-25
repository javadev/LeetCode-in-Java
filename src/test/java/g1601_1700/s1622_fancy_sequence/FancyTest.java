package g1601_1700.s1622_fancy_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class FancyTest {
    @Test
    void fancyTest() {
        Fancy fancy = new Fancy();
        fancy.append(2);
        fancy.addAll(3);
        fancy.append(7);
        fancy.multAll(2);
        assertThat(fancy.getIndex(0), equalTo(10));
        fancy.addAll(3);
        fancy.append(10);
        fancy.multAll(2);
        assertThat(fancy.getIndex(0), equalTo(26));
        assertThat(fancy.getIndex(1), equalTo(34));
        assertThat(fancy.getIndex(2), equalTo(20));
    }
}
