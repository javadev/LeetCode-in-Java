package g1101_1200.s1193_monthly_transactions_i;

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
                "CREATE TABLE Transactions(id INTEGER, country VARCHAR, state VARCHAR,"
                        + " amount INTEGER, trans_date DATE); "
                        + "INSERT INTO Transactions(id, country, state, amount, trans_date)"
                        + " VALUES (121, 'US', 'approved', 1000, '2018-12-18'); "
                        + "INSERT INTO Transactions(id, country, state, amount, trans_date)"
                        + " VALUES (122, 'US', 'declined', 2000, '2018-12-19'); "
                        + "INSERT INTO Transactions(id, country, state, amount, trans_date)"
                        + " VALUES (123, 'US', 'approved', 2000, '2019-01-01'); "
                        + "INSERT INTO Transactions(id, country, state, amount, trans_date)"
                        + " VALUES (124, 'DE', 'approved', 2000, '2019-01-07'); ")
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
                                                            "src/main/java/g1101_1200/"
                                                                    + "s1193_monthly_transactions_i/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2018-12"));
                assertThat(resultSet.getNString(2), equalTo("US"));
                assertThat(resultSet.getInt(3), equalTo(2));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.getInt(5), equalTo(3000));
                assertThat(resultSet.getInt(6), equalTo(1000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2019-01"));
                assertThat(resultSet.getNString(2), equalTo("DE"));
                assertThat(resultSet.getInt(3), equalTo(1));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.getInt(5), equalTo(2000));
                assertThat(resultSet.getInt(6), equalTo(2000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2019-01"));
                assertThat(resultSet.getNString(2), equalTo("US"));
                assertThat(resultSet.getInt(3), equalTo(1));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.getInt(5), equalTo(2000));
                assertThat(resultSet.getInt(6), equalTo(2000));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
