package g1901_2000.s1934_confirmation_rate;

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
                "CREATE TABLE Signups(user_id INTEGER, time_stamp DATETIME); "
                        + "INSERT INTO Signups(user_id, time_stamp)"
                        + " VALUES (3, '2020-03-21 10:16:13'); "
                        + "INSERT INTO Signups(user_id, time_stamp)"
                        + " VALUES (7, '2020-01-04 13:57:59'); "
                        + "INSERT INTO Signups(user_id, time_stamp)"
                        + " VALUES (2, '2020-07-29 23:09:44'); "
                        + "INSERT INTO Signups(user_id, time_stamp)"
                        + " VALUES (6, '2020-12-09 10:39:37'); "
                        + "CREATE TABLE Confirmations(user_id INTEGER, time_stamp DATETIME, action VARCHAR); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (3, '2021-01-06 03:30:46', 'timeout'); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (3, '2021-07-14 14:00:00', 'timeout'); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (7, '2021-06-12 11:57:29', 'confirmed'); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (7, '2021-06-13 12:58:28', 'confirmed'); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (7, '2021-06-14 13:59:27', 'confirmed'); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (2, '2021-01-22 00:00:00', 'confirmed'); "
                        + "INSERT INTO Confirmations(user_id, time_stamp, action)"
                        + " VALUES (2, '2021-02-28 23:59:59', 'timeout'); ")
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
                                                            "src/main/java/g1901_2000/s1934_"
                                                                    + "confirmation_rate/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getDouble(2), equalTo(0.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(7));
                assertThat(resultSet.getDouble(2), equalTo(1.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getDouble(2), equalTo(0.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.getDouble(2), equalTo(0.0));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
