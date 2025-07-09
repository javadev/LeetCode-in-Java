package g3601_3700.s3611_find_overbooked_employees;

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
                "CREATE TABLE employees ("
                        + "    employee_id INTEGER,"
                        + "    employee_name VARCHAR(50),"
                        + "    department VARCHAR(50)"
                        + ");"
                        + "INSERT INTO employees (employee_id, employee_name, department) VALUES"
                        + "    (1, 'Alice Johnson', 'Engineering'),"
                        + "    (2, 'Bob Smith', 'Marketing'),"
                        + "    (3, 'Carol Davis', 'Sales'),"
                        + "    (4, 'David Wilson', 'Engineering'),"
                        + "    (5, 'Emma Brown', 'HR');"
                        + "CREATE TABLE meetings ("
                        + "    meeting_id INTEGER,"
                        + "    employee_id INTEGER,"
                        + "    meeting_date DATE,"
                        + "    meeting_type VARCHAR(20),"
                        + "    duration_hours DECIMAL(4,1)"
                        + ");"
                        + "INSERT INTO meetings (meeting_id, employee_id, "
                        + "meeting_date, meeting_type, duration_hours) VALUES"
                        + "    (1, 1, '2023-06-05', 'Team', 8.0),"
                        + "    (2, 1, '2023-06-06', 'Client', 6.0),"
                        + "    (3, 1, '2023-06-07', 'Training', 7.0),"
                        + "    (4, 1, '2023-06-12', 'Team', 12.0),"
                        + "    (5, 1, '2023-06-13', 'Client', 9.0),"
                        + "    (6, 2, '2023-06-05', 'Team', 15.0),"
                        + "    (7, 2, '2023-06-06', 'Client', 8.0),"
                        + "    (8, 2, '2023-06-12', 'Training', 10.0),"
                        + "    (9, 3, '2023-06-05', 'Team', 4.0),"
                        + "    (10, 3, '2023-06-06', 'Client', 3.0),"
                        + "    (11, 4, '2023-06-05', 'Team', 25.0),"
                        + "    (12, 4, '2023-06-19', 'Client', 22.0),"
                        + "    (13, 5, '2023-06-05', 'Training', 2.0);")
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
                                                            "src/main/java/g3601_3700/"
                                                                    + "s3611_find_overbooked_employees/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", "")
                                            .replace("WEEKOFYEAR", "ISO_WEEK"))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Alice Johnson"));
                assertThat(resultSet.getNString(3), equalTo("Engineering"));
                assertThat(resultSet.getNString(4), equalTo("2"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("4"));
                assertThat(resultSet.getNString(2), equalTo("David Wilson"));
                assertThat(resultSet.getNString(3), equalTo("Engineering"));
                assertThat(resultSet.getNString(4), equalTo("2"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
