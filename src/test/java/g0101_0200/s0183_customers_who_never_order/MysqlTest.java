package g0101_0200.s0183_customers_who_never_order;

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
import org.zapodot.junit.db.common.Engine;

@EmbeddedDatabaseTest(
        engine = Engine.H2,
        compatibilityMode = CompatibilityMode.MySQL,
        initialSqls =
                "CREATE TABLE Customers(id INTEGER PRIMARY KEY, name VARCHAR); "
                        + "INSERT INTO Customers(id, name) VALUES (1, 'Joe'); "
                        + "INSERT INTO Customers(id, name) VALUES (2, 'Henry'); "
                        + "INSERT INTO Customers(id, name) VALUES (3, 'Sam'); "
                        + "INSERT INTO Customers(id, name) VALUES (4, 'Max'); "
                        + "CREATE TABLE Orders(id INTEGER, customerId INTEGER); "
                        + "INSERT INTO Orders(id, customerId) VALUES (1, 3); "
                        + "INSERT INTO Orders(id, customerId) VALUES (2, 1); ")
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
                                                            "src/main/java/g0101_0200/"
                                                                    + "s0183_customers_who_never_order/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Henry"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Max"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
