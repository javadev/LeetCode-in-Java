package g1001_1100.s1075_project_employees_i;

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
                "CREATE TABLE Project(project_id INTEGER, employee_id INTEGER); "
                        + "INSERT INTO Project(project_id, employee_id)"
                        + " VALUES (1, 1); "
                        + "INSERT INTO Project(project_id, employee_id)"
                        + " VALUES (1, 2); "
                        + "INSERT INTO Project(project_id, employee_id)"
                        + " VALUES (1, 3); "
                        + "INSERT INTO Project(project_id, employee_id)"
                        + " VALUES (2, 1); "
                        + "INSERT INTO Project(project_id, employee_id)"
                        + " VALUES (2, 4); "
                        + "CREATE TABLE Employee(employee_id INTEGER, name VARCHAR, experience_years INTEGER); "
                        + "INSERT INTO Employee(employee_id, name, experience_years)"
                        + " VALUES (1, 'Khaled', 3); "
                        + "INSERT INTO Employee(employee_id, name, experience_years)"
                        + " VALUES (2, 'Ali', 2); "
                        + "INSERT INTO Employee(employee_id, name, experience_years)"
                        + " VALUES (3, 'John', 1); "
                        + "INSERT INTO Employee(employee_id, name, experience_years)"
                        + " VALUES (4, 'Doe', 2); ")
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
                                                            "src/main/java/g1001_1100/"
                                                                    + "s1075_project_employees_i/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getDouble(2), equalTo(2.00));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
