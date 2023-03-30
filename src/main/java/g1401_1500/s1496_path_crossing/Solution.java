package g1401_1500.s1496_path_crossing;

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
                Coord nextStep = new Coord(last.getX(), last.getY() + 1);
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            } else if (c == 'S') {
                Coord nextStep = new Coord(last.getX(), last.getY() - 1);
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            } else if (c == 'E') {
                Coord nextStep = new Coord(last.getX() - 1, last.getY());
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            } else if (c == 'W') {
                Coord nextStep = new Coord(last.getX() + 1, last.getY());
                if (visited.contains(nextStep)) {
                    return true;
                }
                visited.add(nextStep);
            }
        }
        return false;
    }

    // Push-down x and y fields to Coord class (Push down variable/method refactoring technique)
    private static class Coord {
        private final int x;
        private final int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
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
