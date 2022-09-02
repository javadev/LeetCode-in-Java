package g1801_1900.s1847_closest_room;

// #Hard #Array #Sorting #Binary_Search #2022_05_07_Time_95_ms_(81.67%)_Space_131.7_MB_(40.00%)

import java.util.Arrays;
import java.util.TreeSet;

public class Solution {
    public int[] closestRoom(int[][] rooms, int[][] queries) {
        int numRoom = rooms.length;
        int numQuery = queries.length;
        for (int i = 0; i < numQuery; i++) {
            queries[i] = new int[] {queries[i][0], queries[i][1], i};
        }
        Arrays.sort(rooms, (a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : (a[0] - b[0])));
        Arrays.sort(queries, (a, b) -> (a[1] != b[1] ? (a[1] - b[1]) : (a[0] - b[0])));
        TreeSet<Integer> roomIds = new TreeSet<>();
        int[] result = new int[numQuery];
        int j = numRoom - 1;
        for (int i = numQuery - 1; i >= 0; i--) {
            int currRoomId = queries[i][0];
            int currRoomSize = queries[i][1];
            int currQueryIndex = queries[i][2];
            while (j >= 0 && rooms[j][1] >= currRoomSize) {
                roomIds.add(rooms[j--][0]);
            }
            if (roomIds.contains(currRoomId)) {
                result[currQueryIndex] = currRoomId;
                continue;
            }
            Integer nextRoomId = roomIds.higher(currRoomId);
            Integer prevRoomId = roomIds.lower(currRoomId);
            if (nextRoomId == null && prevRoomId == null) {
                result[currQueryIndex] = -1;
            } else if (nextRoomId == null) {
                result[currQueryIndex] = prevRoomId;
            } else if (prevRoomId == null) {
                result[currQueryIndex] = nextRoomId;
            } else {
                if ((currRoomId - prevRoomId) <= (nextRoomId - currRoomId)) {
                    result[currQueryIndex] = prevRoomId;
                } else {
                    result[currQueryIndex] = nextRoomId;
                }
            }
        }
        return result;
    }
}
