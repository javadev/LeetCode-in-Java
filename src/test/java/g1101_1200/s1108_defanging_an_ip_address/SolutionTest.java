package g1101_1200.s1108_defanging_an_ip_address;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void defangIPaddr() {
        assertThat(new Solution().defangIPaddr("1.1.1.1"), equalTo("1[.]1[.]1[.]1"));
    }

    @Test
    void defangIPaddr2() {
        assertThat(new Solution().defangIPaddr("255.100.50.0"), equalTo("255[.]100[.]50[.]0"));
    }
}
