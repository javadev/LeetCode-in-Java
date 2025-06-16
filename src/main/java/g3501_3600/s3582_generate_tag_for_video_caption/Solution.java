package g3501_3600.s3582_generate_tag_for_video_caption;

// #Easy #2025_06_16_Time_12_ms_(100.00%)_Space_45.47_MB_(100.00%)

@SuppressWarnings("java:S135")
public class Solution {
    public String generateTag(String caption) {
        if (caption.trim().isEmpty()) {
            return "#";
        }
        String[] arr = caption.trim().split("\\s+");
        StringBuilder res = new StringBuilder("#");
        String firstWord = arr[0];
        firstWord =
                firstWord.substring(0, 1).toLowerCase()
                        + (firstWord.length() > 1 ? firstWord.substring(1).toLowerCase() : "");
        res.append(firstWord);
        for (int i = 1; i < arr.length; i++) {
            String w = arr[i];
            if (w.isEmpty()) {
                continue;
            }
            w =
                    w.substring(0, 1).toUpperCase()
                            + (w.length() > 1 ? w.substring(1).toLowerCase() : "");
            res.append(w);
            if (res.length() >= 100) {
                break;
            }
        }
        return res.length() > 100 ? res.substring(0, 100) : res.toString();
    }
}
