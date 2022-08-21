package g2301_2400.s2332_the_latest_time_to_catch_a_bus;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2022_07_10_Time_28_ms_(100.00%)_Space_59.3_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        // sort arrays and move in arrays from left to right and find capacity in last bus
        // if capcity is full in last bus then find time last passenger might have boarded then go
        // backward till find a slot to replace last passenger
        // if capacity is not full in last bus then start with last bus departure time and check if
        // can board on last moment and go backward till find a available time slot
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int blen = buses.length;
        int plen = passengers.length;
        int b = 0;
        int p = 0;
        int c = 0;
        // find capacity in last bus
        while (b < blen && p < plen) {
            if (passengers[p] <= buses[b] && c < capacity) {
                c++;
                p++;
            }
            if (c == capacity || (p < plen && passengers[p] > buses[b])) {
                if (b < (blen - 1)) {
                    c = 0;
                }
                b++;
            }
        }
        int start = 0;
        if (c == capacity) {
            // capcity is full in last bus, find time last passenger might have boarded
            start = Math.min(passengers[p - 1], buses[blen - 1]);
        } else {
            // capacity is not full in last bus, start with last bus departure time and check if can
            // board on last moment
            start = buses[blen - 1];
        }
        // go backward till find a slot
        while (p > 0 && start == passengers[p - 1]) {
            start--;
            p--;
        }
        return start;
    }
}
