package g0601_0700.s0602_friend_requests_ii_who_has_the_most_friends;

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
                "CREATE TABLE RequestAccepted(requester_id INTEGER, accepter_id INTEGER, accept_date DATETIME); "
                        + "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)"
                        + " VALUES (1, 2, '2016-06-03'); "
                        + "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)"
                        + " VALUES (1, 3, '2016-06-08'); "
                        + "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)"
                        + " VALUES (2, 3, '2016-06-08'); "
                        + "INSERT INTO RequestAccepted(requester_id, accepter_id, accept_date)"
                        + " VALUES (3, 4, '2016-06-09'); ")
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
                                                            "src/main/java/g0601_0700/"
                                                                    + "s0602_friend_requests"
                                                                    + "_ii_who_has_the_most_friends"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
