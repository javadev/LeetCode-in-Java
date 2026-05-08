package g3701_3800.s3764_most_common_course_pairs;

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
                "CREATE TABLE course_completions ("
                        + " user_id INTEGER,"
                        + " course_id INTEGER,"
                        + " course_name VARCHAR(512),"
                        + " completion_date DATE,"
                        + " course_rating INTEGER,"
                        + " PRIMARY KEY (user_id, course_id)"
                        + ");"
                        + "INSERT INTO course_completions (user_id, course_id, course_name, completion_date,"
                        + " course_rating) VALUES"
                        + "(1, 101, 'Python Basics', '2024-01-05', 5),"
                        + "(1, 102, 'SQL Fundamentals', '2024-02-10', 4),"
                        + "(1, 103, 'JavaScript', '2024-03-15', 5),"
                        + "(1, 104, 'React Basics', '2024-04-20', 4),"
                        + "(1, 105, 'Node.js', '2024-05-25', 5),"
                        + "(1, 106, 'Docker', '2024-06-30', 4),"
                        + "(2, 101, 'Python Basics', '2024-01-08', 4),"
                        + "(2, 104, 'React Basics', '2024-02-14', 5),"
                        + "(2, 105, 'Node.js', '2024-03-20', 4),"
                        + "(2, 106, 'Docker', '2024-04-25', 5),"
                        + "(2, 107, 'AWS Fundamentals', '2024-05-30', 4),"
                        + "(3, 101, 'Python Basics', '2024-01-10', 3),"
                        + "(3, 102, 'SQL Fundamentals', '2024-02-12', 3),"
                        + "(3, 103, 'JavaScript', '2024-03-18', 3),"
                        + "(3, 104, 'React Basics', '2024-04-22', 2),"
                        + "(3, 105, 'Node.js', '2024-05-28', 3),"
                        + "(4, 101, 'Python Basics', '2024-01-12', 5),"
                        + "(4, 108, 'Data Science', '2024-02-16', 5),"
                        + "(4, 109, 'Machine Learning', '2024-03-22', 5);")
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
                                                                    + "s3764_most_common_course_pairs/"
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

                List<String> expectedRows =
                        Arrays.asList(
                                "Node.js|Docker|2",
                                "React Basics|Node.js|2",
                                "Docker|AWS Fundamentals|1",
                                "JavaScript|React Basics|1",
                                "Python Basics|React Basics|1",
                                "Python Basics|SQL Fundamentals|1",
                                "SQL Fundamentals|JavaScript|1");
                assertThat(actualRows, equalTo(expectedRows));
            }
        }
    }
}
