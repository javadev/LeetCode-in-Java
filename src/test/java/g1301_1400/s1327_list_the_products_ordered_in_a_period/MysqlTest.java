package g1301_1400.s1327_list_the_products_ordered_in_a_period;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.zapodot.junit.db.annotations.EmbeddedDatabase;
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest;
import org.zapodot.junit.db.common.CompatibilityMode;

@EmbeddedDatabaseTest(
        compatibilityMode = CompatibilityMode.MySQL,
        initialSqls =
                "CREATE TABLE Products(product_id INTEGER, product_name VARCHAR, product_category VARCHAR); "
                        + "INSERT INTO Products(product_id, product_name, product_category)"
                        + " VALUES (1, 'Leetcode Solutions', 'Book'); "
                        + "INSERT INTO Products(product_id, product_name, product_category)"
                        + " VALUES (2, 'Jewels of Stringology', 'Book'); "
                        + "INSERT INTO Products(product_id, product_name, product_category)"
                        + " VALUES (3, 'HP', 'Laptop'); "
                        + "INSERT INTO Products(product_id, product_name, product_category)"
                        + " VALUES (4, 'Lenovo', 'Laptop'); "
                        + "INSERT INTO Products(product_id, product_name, product_category)"
                        + " VALUES (5, 'Leetcode Kit', 'T-shirt'); "
                        + "CREATE TABLE Orders(product_id INTEGER, order_date DATE, unit INTEGER); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (1, '2020-02-05', 60); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (1, '2020-02-10', 70); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (2, '2020-01-18', 30); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (2, '2020-02-11', 80); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (3 , '2020-02-17', 2); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (3, '2020-02-24', 3); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (4, '2020-03-01', 20); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (4, '2020-03-04', 30); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (4, '2020-03-04', 60); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (5, '2020-02-25', 50); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (5, '2020-02-27', 50); "
                        + "INSERT INTO Orders(product_id, order_date, unit)"
                        + " VALUES (5, '2020-03-01', 50); ")
class MysqlTest {
    @Test
    void testScript(@EmbeddedDatabase DataSource dataSource)
            throws SQLException, FileNotFoundException {
        try (final Connection connection = dataSource.getConnection()) {
            try (final Statement statement = connection.createStatement();
                    final ResultSet resultSet =
                            statement.executeQuery(
                                    new BufferedReader(
                                                    new FileReader(
                                                            "src/main/java/g1301_1400/"
                                                                    + "s1327_list_the_products_ordered_"
                                                                    + "in_a_period/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Leetcode Kit"));
                assertThat(resultSet.getInt(2), equalTo(100));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Leetcode Solutions"));
                assertThat(resultSet.getInt(2), equalTo(130));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
