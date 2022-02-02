package g0801_0900.s0825_friends_of_appropriate_ages;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers

public class Solution {
      public int numFriendRequests(int[] ages) {
        int[] counter = new int[121];
        for (int k: ages) {
            counter[k]++;
        }
        
        int result = 0;
        for (int k = 15; k < counter.length; k++) {
            if (counter[k] == 0) {
                continue;
            }
            result += counter[k] * (counter[k] - 1);
			
            for (int y = k - 1; y > k / 2.0 + 7; y--) {
                result += counter[k] * counter[y];
            }
        }
        
        return result;
    }
}