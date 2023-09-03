package g1601_1700.s1603_design_parking_system;

// #Easy #Design #Simulation #Counting #Programming_Skills_I_Day_12_Class_and_Object
// #2022_04_11_Time_8_ms_(76.16%)_Space_54.3_MB_(65.10%)

public class ParkingSystem {
    private final int[] slots = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        slots[0] = big;
        slots[1] = medium;
        slots[2] = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (slots[0] > 0) {
                slots[0]--;
                return true;
            } else {
                return false;
            }
        } else if (carType == 2) {
            if (slots[1] > 0) {
                slots[1]--;
                return true;
            } else {
                return false;
            }
        } else {
            if (slots[2] > 0) {
                slots[2]--;
                return true;
            } else {
                return false;
            }
        }
    }
}
