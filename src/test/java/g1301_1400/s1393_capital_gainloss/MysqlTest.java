package g1301_1400.s1393_capital_gainloss;

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
                "CREATE TABLE Stocks(stock_name VARCHAR, operation VARCHAR,"
                        + " operation_day INTEGER, price INTEGER); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Leetcode', 'Buy', 1, 1000); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Corona Masks', 'Buy', 2, 10); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Leetcode', 'Sell', 5, 9000); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Handbags', 'Buy', 17, 30000); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Corona Masks', 'Sell', 3, 1010); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Corona Masks', 'Buy', 4, 1000); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Corona Masks', 'Sell', 5, 500); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Corona Masks', 'Buy', 6, 1000); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Handbags', 'Sell', 29, 7000); "
                        + "INSERT INTO Stocks(stock_name, operation, operation_day, price)"
                        + " VALUES ('Corona Masks', 'Sell', 10, 10000); ")
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
                                                            "src/main/java/g1301_1400/s1393_"
                                                                    + "capital_gainloss"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Corona Masks"));
                assertThat(resultSet.getInt(2), equalTo(9500));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Handbags"));
                assertThat(resultSet.getInt(2), equalTo(-23000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Leetcode"));
                assertThat(resultSet.getInt(2), equalTo(8000));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
