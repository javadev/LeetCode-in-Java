package g1901_2000.s1978_employees_whose_manager_left_the_company;

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
                "CREATE TABLE Employees(employee_id INTEGER, name VARCHAR, manager_id INTEGER, salary INTEGER); "
                        + "INSERT INTO Employees(employee_id, name, manager_id, salary)"
                        + " VALUES (3, 'Mila', 9, 60301); "
                        + "INSERT INTO Employees(employee_id, name, manager_id, salary)"
                        + " VALUES (12, 'Antonella', null, 31000); "
                        + "INSERT INTO Employees(employee_id, name, manager_id, salary)"
                        + " VALUES (13, 'Emery', null, 67084); "
                        + "INSERT INTO Employees(employee_id, name, manager_id, salary)"
                        + " VALUES (1, 'Kalel', 11, 21241); "
                        + "INSERT INTO Employees(employee_id, name, manager_id, salary)"
                        + " VALUES (9, 'Mikaela', null, 50937); "
                        + "INSERT INTO Employees(employee_id, name, manager_id, salary)"
                        + " VALUES (11, 'Joziah', 6, 28485); ")
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
                                                            "src/main/java/g1901_2000/s1978_employees_"
                                                                    + "whose_manager_left_the_company/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(11));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
