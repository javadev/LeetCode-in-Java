package g1701_1800.s1729_find_followers_count;

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
                "CREATE TABLE Followers(user_id INTEGER, follower_id INTEGER); "
                        + "INSERT INTO Followers(user_id, follower_id) "
                        + " VALUES (0, 1); "
                        + "INSERT INTO Followers(user_id, follower_id) "
                        + " VALUES (1, 0); "
                        + "INSERT INTO Followers(user_id, follower_id) "
                        + " VALUES (2, 0); "
                        + "INSERT INTO Followers(user_id, follower_id) "
                        + " VALUES (2, 1); ")
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
                                                            "src/main/java/g1701_1800/s1729_find_fol"
                                                                    + "lowers_count/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(0));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
