package g0501_0600.s0535_encode_and_decode_tinyurl;

// #Medium #String #Hash_Table #Design #Hash_Function

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
