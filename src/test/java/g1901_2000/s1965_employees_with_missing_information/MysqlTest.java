package g1901_2000.s1965_employees_with_missing_information;

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
                "CREATE TABLE Employees(employee_id INTEGER, name VARCHAR); "
                        + "INSERT INTO Employees(employee_id, name)"
                        + " VALUES (2, 'Crew'); "
                        + "INSERT INTO Employees(employee_id, name)"
                        + " VALUES (4, 'Haven'); "
                        + "INSERT INTO Employees(employee_id, name)"
                        + " VALUES (5, 'Kristian'); "
                        + "CREATE TABLE Salaries(employee_id INTEGER, salary INTEGER); "
                        + "INSERT INTO Salaries(employee_id, salary)"
                        + " VALUES (5, 76071); "
                        + "INSERT INTO Salaries(employee_id, salary)"
                        + " VALUES (1, 22517); "
                        + "INSERT INTO Salaries(employee_id, salary)"
                        + " VALUES (4, 63539); ")
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
                                                            "src/main/java/g1901_2000/s1965_employees_"
                                                                    + "with_missing_information/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
