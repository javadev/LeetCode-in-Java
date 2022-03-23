package g1401_1500.s1496_path_crossing;

// #Easy #String #Hash_Table #2022_03_23_Time_1_ms_(97.41%)_Space_42.9_MB_(31.41%)

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Solution {
    public boolean isPathCrossing(String path) {
        Deque<Coord> visited = new ArrayDeque<>();
        visited.add(new Coord(0, 0));
        for (char c : path.toCharArray()) {
            Coord last = visited.peek();
            if (c == 'N') {
                Coord nextStep = new Coord(last.x, last.y + 1);
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            } else if (c == 'S') {
                Coord nextStep = new Coord(last.x, last.y - 1);
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            } else if (c == 'E') {
                Coord nextStep = new Coord(last.x - 1, last.y);
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            } else if (c == 'W') {
                Coord nextStep = new Coord(last.x + 1, last.y);
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            }
        }
        return false;
    }

    private static class Coord {
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Coord coord = (Coord) o;
            return x == coord.x && y == coord.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
