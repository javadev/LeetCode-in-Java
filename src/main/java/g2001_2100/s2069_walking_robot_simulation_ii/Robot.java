package g2001_2100.s2069_walking_robot_simulation_ii;

// #Medium #Design #Simulation #2022_05_30_Time_110_ms_(56.14%)_Space_95.2_MB_(53.51%)

public class Robot {
    private int p;
    private int w;
    private int h;

    public Robot(int width, int height) {
        w = width - 1;
        h = height - 1;
        p = 0;
    }

    public void step(int num) {
        p += num;
    }

    public int[] getPos() {
        int remain = p % (2 * (w + h));
        if (remain <= w) {
            return new int[] {remain, 0};
        }
        remain -= w;
        if (remain <= h) {
            return new int[] {w, remain};
        }
        remain -= h;
        if (remain <= w) {
            return new int[] {w - remain, h};
        }
        remain -= w;
        return new int[] {0, h - remain};
    }

    public String getDir() {
        int[] pos = getPos();
        if (p == 0 || pos[1] == 0 && pos[0] > 0) {
            return "East";
        } else if (pos[0] == w && pos[1] > 0) {
            return "North";
        } else if (pos[1] == h && pos[0] < w) {
            return "West";
        } else {
            return "South";
        }
    }
}

/*
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
