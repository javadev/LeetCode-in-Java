package g1301_1400.s1346_check_if_n_and_its_double_exist;

// #Easy #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers #Binary_Search_I_Day_9
// #2022_03_21_Time_1_ms_(99.64%)_Space_41.9_MB_(70.36%)

public class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (arr[i] * 2 == arr[j] || arr[i] == arr[j] * 2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
