package g3901_4000.s3992_rearrange_string_to_avoid_character_pair;

// #Easy #String #Sorting #Two_Pointers #Mid_Level #Biweekly_Contest_187
// #2026_11_03_Time_2_ms_(78.07%)_Space_44.54_MB_(91.27%)

@SuppressWarnings("java:S1172")
public class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] arr = s.toCharArray();
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == y) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return new String(arr);
    }
}
