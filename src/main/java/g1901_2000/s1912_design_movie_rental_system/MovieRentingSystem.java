package g1901_2000.s1912_design_movie_rental_system;

// #Hard #Array #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2022_05_14_Time_562_ms_(74.14%)_Space_175.3_MB_(91.38%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@SuppressWarnings("java:S1172")
public class MovieRentingSystem {
    private static class Point {
        int movie;
        int shop;
        int price;

        public Point(int movie, int shop, int price) {
            this.movie = movie;
            this.shop = shop;
            this.price = price;
        }
    }

    private HashMap<Integer, TreeSet<Point>> unrentedMovies = new HashMap<>();
    private HashMap<String, Integer> shopMovieToPrice = new HashMap<>();
    private Comparator<Point> comparator =
            (o1, o2) -> {
                if (o1.price != o2.price) {
                    return Integer.compare(o1.price, o2.price);
                } else if (o1.shop != o2.shop) {
                    return Integer.compare(o1.shop, o2.shop);
                } else {
                    return Integer.compare(o1.movie, o2.movie);
                }
            };
    private TreeSet<Point> rented = new TreeSet<>(comparator);

    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] entry : entries) {
            int shop = entry[0];
            int movie = entry[1];
            int price = entry[2];
            unrentedMovies.putIfAbsent(movie, new TreeSet<>(comparator));
            unrentedMovies.get(movie).add(new Point(movie, shop, price));
            shopMovieToPrice.put(shop + "+" + movie, price);
        }
    }

    public List<Integer> search(int movie) {
        if (!unrentedMovies.containsKey(movie)) {
            return new ArrayList<>();
        }
        Iterator<Point> iterator = unrentedMovies.get(movie).iterator();
        List<Integer> listOfShops = new ArrayList<>();
        while (iterator.hasNext() && listOfShops.size() < 5) {
            listOfShops.add(iterator.next().shop);
        }
        return listOfShops;
    }

    public void rent(int shop, int movie) {
        int price = shopMovieToPrice.get(shop + "+" + movie);
        rented.add(new Point(movie, shop, price));
        unrentedMovies.get(movie).remove(new Point(movie, shop, price));
    }

    public void drop(int shop, int movie) {
        int price = shopMovieToPrice.get(shop + "+" + movie);
        rented.remove(new Point(movie, shop, price));
        unrentedMovies.get(movie).add(new Point(movie, shop, price));
    }

    public List<List<Integer>> report() {
        List<List<Integer>> ans = new ArrayList<>();
        Iterator<Point> iterator = rented.iterator();
        while (iterator.hasNext() && ans.size() < 5) {
            Point point = iterator.next();
            ans.add(Arrays.asList(point.shop, point.movie));
        }
        return ans;
    }
}
