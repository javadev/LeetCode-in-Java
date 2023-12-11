package g1701_1800.s1731_the_number_of_employees_which_report_to_each_employee;

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
                "CREATE TABLE Employees(employee_id INTEGER, name VARCHAR, "
                        + "reports_to INTEGER, age INTEGER); "
                        + "INSERT INTO Employees(employee_id, name, reports_to, age) "
                        + "VALUES (9, 'Hercy', null, 43); "
                        + "INSERT INTO Employees(employee_id, name, reports_to, age) "
                        + "VALUES (6, 'Alice', 9, 41); "
                        + "INSERT INTO Employees(employee_id, name, reports_to, age) "
                        + "VALUES (4, 'Bob', 9, 36); "
                        + "INSERT INTO Employees(employee_id, name, reports_to, age) "
                        + "VALUES (2, 'Winston', null, 37); ")
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
                                                            "src/main/java/g1701_1800/s1731_the_number_of"
                                                                    + "_employees_which_report_to_each_employee/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(9));
                assertThat(resultSet.getNString(2), equalTo("Hercy"));
                assertThat(resultSet.getInt(3), equalTo(2));
                assertThat(resultSet.getInt(4), equalTo(39));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
