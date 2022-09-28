package g2001_2100.s2069_walking_robot_simulation_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class RobotTest {
    @Test
    void robot() {
        // Initialize the grid and the robot at (0, 0) facing East.
        Robot robot = new Robot(6, 3);
        // It moves two steps East to (2, 0), and faces East.
        robot.step(2);
        // It moves two steps East to (4, 0), and faces East.
        robot.step(2);
        // return [4, 0]
        assertThat(robot.getPos(), equalTo(new int[] {4, 0}));
        // return "East"
        robot.getDir();
        // It moves one step East to (5, 0), and faces East.
        // Moving the next step East would be out of bounds, so it turns and faces North.
        // Then, it moves one step North to (5, 1), and faces North.
        robot.step(2);
        // It moves one step North to (5, 2), and faces North (not West).
        robot.step(1);
        // Moving the next step North would be out of bounds, so it turns and faces West.
        // Then, it moves four steps West to (1, 2), and faces West.
        robot.step(4);
        // return [1, 2]
        assertThat(robot.getPos(), equalTo(new int[] {1, 2}));
        // return "West"
        assertThat(robot.getDir(), equalTo("West"));
    }

    @Test
    void robot2() {
        // Initialize the grid and the robot at (0, 0) facing East.
        Robot robot = new Robot(0, 0);
        // It moves two steps East to (0, -2), and faces East.
        robot.step(2);
        // It moves two steps East to (0, -4), and faces East.
        robot.step(2);
        // return [0, -4]
        assertThat(robot.getPos(), equalTo(new int[] {0, -4}));
    }

    @Test
    void robot3() {
        // Initialize the grid and the robot at (0, 0) facing East.
        Robot robot = new Robot(2, 2);
        // It moves two steps East to (2, 0), and faces East.
        robot.step(2);
        // It moves two steps East to (4, 0), and faces East.
        robot.step(2);
        // It moves two steps East to (6, 0), and faces East.
        robot.step(2);
        // return [1, 1]
        assertThat(robot.getPos(), equalTo(new int[] {1, 1}));
    }
}
