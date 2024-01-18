package g2401_2500.s2491_divide_players_into_teams_of_equal_skill;

// #Medium #Array #Hash_Table #Sorting #Two_Pointers
// #2023_01_27_Time_21_ms_(70.31%)_Space_73.6_MB_(27.92%)

import java.util.Arrays;

public class Solution {
    public long dividePlayers(int[] skill) {
        int i = 0;
        int j = skill.length - 1;
        Arrays.sort(skill);
        int sum = skill[i] + skill[j];
        long p = 0;
        while (i < j) {
            if (skill[i] + skill[j] != sum) {
                return -1;
            }
            p += ((long) skill[i] * skill[j]);
            i++;
            j--;
        }
        return p;
    }
}
