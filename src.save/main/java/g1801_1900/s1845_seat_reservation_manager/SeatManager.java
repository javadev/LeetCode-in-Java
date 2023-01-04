package g1801_1900.s1845_seat_reservation_manager;

// #Medium #Design #Heap_Priority_Queue #Programming_Skills_II_Day_17
// #2022_05_07_Time_47_ms_(87.63%)_Space_107.1_MB_(45.03%)

import java.util.PriorityQueue;
import java.util.Queue;

@SuppressWarnings("java:S1172")
public class SeatManager {
    private final Queue<Integer> seats;
    private int smallest;

    public SeatManager(int n) {
        seats = new PriorityQueue<>();
        smallest = 0;
    }

    public int reserve() {
        return seats.isEmpty() ? ++smallest : seats.poll();
    }

    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}
