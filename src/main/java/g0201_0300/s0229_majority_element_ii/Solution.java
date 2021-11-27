package g0201_0300.s0229_majority_element_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> results = new ArrayList<>();
        int len = nums.length;
        int first = 0;
        int second = 1;
        int count1 = 0;
        int count2 = 0;
        // now we have two candidates(any integer can be chosed as),and their votes are
        // zero.
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            if (temp == first) {
                count1++;
            }
            // if the number is the one of the candidates,increase the votes.
            else if (temp == second) {
                count2++;
            } else if (count1 == 0) {
                first = temp;
                count1++;
            } else if (count2 == 0) {
                second = temp;
                count2++;
            } // otherwise,if one of the vote is zero,that's meaning that
            // we only have or even don't have a candidate.So we set the number to the
            // candidate.
            else {
                count1--;
                count2--;
            } // where we have two candidates whose votes bigger than zero,
            // but the current number is not one of them.Votes decrease by 1 and
            // the current number complete its "mission" and is skipped at the same time.
            // once the cycle finished,the target is left after all the counteraction,as its
            // count is bigger than n/3.
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < len; i++) {
            // check both of them is bigger than n/3.Becasue we may have only one satisfying
            // the demand.
            int temp = nums[i];
            if (temp == first) {
                count1++;
            }
            if (temp == second) {
                count2++;
            }
        }
        if (count1 > len / 3) {
            results.add(first);
        }
        if (count2 > len / 3) {
            results.add(second);
        }
        return results;
    }
}
