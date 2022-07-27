package g1801_1900.s1890_the_latest_login_in_2020;

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
                "CREATE TABLE Logins(user_id INTEGER, time_stamp DATETIME); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (6, '2020-06-30 15:06:07'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (6, '2021-04-21 14:06:06'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (6, '2019-03-07 00:18:15'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (8, '2020-02-01 05:10:53'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (8, '2020-12-30 00:46:50'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (2, '2020-01-16 02:49:50'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (2, '2019-08-25 07:59:08'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (14, '2019-07-14 09:00:00'); "
                        + "INSERT INTO Logins(user_id, time_stamp)"
                        + " VALUES (14, '2021-01-06 11:59:59'); ")
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
                                                            "src/main/java/g1801_1900/s1890_the_latest_"
                                                                    + "login_in_2020/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getNString(2), equalTo("2020-01-16 02:49:50"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.getNString(2), equalTo("2020-06-30 15:06:07"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(8));
                assertThat(resultSet.getNString(2), equalTo("2020-12-30 00:46:50"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
