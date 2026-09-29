package g3901_4000.s3923_minimum_generations_to_target_point;

// #Medium #Array #Hash_Table #Simulation #Staff #Biweekly_Contest_182
// #2026_09_29_Time_24_ms_(100.00%)_Space_46.83_MB_(67.86%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final int SIZE = 7;
    private static final int TOTAL_POINTS = SIZE * SIZE * SIZE;

    public int minGenerations(int[][] points, int[] target) {
        boolean[] visited = new boolean[TOTAL_POINTS];
        List<Integer> allPoints = new ArrayList<>();
        List<Integer> frontier = new ArrayList<>();

        int targetCode = encode(target[0], target[1], target[2]);

        initializePoints(points, visited, allPoints, frontier);

        if (frontier.contains(targetCode)) {
            return 0;
        }

        int generation = 0;

        while (!frontier.isEmpty()) {
            generation++;

            List<Integer> nextFrontier = generateNextFrontier(frontier, allPoints, visited);

            if (nextFrontier.contains(targetCode)) {
                return generation;
            }

            addPoints(nextFrontier, visited, allPoints);
            frontier = nextFrontier;
        }

        return -1;
    }

    private void initializePoints(
            int[][] points, boolean[] visited, List<Integer> allPoints, List<Integer> frontier) {

        for (int[] point : points) {
            int code = encode(point[0], point[1], point[2]);
            visited[code] = true;
            allPoints.add(code);
            frontier.add(code);
        }
    }

    private List<Integer> generateNextFrontier(
            List<Integer> frontier, List<Integer> allPoints, boolean[] visited) {

        List<Integer> nextFrontier = new ArrayList<>();
        boolean[] addedThisGeneration = new boolean[TOTAL_POINTS];

        for (int pointA : frontier) {
            addGeneratedPoints(pointA, allPoints, visited, addedThisGeneration, nextFrontier);
        }

        return nextFrontier;
    }

    private void addGeneratedPoints(
            int pointA,
            List<Integer> allPoints,
            boolean[] visited,
            boolean[] addedThisGeneration,
            List<Integer> nextFrontier) {

        int[] a = decode(pointA);

        for (int pointB : allPoints) {
            if (pointA != pointB) {
                addGeneratedPoint(a, pointB, visited, addedThisGeneration, nextFrontier);
            }
        }
    }

    private void addGeneratedPoint(
            int[] a,
            int pointB,
            boolean[] visited,
            boolean[] addedThisGeneration,
            List<Integer> nextFrontier) {

        int[] b = decode(pointB);

        int x = (a[0] + b[0]) / 2;
        int y = (a[1] + b[1]) / 2;
        int z = (a[2] + b[2]) / 2;

        int newPoint = encode(x, y, z);

        if (!visited[newPoint] && !addedThisGeneration[newPoint]) {
            addedThisGeneration[newPoint] = true;
            nextFrontier.add(newPoint);
        }
    }

    private void addPoints(List<Integer> points, boolean[] visited, List<Integer> allPoints) {

        for (int point : points) {
            visited[point] = true;
            allPoints.add(point);
        }
    }

    private int encode(int x, int y, int z) {
        return x * SIZE * SIZE + y * SIZE + z;
    }

    private int[] decode(int code) {
        int x = code / (SIZE * SIZE);
        code %= SIZE * SIZE;

        int y = code / SIZE;
        int z = code % SIZE;

        return new int[] {x, y, z};
    }
}
