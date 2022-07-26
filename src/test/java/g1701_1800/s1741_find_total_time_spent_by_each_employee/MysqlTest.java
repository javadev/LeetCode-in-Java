package g1701_1800.s1741_find_total_time_spent_by_each_employee;

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
                "CREATE TABLE Employees(emp_id INTEGER, event_day DATE, in_time INTEGER, out_time INTEGER); "
                        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
                        + " VALUES (1, '2020-11-28', 4, 32); "
                        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
                        + " VALUES (1, '2020-11-28', 55, 200); "
                        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
                        + " VALUES (1, '2020-12-03', 1, 42); "
                        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
                        + " VALUES (2, '2020-11-28', 3, 33); "
                        + "INSERT INTO Employees(emp_id, event_day, in_time, out_time) "
                        + " VALUES (2, '2020-12-09', 47, 74); ")
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
                                                            "src/main/java/g1701_1800/s1741_find_total_time_"
                                                                    + "spent_by_each_employee/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-11-28"));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.getInt(3), equalTo(173));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-11-28"));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.getInt(3), equalTo(30));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-12-03"));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.getInt(3), equalTo(41));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-12-09"));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.getInt(3), equalTo(27));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
