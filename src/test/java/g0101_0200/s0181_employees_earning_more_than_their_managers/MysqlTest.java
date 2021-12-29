package g0101_0200.s0181_employees_earning_more_than_their_managers;

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
                "CREATE TABLE Employee(id INTEGER PRIMARY KEY, name VARCHAR,"
                        + " salary INTEGER, managerId INTEGER); "
                        + "INSERT INTO Employee(id, name, salary, managerId) VALUES (1, 'Joe', 70000, 3); "
                        + "INSERT INTO Employee(id, name, salary, managerId) VALUES (2, 'Henry', 80000, 4); "
                        + "INSERT INTO Employee(id, name, salary, managerId) VALUES (3, 'Sam', 60000, NULL); "
                        + "INSERT INTO Employee(id, name, salary, managerId) VALUES (4, 'Max', 90000, NULL); ")
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
                                                                    + "s0181_employees_earning"
                                                                    + "_more_than_their_managers/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Joe"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
