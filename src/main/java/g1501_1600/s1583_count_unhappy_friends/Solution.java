package g1501_1600.s1583_count_unhappy_friends;

// #Medium #Array #Simulation #2022_04_11_Time_3_ms_(93.13%)_Space_63.8_MB_(64.81%)

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S1172")
public class Solution {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int unhappyFriends = 0;
        Map<Integer, Integer> assignedPair = new HashMap<>();
        for (int[] pair : pairs) {
            assignedPair.put(pair[0], pair[1]);
            assignedPair.put(pair[1], pair[0]);
        }
        for (int[] pair : pairs) {
            if (isUnHappy(pair[1], pair[0], preferences, assignedPair)) {
                unhappyFriends++;
            }
            if (isUnHappy(pair[0], pair[1], preferences, assignedPair)) {
                unhappyFriends++;
            }
        }
        return unhappyFriends;
    }

    private boolean isUnHappy(
            int self,
            int assignedFriend,
            int[][] preferences,
            Map<Integer, Integer> assignedPairs) {
        int[] preference = preferences[self];
        int assignedFriendPreferenceIndex = findIndex(preference, assignedFriend);
        for (int i = 0; i <= assignedFriendPreferenceIndex; i++) {
            int preferredFriend = preference[i];
            int preferredFriendAssignedFriend = assignedPairs.get(preferredFriend);
            if (preferredFriendAssignedFriend == self) {
                return false;
            }
            int candidateAssignedFriendIndex =
                    findIndex(preferences[preferredFriend], preferredFriendAssignedFriend);
            if (isPreferred(self, preferences[preferredFriend], candidateAssignedFriendIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPreferred(int self, int[] preference, int boundary) {
        for (int i = 0; i <= boundary; i++) {
            if (self == preference[i]) {
                return true;
            }
        }
        return false;
    }

    private int findIndex(int[] preference, int assignedFriend) {
        for (int i = 0; i < preference.length; i++) {
            if (preference[i] == assignedFriend) {
                return i;
            }
        }
        return 0;
    }
}
