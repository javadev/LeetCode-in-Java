package g3401_3500.s3482_analyze_organization_hierarchy;

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
                "    CREATE TABLE Employees ("
                        + "    employee_id INT,"
                        + "    employee_name VARCHAR(50),"
                        + "    manager_id INT,"
                        + "    salary INT,"
                        + "    department VARCHAR(100)"
                        + ");"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(1, 'Alice', NULL, 12000, 'Executive');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(2, 'Bob', 1, 10000, 'Sales');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(3, 'Charlie', 1, 10000, 'Engineering');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(4, 'David', 2, 7500, 'Sales');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(5, 'Eva', 2, 7500, 'Sales');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(6, 'Frank', 3, 9000, 'Engineering');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(7, 'Grace', 3, 8500, 'Engineering');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(8, 'Hank', 4, 6000, 'Sales');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(9, 'Ivy', 6, 7000, 'Engineering');"
                        + "insert into Employees (employee_id, employee_name, manager_id, salary, department) values "
                        + "(10, 'Judy', 6, 7000, 'Engineering');")
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
                                                            "src/main/java/g3401_3500/"
                                                                    + "s3482_analyze_organization_hierarchy/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Alice"));
                assertThat(resultSet.getNString(3), equalTo("1"));
                assertThat(resultSet.getNString(4), equalTo("9"));
                assertThat(resultSet.getNString(5), equalTo("84500"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("3"));
                assertThat(resultSet.getNString(2), equalTo("Charlie"));
                assertThat(resultSet.getNString(3), equalTo("2"));
                assertThat(resultSet.getNString(4), equalTo("4"));
                assertThat(resultSet.getNString(5), equalTo("41500"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("Bob"));
                assertThat(resultSet.getNString(3), equalTo("2"));
                assertThat(resultSet.getNString(4), equalTo("3"));
                assertThat(resultSet.getNString(5), equalTo("31000"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("6"));
                assertThat(resultSet.getNString(2), equalTo("Frank"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.getNString(4), equalTo("2"));
                assertThat(resultSet.getNString(5), equalTo("23000"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("4"));
                assertThat(resultSet.getNString(2), equalTo("David"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.getNString(4), equalTo("1"));
                assertThat(resultSet.getNString(5), equalTo("13500"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("7"));
                assertThat(resultSet.getNString(2), equalTo("Grace"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.getNString(4), equalTo("0"));
                assertThat(resultSet.getNString(5), equalTo("8500"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("5"));
                assertThat(resultSet.getNString(2), equalTo("Eva"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.getNString(4), equalTo("0"));
                assertThat(resultSet.getNString(5), equalTo("7500"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("9"));
                assertThat(resultSet.getNString(2), equalTo("Ivy"));
                assertThat(resultSet.getNString(3), equalTo("4"));
                assertThat(resultSet.getNString(4), equalTo("0"));
                assertThat(resultSet.getNString(5), equalTo("7000"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("10"));
                assertThat(resultSet.getNString(2), equalTo("Judy"));
                assertThat(resultSet.getNString(3), equalTo("4"));
                assertThat(resultSet.getNString(4), equalTo("0"));
                assertThat(resultSet.getNString(5), equalTo("7000"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("8"));
                assertThat(resultSet.getNString(2), equalTo("Hank"));
                assertThat(resultSet.getNString(3), equalTo("4"));
                assertThat(resultSet.getNString(4), equalTo("0"));
                assertThat(resultSet.getNString(5), equalTo("6000"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
