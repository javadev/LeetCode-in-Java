package g0301_0400.s0383_ransom_note;

// #Easy #String #Hash_Table #Counting #Data_Structure_I_Day_6_String #Top_Interview_150_Hashmap
// #2025_03_09_Time_1_ms_(99.10%)_Space_44.62_MB_(86.13%)

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[26];
        int n = ransomNote.length();
        for (int i = 0; i < n; i++) {
            a[ransomNote.charAt(i) - 97]++;
        }
        for (int i = 0; i < magazine.length() && n != 0; i++) {
            if (a[magazine.charAt(i) - 97] > 0) {
                n--;
                a[magazine.charAt(i) - 97]--;
            }
        }
        return n == 0;
    }
}
