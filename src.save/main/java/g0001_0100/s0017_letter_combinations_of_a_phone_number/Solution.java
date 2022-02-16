package g0001_0100.s0017_letter_combinations_of_a_phone_number;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Backtracking

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        findCombinations(0, digits, letters, sb, ans);
        return ans;
    }

    private void findCombinations(
            int start, String nums, String[] letters, StringBuilder curr, List<String> ans) {
        if (curr.length() == nums.length()) {
            ans.add(curr.toString());
            return;
        }
        for (int i = start; i < nums.length(); i++) {
            int n = Character.getNumericValue(nums.charAt(i));
            for (int j = 0; j < letters[n].length(); j++) {
                char ch = letters[n].charAt(j);
                curr.append(ch);
                findCombinations(i + 1, nums, letters, curr, ans);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }
}
