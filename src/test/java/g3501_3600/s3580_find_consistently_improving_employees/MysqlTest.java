package g3501_3600.s3580_find_consistently_improving_employees;

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
                "CREATE TABLE employees(employee_id INTEGER, name VARCHAR(255)); "
                        + "INSERT INTO employees (employee_id, name) VALUES"
                        + "  (1, 'Alice Johnson'),"
                        + "  (2, 'Bob Smith'),"
                        + "  (3, 'Carol Davis'),"
                        + "  (4, 'David Wilson'),"
                        + "  (5, 'Emma Brown');"
                        + "CREATE TABLE performance_reviews(review_id INTEGER, employee_id INTEGER"
                        + ", review_date DATE, rating INTEGER); "
                        + "INSERT INTO performance_reviews (review_id, employee_id, review_date, rating) VALUES"
                        + "  (1, 1, '2023-01-15', 2),"
                        + "  (2, 1, '2023-04-15', 3),"
                        + "  (3, 1, '2023-07-15', 4),"
                        + "  (4, 1, '2023-10-15', 5),"
                        + "  (5, 2, '2023-02-01', 3),"
                        + "  (6, 2, '2023-05-01', 2),"
                        + "  (7, 2, '2023-08-01', 4),"
                        + "  (8, 2, '2023-11-01', 5),"
                        + "  (9, 3, '2023-03-10', 1),"
                        + "  (10, 3, '2023-06-10', 2),"
                        + "  (11, 3, '2023-09-10', 3),"
                        + "  (12, 3, '2023-12-10', 4),"
                        + "  (13, 4, '2023-01-20', 4),"
                        + "  (14, 4, '2023-04-20', 4),"
                        + "  (15, 4, '2023-07-20', 4),"
                        + "  (16, 5, '2023-02-15', 3),"
                        + "  (17, 5, '2023-05-15', 2);")
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
                                                            "src/main/java/g3501_3600/"
                                                                    + "s3580_find_consistently_improving_employees/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("Bob Smith"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Alice Johnson"));
                assertThat(resultSet.getNString(3), equalTo("2"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("3"));
                assertThat(resultSet.getNString(2), equalTo("Alice Johnson"));
                assertThat(resultSet.getNString(3), equalTo("2"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
