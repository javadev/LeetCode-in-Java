package g0501_0600.s0535_encode_and_decode_tinyurl;

// #Medium #String #Hash_Table #Design #Hash_Function #Acceptance_85.4%
// #2022_05_01_Time_4_ms_(65.42%)_Space_43.4_MB_(58.94%)

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
