package g1901_2000.s1912_design_movie_rental_system;

public class Rental implements Comparable<Rental> {
    private int movie;
    private int shop;
    private int price;

    public Rental(int movie, int shop, int price) {
        this.movie = movie;
        this.shop = shop;
        this.price = price;
    }

    public int getMovie() {
        return movie;
    }

    public int getShop() {
        return shop;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Rental o) {
        if (this.price != o.price) {
            return Integer.compare(this.price, o.price);
        } else if (this.shop != o.shop) {
            return Integer.compare(this.shop, o.shop);
        } else {
            return Integer.compare(this.movie, o.movie);
        }
    }
}
