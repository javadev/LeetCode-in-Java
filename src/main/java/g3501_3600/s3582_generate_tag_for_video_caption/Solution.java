package g3501_3600.s3582_generate_tag_for_video_caption;

// #Easy #String #Simulation #2025_06_17_Time_2_ms_(99.93%)_Space_43.54_MB_(89.89%)

public class Solution {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        boolean space = false;
        caption = caption.trim();
        for (int i = 0; i < caption.length(); i++) {
            char c = caption.charAt(i);
            if (c == ' ') {
                space = true;
            }
            if (c >= 'A' && c <= 'Z') {
                if (space) {
                    space = !space;
                    sb.append(c);
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            if (c >= 'a' && c <= 'z') {
                if (space) {
                    space = !space;
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
            }
        }
        if (sb.length() > 100) {
            return sb.substring(0, 100);
        }
        return sb.toString();
    }
}
