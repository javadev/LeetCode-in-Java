package g1701_1800.s1789_primary_department_for_each_employee;

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
                "CREATE TABLE Employee(employee_id INTEGER, department_id INTEGER, "
                        + "primary_flag VARCHAR); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (1, 1, 'N'); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (2, 1, 'Y'); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (2, 2, 'N'); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (3, 3, 'N'); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (4, 2, 'N'); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (4, 3, 'Y'); "
                        + "INSERT INTO Employee(employee_id, department_id, primary_flag) "
                        + "VALUES (4, 4, 'N'); ")
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
                                                            "src/main/java/g1701_1800/s1789_primary"
                                                                    + "_department_for_each_employee/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(4));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
