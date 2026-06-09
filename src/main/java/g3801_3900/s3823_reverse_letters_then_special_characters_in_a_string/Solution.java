package g3801_3900.s3823_reverse_letters_then_special_characters_in_a_string;

// #Easy #String #Two_Pointers #Simulation #Mid_Level #Biweekly_Contest_175
// #2026_06_09_Time_1_ms_(100.00%)_Space_44.12_MB_(93.04%)

public class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] >= 'a' && arr[low] <= 'z' && arr[high] >= 'a' && arr[high] <= 'z') {
                char t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
                low++;
                high--;
            } else if (arr[low] < 'a' || arr[low] > 'z') {
                low++;
            } else {
                high--;
            }
        }

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if ((arr[i] < 'a' || arr[i] > 'z') && (arr[j] < 'a' || arr[j] > 'z')) {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                i++;
            } else {
                j--;
            }
        }

        return new String(arr);
    }
}
