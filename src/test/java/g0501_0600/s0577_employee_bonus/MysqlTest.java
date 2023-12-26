package g0501_0600.s0577_employee_bonus;

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
                "CREATE TABLE Employee(empId INTEGER PRIMARY KEY, name VARCHAR(512)"
                        + ", supervisor INTEGER, salary INTEGER); "
                        + "INSERT INTO Employee(empId, name"
                        + ", supervisor, salary)"
                        + " VALUES (3, 'Brad', NULL, 4000); "
                        + "INSERT INTO Employee(empId, name"
                        + ", supervisor, salary)"
                        + " VALUES (1, 'John', 3, 1000); "
                        + "INSERT INTO Employee(empId, name"
                        + ", supervisor, salary)"
                        + " VALUES (2, 'Dan', 3, 2000); "
                        + "INSERT INTO Employee(empId, name"
                        + ", supervisor, salary)"
                        + " VALUES (4, 'Thomas', 3, 4000); "
                        + "CREATE TABLE Bonus(empId INTEGER, bonus INTEGER); "
                        + "INSERT INTO Bonus(empId, bonus)"
                        + " VALUES (2, 500); "
                        + "INSERT INTO Bonus(empId, bonus)"
                        + " VALUES (4, 2000); ")
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
                                                            "src/main/java/g0501_0600/"
                                                                    + "s0577_employee_bonus/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("John"));
                assertThat(resultSet.getNString(2), equalTo(null));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Dan"));
                assertThat(resultSet.getInt(2), equalTo(500));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Brad"));
                assertThat(resultSet.getNString(2), equalTo(null));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
