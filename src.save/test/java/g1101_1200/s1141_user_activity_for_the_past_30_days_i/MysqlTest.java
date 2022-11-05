package g1101_1200.s1141_user_activity_for_the_past_30_days_i;

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
                "CREATE TABLE activity(user_id INTEGER, session_id INTEGER"
                        + ", activity_date DATE, activity_type VARCHAR(512)); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (1, 1, ' 2019-07-20', 'open_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (1, 1, ' 2019-07-20', 'scroll_down'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (1, 1, ' 2019-07-20', 'end_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (2, 4, ' 2019-07-20', 'open_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (2, 4, ' 2019-07-21', 'send_message'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (2, 4, ' 2019-07-21', 'end_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (3, 2, ' 2019-07-21', 'open_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (3, 2, ' 2019-07-21', 'send_message'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (3, 2, ' 2019-07-21', 'end_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (4, 3, ' 2019-06-25', 'open_session'); "
                        + "INSERT INTO activity(user_id, session_id, activity_date, activity_type)"
                        + " VALUES (4, 3, ' 2019-06-25', 'end_session'); ")
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
                                                            "src/main/java/g1101_1200/s1141_user_activity_"
                                                                    + "for_the_past_30_days_i/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2019-07-20"));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2019-07-21"));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
