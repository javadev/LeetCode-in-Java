package g0501_0600.s0535_encode_and_decode_tinyurl;

// #Medium #String #Hash_Table #Design #Hash_Function
// #2022_08_02_Time_2_ms_(89.67%)_Space_42.1_MB_(96.88%)

import java.util.HashMap;
import java.util.Map;

public class Codec {
    private Map<String, String> map = new HashMap<>();
    private int n = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        n++;
        String ans = "http://tinyurl.com/";
        ans += Integer.toString(n);
        map.put(ans, longUrl);
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
