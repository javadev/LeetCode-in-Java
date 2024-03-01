package g1801_1900.s1873_calculate_special_bonus;

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
                "CREATE TABLE Employees(employee_id INTEGER PRIMARY KEY, name VARCHAR, salary INTEGER); "
                        + "INSERT INTO Employees(employee_id, name, salary)"
                        + " VALUES (2, 'Meir', 3000); "
                        + "INSERT INTO Employees(employee_id, name, salary)"
                        + " VALUES (3, 'Michael', 3800); "
                        + "INSERT INTO Employees(employee_id, name, salary)"
                        + " VALUES (7, 'Addilyn', 7400); "
                        + "INSERT INTO Employees(employee_id, name, salary)"
                        + " VALUES (8, 'Juan', 6100); "
                        + "INSERT INTO Employees(employee_id, name, salary)"
                        + " VALUES (9, 'Kannon', 7700); ")
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
                                                            "src/main/java/g1801_1900/s1873_calculat"
                                                                    + "e_special_bonus/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getInt(2), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getInt(2), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(7));
                assertThat(resultSet.getInt(2), equalTo(7400));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(8));
                assertThat(resultSet.getInt(2), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(9));
                assertThat(resultSet.getInt(2), equalTo(7700));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
