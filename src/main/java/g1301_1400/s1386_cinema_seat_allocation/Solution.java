package g1301_1400.s1386_cinema_seat_allocation;

// #Medium #Array #Hash_Table #Greedy #Bit_Manipulation
// #2022_03_21_Time_32_ms_(69.41%)_Space_68.7_MB_(68.13%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, int[]> occupiedFamilySeats = new HashMap<>();
        for (int[] reservedSeat : reservedSeats) {
            int row = reservedSeat[0];
            int col = reservedSeat[1];
            if (col == 1 || col == 10) {
                continue;
            }
            int[] rowFamilySeats = occupiedFamilySeats.getOrDefault(row, new int[3]);
            if (col == 2 || col == 3) {
                // mark left family seating as occupied
                rowFamilySeats[0] = 1;
                occupiedFamilySeats.put(row, rowFamilySeats);
            }
            if (col == 8 || col == 9) {
                // mark right family seating as occupied
                rowFamilySeats[2] = 1;
                occupiedFamilySeats.put(row, rowFamilySeats);
            }
            if (col == 4 || col == 5) {
                // mark left family seating as occupied
                rowFamilySeats[0] = 1;
                // mark min family seating as occupied
                rowFamilySeats[1] = 1;
                occupiedFamilySeats.put(row, rowFamilySeats);
            }
            if (col == 6 || col == 7) {
                // mark min family seating as occupied
                rowFamilySeats[1] = 1;
                // mark right family seating as occupied
                rowFamilySeats[2] = 1;
                occupiedFamilySeats.put(row, rowFamilySeats);
            }
        }
        // max number of family seats per row is 2, so we start that minus the rows for which we
        // have reservations
        int count = n * 2 - 2 * occupiedFamilySeats.size();
        // for each row with reservations, count remaining family seatings
        for (int[] familySeats : occupiedFamilySeats.values()) {
            if (familySeats[0] == 0) {
                count++;
            }
            if (familySeats[2] == 0) {
                count++;
            }
            if (familySeats[0] != 0 && familySeats[2] != 0 && familySeats[1] == 0) {
                count++;
            }
        }
        return count;
    }
}
