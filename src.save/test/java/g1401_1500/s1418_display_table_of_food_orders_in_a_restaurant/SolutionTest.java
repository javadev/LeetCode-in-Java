package g1401_1500.s1418_display_table_of_food_orders_in_a_restaurant;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void displayTable() {
        List<List<String>> orders =
                Arrays.asList(
                        Arrays.asList("David", "3", "Ceviche"),
                        Arrays.asList("Corina", "10", "Beef Burrito"),
                        Arrays.asList("David", "3", "Fried Chicken"),
                        Arrays.asList("Carla", "5", "Water"),
                        Arrays.asList("Carla", "5", "Ceviche"),
                        Arrays.asList("Rous", "3", "Ceviche"));
        List<List<String>> output =
                Arrays.asList(
                        Arrays.asList("Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"),
                        Arrays.asList("3", "0", "2", "1", "0"),
                        Arrays.asList("5", "0", "1", "0", "1"),
                        Arrays.asList("10", "1", "0", "0", "0"));
        assertThat(new Solution().displayTable(orders), equalTo(output));
    }

    @Test
    void displayTable2() {
        List<List<String>> orders =
                Arrays.asList(
                        Arrays.asList("James", "12", "Fried Chicken"),
                        Arrays.asList("Ratesh", "12", "Fried Chicken"),
                        Arrays.asList("Amadeus", "12", "Fried Chicken"),
                        Arrays.asList("Adam", "1", "Canadian Waffles"),
                        Arrays.asList("Brianna", "1", "Canadian Waffles"));
        List<List<String>> output =
                Arrays.asList(
                        Arrays.asList("Table", "Canadian Waffles", "Fried Chicken"),
                        Arrays.asList("1", "2", "0"),
                        Arrays.asList("12", "0", "3"));
        assertThat(new Solution().displayTable(orders), equalTo(output));
    }

    @Test
    void displayTable3() {
        List<List<String>> orders =
                Arrays.asList(
                        Arrays.asList("Laura", "2", "Bean Burrito"),
                        Arrays.asList("Jhon", "2", "Beef Burrito"),
                        Arrays.asList("Melissa", "2", "Soda"));
        List<List<String>> output =
                Arrays.asList(
                        Arrays.asList("Table", "Bean Burrito", "Beef Burrito", "Soda"),
                        Arrays.asList("2", "1", "1", "1"));
        assertThat(new Solution().displayTable(orders), equalTo(output));
    }
}
