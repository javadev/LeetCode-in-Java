package g2401_2500.s2424_longest_uploaded_prefix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class LUPrefixTest {
    @Test
    void luPrefix() {
        LUPrefix luPrefix = new LUPrefix(4);
        luPrefix.upload(3);
        assertThat(luPrefix.longest(), equalTo(0));
        luPrefix.upload(1);
        assertThat(luPrefix.longest(), equalTo(1));
        luPrefix.upload(2);
        assertThat(luPrefix.longest(), equalTo(3));
    }
}
