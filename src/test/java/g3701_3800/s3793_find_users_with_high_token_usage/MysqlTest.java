package g3701_3800.s3793_find_users_with_high_token_usage;

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
                "CREATE TABLE prompts ("
                        + " user_id INTEGER,"
                        + " prompt VARCHAR(512),"
                        + " tokens INTEGER,"
                        + " PRIMARY KEY (user_id, prompt)"
                        + ");"
                        + "INSERT INTO prompts (user_id, prompt, tokens) VALUES"
                        + "(1, 'Write a blog outline', 120),"
                        + "(1, 'Generate SQL query', 80),"
                        + "(1, 'Summarize an article', 200),"
                        + "(2, 'Create resume bullet', 60),"
                        + "(2, 'Improve LinkedIn bio', 70),"
                        + "(3, 'Explain neural networks', 300),"
                        + "(3, 'Generate interview Q&A', 250),"
                        + "(3, 'Write cover letter', 180),"
                        + "(3, 'Optimize Python code', 220);")
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
                                                            "src/main/java/g3701_3800/"
                                                                    + "s3793_find_users_with_high_token_usage/"
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

                List<String> expectedRows = Arrays.asList("3|4|237.5", "1|3|133.33");
                assertThat(actualRows, equalTo(expectedRows));
            }
        }
    }
}
