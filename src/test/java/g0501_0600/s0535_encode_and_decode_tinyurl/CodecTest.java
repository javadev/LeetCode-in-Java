package g0501_0600.s0535_encode_and_decode_tinyurl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class CodecTest {
    @Test
    void codec() {
        String url = "https://leetcode.com/problems/design-tinyurl";
        Codec obj = new Codec();
        String tiny = obj.encode(url);
        String ans = obj.decode(tiny);
        assertThat(ans, equalTo(url));
    }
}
