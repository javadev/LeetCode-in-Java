package g3801_3900.s3808_find_emotionally_consistent_users;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.zapodot.junit.db.annotations.EmbeddedDatabase;
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest;
import org.zapodot.junit.db.common.CompatibilityMode;

@EmbeddedDatabaseTest(
        compatibilityMode = CompatibilityMode.MySQL,
        initialSqls =
                "CREATE TABLE reactions ("
                        + " user_id INTEGER,"
                        + " content_id INTEGER,"
                        + " reaction VARCHAR(32)"
                        + ");"
                        + "INSERT INTO reactions (user_id, content_id, reaction) VALUES"
                        + "(1, 1, 'like'),"
                        + "(1, 2, 'like'),"
                        + "(1, 3, 'like'),"
                        + "(1, 4, 'like'),"
                        + "(1, 5, 'like'),"
                        + "(2, 1, 'like'),"
                        + "(2, 2, 'like'),"
                        + "(2, 3, 'like'),"
                        + "(2, 4, 'like'),"
                        + "(2, 5, 'like'),"
                        + "(3, 1, 'like'),"
                        + "(3, 2, 'like'),"
                        + "(3, 3, 'like'),"
                        + "(3, 4, 'like'),"
                        + "(4, 1, 'like'),"
                        + "(4, 2, 'like'),"
                        + "(4, 3, 'love'),"
                        + "(4, 4, 'love'),"
                        + "(4, 5, 'sad');")
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
                                                            "src/main/java/g3801_3900/"
                                                                    + "s3808_find_emotionally_consistent_users/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                List<String> actualRows = new ArrayList<>();
                while (resultSet.next()) {
                    actualRows.add(
                            resultSet.getString(1)
                                    + "|"
                                    + resultSet.getString(2)
                                    + "|"
                                    + resultSet.getString(3));
                }

                List<String> expectedRows = Arrays.asList("1|like|1", "2|like|1");
                assertThat(actualRows, equalTo(expectedRows));
            }
        }
    }
}
