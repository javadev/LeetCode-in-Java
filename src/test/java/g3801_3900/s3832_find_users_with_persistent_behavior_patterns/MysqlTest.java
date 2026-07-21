package g3801_3900.s3832_find_users_with_persistent_behavior_patterns;

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
                "CREATE TABLE activity ("
                        + " user_id INTEGER,"
                        + " action_date DATE,"
                        + " action VARCHAR(32),"
                        + " PRIMARY KEY (user_id, action_date, action)"
                        + ");"
                        + "INSERT INTO activity (user_id, action_date, action) VALUES"
                        + "(1, '2024-01-01', 'login'),"
                        + "(1, '2024-01-02', 'login'),"
                        + "(1, '2024-01-03', 'login'),"
                        + "(1, '2024-01-04', 'login'),"
                        + "(1, '2024-01-05', 'login'),"
                        + "(1, '2024-01-06', 'logout'),"
                        + "(2, '2024-01-01', 'click'),"
                        + "(2, '2024-01-02', 'click'),"
                        + "(2, '2024-01-03', 'click'),"
                        + "(2, '2024-01-04', 'click'),"
                        + "(3, '2024-01-01', 'view'),"
                        + "(3, '2024-01-02', 'view'),"
                        + "(3, '2024-01-03', 'view'),"
                        + "(3, '2024-01-04', 'view'),"
                        + "(3, '2024-01-05', 'view'),"
                        + "(3, '2024-01-06', 'view'),"
                        + "(3, '2024-01-07', 'view');")
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
                                                                    + "s3832_find_users_with_persistent_"
                                                                    + "behavior_patterns/script.sql"))
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
                                    + resultSet.getString(3)
                                    + "|"
                                    + resultSet.getString(4)
                                    + "|"
                                    + resultSet.getString(5));
                }

                List<String> expectedRows =
                        Arrays.asList(
                                "3|view|7|2024-01-01|2024-01-07",
                                "1|login|5|2024-01-01|2024-01-05");
                assertThat(actualRows, equalTo(expectedRows));
            }
        }
    }
}
