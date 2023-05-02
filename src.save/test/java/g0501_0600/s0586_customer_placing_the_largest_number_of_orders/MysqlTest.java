package g0501_0600.s0586_customer_placing_the_largest_number_of_orders;

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
                "CREATE TABLE Orders(order_number INTEGER, customer_number INTEGER); "
                        + "INSERT INTO Orders(order_number, customer_number) VALUES (1, 1); "
                        + "INSERT INTO Orders(order_number, customer_number) VALUES (2, 2); "
                        + "INSERT INTO Orders(order_number, customer_number) VALUES (3, 3); "
                        + "INSERT INTO Orders(order_number, customer_number) VALUES (4, 3); ")
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
                                                            "src/main/java/g0501_0600/"
                                                                    + "s0586_customer_placing"
                                                                    + "_the_largest_number_of"
                                                                    + "_orders/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
