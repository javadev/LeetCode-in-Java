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
                checkRow(resultSet, new String[] {"1", "Alice", "1", "9", "84500"});
                checkRow(resultSet, new String[] {"3", "Charlie", "2", "4", "41500"});
                checkRow(resultSet, new String[] {"2", "Bob", "2", "3", "31000"});
                checkRow(resultSet, new String[] {"6", "Frank", "3", "2", "23000"});
                checkRow(resultSet, new String[] {"4", "David", "3", "1", "13500"});
                checkRow(resultSet, new String[] {"7", "Grace", "3", "0", "8500"});
                checkRow(resultSet, new String[] {"5", "Eva", "3", "0", "7500"});
                checkRow(resultSet, new String[] {"9", "Ivy", "4", "0", "7000"});
                checkRow(resultSet, new String[] {"10", "Judy", "4", "0", "7000"});
                checkRow(resultSet, new String[] {"8", "Hank", "4", "0", "6000"});
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }

    private void checkRow(ResultSet resultSet, String[] values) throws SQLException {
        assertThat(resultSet.next(), equalTo(true));
        assertThat(resultSet.getNString(1), equalTo(values[0]));
        assertThat(resultSet.getNString(2), equalTo(values[1]));
        assertThat(resultSet.getNString(3), equalTo(values[2]));
        assertThat(resultSet.getNString(4), equalTo(values[3]));
        assertThat(resultSet.getNString(5), equalTo(values[4]));
    }
}
