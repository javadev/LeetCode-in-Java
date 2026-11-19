package g4001_4100.s4020_elevator_requests_i;

// #Easy #Array #Simulation #Mid_Level #Biweekly_Contest_189
// #2026_11_19_Time_1_ms_(99.23%)_Space_44.25_MB_(70.81%)

public class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = requests[0];
        for (int i = 1; i < requests.length; i++) {
            int currDiff = Math.abs(requests[i] - requests[i - 1]);
            time += currDiff;
        }
        return time;
    }
}
