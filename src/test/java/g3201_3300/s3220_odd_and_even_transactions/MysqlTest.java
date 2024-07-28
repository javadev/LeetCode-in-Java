package g3201_3300.s3220_odd_and_even_transactions;

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
                "CREATE TABLE transactions(transaction_id INTEGER PRIMARY KEY, amount INTEGER"
                        + ", transaction_date DATE); "
                        + "INSERT INTO transactions(transaction_id, amount, transaction_date)"
                        + " VALUES (1, 150, '2024-07-01'); "
                        + "INSERT INTO transactions(transaction_id, amount, transaction_date)"
                        + " VALUES (2, 200, '2024-07-01'); "
                        + "INSERT INTO transactions(transaction_id, amount, transaction_date)"
                        + " VALUES (3, 75, '2024-07-01'); "
                        + "INSERT INTO transactions(transaction_id, amount, transaction_date)"
                        + " VALUES (4, 300, '2024-07-02'); "
                        + "INSERT INTO transactions(transaction_id, amount, transaction_date)"
                        + " VALUES (5, 50, '2024-07-02'); "
                        + "INSERT INTO transactions(transaction_id, amount, transaction_date)"
                        + " VALUES (6, 120, '2024-07-03'); "
)
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
                                                            "src/main/java/g3201_3300/"
                                                                    + "s3220_odd_and_even_transactions/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2024-07-01"));
                assertThat(resultSet.getNString(2), equalTo("75"));
                assertThat(resultSet.getNString(3), equalTo("350"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2024-07-02"));
                assertThat(resultSet.getNString(2), equalTo("0"));
                assertThat(resultSet.getNString(3), equalTo("350"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2024-07-03"));
                assertThat(resultSet.getNString(2), equalTo("0"));
                assertThat(resultSet.getNString(3), equalTo("120"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
