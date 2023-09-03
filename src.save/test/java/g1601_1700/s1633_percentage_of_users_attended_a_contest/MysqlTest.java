package g1601_1700.s1633_percentage_of_users_attended_a_contest;

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
                "CREATE TABLE Users(user_id INTEGER, user_name VARCHAR); "
                        + "INSERT INTO Users(user_id, user_name) VALUES (6, 'Alice'); "
                        + "INSERT INTO Users(user_id, user_name) VALUES (2, 'Bob'); "
                        + "INSERT INTO Users(user_id, user_name) VALUES (7, 'Alex'); "
                        + "CREATE TABLE Register(contest_id INTEGER, user_id INTEGER); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (215, 6); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (209, 2); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (208, 2); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (210, 6); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (208, 6); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (209, 7); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (209, 6); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (215, 7); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (208, 7); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (210, 2); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (207, 2); "
                        + "INSERT INTO Register (contest_id, user_id) VALUES (210, 7); ")
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
                                                            "src/main/java/g1601_1700/s1633_percentage"
                                                                    + "_of_users_attended_a_contest/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(208));
                assertThat(resultSet.getDouble(2), equalTo(100.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(209));
                assertThat(resultSet.getDouble(2), equalTo(100.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(210));
                assertThat(resultSet.getDouble(2), equalTo(100.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(207));
                assertThat(resultSet.getDouble(2), equalTo(0.0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(215));
                assertThat(resultSet.getDouble(2), equalTo(0.0));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
