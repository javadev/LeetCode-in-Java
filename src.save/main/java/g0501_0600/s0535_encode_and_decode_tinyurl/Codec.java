package g0501_0600.s0535_encode_and_decode_tinyurl;

// #Medium #String #Hash_Table #Design #Hash_Function
// #2022_03_20_Time_3_ms_(82.89%)_Space_43.4_MB_(53.75%)

import java.util.HashMap;
import java.util.Map;

public class Codec {
    private final Map<String, String> map = new HashMap<>();
    private static final String DIGITS =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encode(String longUrl) {
        long cur = 0;
        StringBuilder shortUrl = new StringBuilder();
        shortUrl.append(DIGITS.charAt((int) cur));
        map.put(shortUrl.toString(), longUrl);
        return shortUrl.toString();
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
