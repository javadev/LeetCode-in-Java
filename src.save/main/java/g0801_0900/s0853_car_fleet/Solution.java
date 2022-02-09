package g0801_0900.s0853_car_fleet;

// #Medium #Array #Sorting #Stack #Monotonic_Stack

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < position.length; i++) {
            Car c = new Car();
            c.position = position[i];
            c.speed = speed[i];
            cars.add(c);
        }

        cars.sort(Comparator.comparingInt(c -> c.position));

        int numFleets = 1;
        float lastTime =
                ((float) (target - cars.get(cars.size() - 1).position))
                        / (cars.get(cars.size() - 1).speed);

        for (int i = cars.size() - 2; i >= 0; i--) {
            float timeToTarget = ((float) (target - cars.get(i).position)) / (cars.get(i).speed);
            if (timeToTarget > lastTime) {
                numFleets++;
                lastTime = timeToTarget;
            }
        }

        return numFleets;
    }
}
