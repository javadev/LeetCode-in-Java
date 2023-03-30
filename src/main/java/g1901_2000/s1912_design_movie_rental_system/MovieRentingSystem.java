package g1901_2000.s1912_design_movie_rental_system;

// #Hard #Array #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2022_05_14_Time_562_ms_(74.14%)_Space_175.3_MB_(91.38%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class MovieRentingSystem {
    private HashMap<Integer, TreeSet<Rental>> unrentedMovies = new HashMap<>();
    private HashMap<String, Integer> shopMovieToPrice = new HashMap<>();
    private TreeSet<Rental> rented = new TreeSet<>();
    private static final int MAX_SHOPS_TO_LIST = 5;
    //Extract class refactoring technique
    public MovieRentingSystem(int n, int[][] entries) {
        for (int[] entry : entries) {
            int shop = entry[0];
            int movie = entry[1];
            int price = entry[2];
            unrentedMovies.putIfAbsent(movie, new TreeSet<>());
            unrentedMovies.get(movie).add(new Rental(movie, shop, price));
            shopMovieToPrice.put(getKey(shop, movie), price);
        }
    }

    public List<Integer> search(int movie) {
        if (!unrentedMovies.containsKey(movie)) {
            return new ArrayList<>();
        }
        Iterator<Rental> iterator = unrentedMovies.get(movie).iterator();
        List<Integer> listOfShops = new ArrayList<>();
        while (iterator.hasNext() && listOfShops.size() < MAX_SHOPS_TO_LIST) {
            listOfShops.add(iterator.next().getShop());
        }
        return listOfShops;
    }

    public void rent(int shop, int movie) {
        int price = shopMovieToPrice.get(getKey(shop, movie));
        rented.add(new Rental(movie, shop, price));
        unrentedMovies.get(movie).remove(new Rental(movie, shop, price));
    }

    public void drop(int shop, int movie) {
        int price = shopMovieToPrice.get(getKey(shop, movie));
        rented.remove(new Rental(movie, shop, price));
        unrentedMovies.get(movie).add(new Rental(movie, shop, price));
    }

    public List<List<Integer>> report() {
        List<List<Integer>> ans = new ArrayList<>();
        Iterator<Rental> iterator = rented.iterator();
        while (iterator.hasNext() && ans.size() < MAX_SHOPS_TO_LIST) {
            Rental rental = iterator.next();
            ans.add(Arrays.asList(rental.getShop(), rental.getMovie()));
        }
        return ans;
    }

    private String getKey(int shop, int movie) {
        return shop + "+" + movie;
    }

}
