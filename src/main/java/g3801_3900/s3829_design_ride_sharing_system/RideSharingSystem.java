package g3801_3900.s3829_design_ride_sharing_system;

// #Medium #Hash_Table #Design #Queue #Data_Stream #Staff #Weekly_Contest_487
// #2026_07_20_Time_42_ms_(100.00%)_Space_48.36_MB_(31.76%)

public class RideSharingSystem {
    java.util.Queue<Integer> rider = new java.util.LinkedList<>();
    java.util.Queue<Integer> driver = new java.util.LinkedList<>();
    java.util.Map<Integer, Integer> cancel = new java.util.HashMap<>();

    public RideSharingSystem() {
        // Not use
    }

    public void addRider(int riderId) {
        if (cancel.containsKey(riderId)) {
            cancel.remove(riderId);
        }
        rider.add(riderId);
    }

    public void addDriver(int driverId) {
        driver.add(driverId);
    }

    public int[] matchDriverWithRider() {
        while (!rider.isEmpty() && cancel.containsKey(rider.peek())) {
            rider.poll();
        }
        if (!rider.isEmpty() && !driver.isEmpty()) {
            int[] ans = {driver.peek(), rider.peek()};
            rider.poll();
            driver.poll();
            return ans;
        }
        return new int[] {-1, -1};
    }

    public void cancelRider(int riderId) {
        cancel.put(riderId, 1);
    }
}

/*
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
