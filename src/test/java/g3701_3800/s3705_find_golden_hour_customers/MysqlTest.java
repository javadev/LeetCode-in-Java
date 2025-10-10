package g3701_3800.s3705_find_golden_hour_customers;

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
                "CREATE TABLE restaurant_orders ("
                        + "    order_id INTEGER,"
                        + "    customer_id INTEGER NOT NULL,"
                        + "    order_timestamp DATETIME NOT NULL,"
                        + "    order_amount DECIMAL(10,2) NOT NULL,"
                        + "    payment_method VARCHAR(20) NOT NULL,"
                        + "    order_rating INTEGER"
                        + ");"
                        + "INSERT INTO restaurant_orders (order_id, customer_id, "
                        + "order_timestamp, order_amount, payment_method, order_rating) VALUES"
                        + "(1, 101, '2024-03-01 12:30:00', 25.50, 'card', 5),"
                        + "(2, 101, '2024-03-02 19:15:00', 32.00, 'app', 4),"
                        + "(3, 101, '2024-03-03 13:45:00', 28.75, 'card', 5),"
                        + "(4, 101, '2024-03-04 20:30:00', 41.00, 'app', NULL),"
                        + "(5, 102, '2024-03-01 11:30:00', 18.50, 'cash', 4),"
                        + "(6, 102, '2024-03-02 12:00:00', 22.00, 'card', 3),"
                        + "(7, 102, '2024-03-03 15:30:00', 19.75, 'cash', NULL),"
                        + "(8, 103, '2024-03-01 19:00:00', 55.00, 'app', 5),"
                        + "(9, 103, '2024-03-02 20:45:00', 48.50, 'app', 4),"
                        + "(10, 103, '2024-03-03 18:30:00', 62.00, 'card', 5),"
                        + "(11, 104, '2024-03-01 10:00:00', 15.00, 'cash', 3),"
                        + "(12, 104, '2024-03-02 09:30:00', 18.00, 'cash', 2),"
                        + "(13, 104, '2024-03-03 16:00:00', 20.00, 'card', 3),"
                        + "(14, 105, '2024-03-01 12:15:00', 30.00, 'app', 4),"
                        + "(15, 105, '2024-03-02 13:00:00', 35.50, 'app', 5),"
                        + "(16, 105, '2024-03-03 11:45:00', 28.00, 'card', 4);")
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
                                                            "src/main/java/g3701_3800/"
                                                                    + "s3705_find_golden_hour_customers/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("103"));
                assertThat(resultSet.getString(2), equalTo("3"));
                assertThat(resultSet.getString(3), equalTo("100"));
                assertThat(resultSet.getString(4), equalTo("4.67"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("101"));
                assertThat(resultSet.getString(2), equalTo("4"));
                assertThat(resultSet.getString(3), equalTo("100"));
                assertThat(resultSet.getString(4), equalTo("4.67"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("105"));
                assertThat(resultSet.getString(2), equalTo("3"));
                assertThat(resultSet.getString(3), equalTo("100"));
                assertThat(resultSet.getString(4), equalTo("4.33"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
