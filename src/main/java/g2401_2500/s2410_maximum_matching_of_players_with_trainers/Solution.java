package g2401_2500.s2410_maximum_matching_of_players_with_trainers;

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2022_10_24_Time_28_ms_(98.31%)_Space_60.2_MB_(94.06%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0;
        int j = 0;
        int count = 0;
        i = 0;
        while (i < players.length) {
            while (trainers[j] < players[i]) {
                j++;
                if (j >= trainers.length) {
                    break;
                }
            }
            if (j >= trainers.length) {
                break;
            }
            if (trainers[j] >= players[i]) {
                count++;
            }
            i++;
            j++;
            if (j >= trainers.length || i >= players.length) {
                break;
            }
        }
        return count;
    }
}
