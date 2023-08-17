package g1501_1600.s1587_bank_account_summary_ii;

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
                "CREATE TABLE Users(account INTEGER PRIMARY KEY, name VARCHAR); "
                        + "INSERT INTO Users(account, name) VALUES (900001, 'Alice'); "
                        + "INSERT INTO Users(account, name) VALUES (900002, 'Bob'); "
                        + "INSERT INTO Users(account, name) VALUES (900003, 'Charlie'); "
                        + "CREATE TABLE Transactions(trans_id INTEGER PRIMARY KEY,"
                        + " account INTEGER, amount INTEGER, transacted_on DATE); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (1, 900001, 7000, '2020-08-01'); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (2, 900001, 7000, '2020-09-01'); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (3, 900001, -3000, '2020-09-02'); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (4, 900002, 1000, '2020-09-12'); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (5, 900003, 6000, '2020-08-07'); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (6, 900003, 6000, '2020-09-07'); "
                        + "INSERT INTO Transactions(trans_id, account, amount, transacted_on)"
                        + " VALUES (7, 900003, -4000, '2020-09-11'); ")
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
                                                            "src/main/java/g1501_1600/s1587_bank_"
                                                                    + "account_summary_ii/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Alice"));
                assertThat(resultSet.getInt(2), equalTo(11000));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
