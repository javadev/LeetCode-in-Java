package g0101_0200.s0185_department_top_three_salaries;

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
import org.zapodot.junit.db.common.Engine;

@EmbeddedDatabaseTest(
        engine = Engine.H2,
        compatibilityMode = CompatibilityMode.MySQL,
        initialSqls =
                "CREATE TABLE Employee(id INTEGER PRIMARY KEY, name VARCHAR, salary INTEGER, departmentId INTEGER); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (1, 'Joe', 85000, 1); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (2, 'Henry', 80000, 2); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (3, 'Sam', 60000, 2); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (4, 'Max', 90000, 1); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (5, 'Janet', 69000, 1); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (6, 'Randy', 85000, 1); "
                        + "INSERT INTO Employee(id, name, salary, departmentId) VALUES (7, 'Will', 70000, 1); "
                        + "CREATE TABLE Department(id INTEGER PRIMARY KEY, name VARCHAR); "
                        + "INSERT INTO Department(id, name) VALUES (1, 'IT'); "
                        + "INSERT INTO Department(id, name) VALUES (2, 'Sales'); ")
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
                                                            "src/main/java/g0101_0200/"
                                                                    + "s0185_department_top"
                                                                    + "_three_salaries/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("IT"));
                assertThat(resultSet.getNString(2), equalTo("Max"));
                assertThat(resultSet.getInt(3), equalTo(90000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("IT"));
                assertThat(resultSet.getNString(2), equalTo("Joe"));
                assertThat(resultSet.getInt(3), equalTo(85000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("IT"));
                assertThat(resultSet.getNString(2), equalTo("Randy"));
                assertThat(resultSet.getInt(3), equalTo(85000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("IT"));
                assertThat(resultSet.getNString(2), equalTo("Will"));
                assertThat(resultSet.getInt(3), equalTo(70000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Sales"));
                assertThat(resultSet.getNString(2), equalTo("Henry"));
                assertThat(resultSet.getInt(3), equalTo(80000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Sales"));
                assertThat(resultSet.getNString(2), equalTo("Sam"));
                assertThat(resultSet.getInt(3), equalTo(60000));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
