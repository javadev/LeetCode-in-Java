package g0501_0600.s0570_managers_with_at_least_5_direct_reports;

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
                "CREATE TABLE Employee(id INTEGER PRIMARY KEY, name VARCHAR(512)"
                        + ", department VARCHAR(512), managerId INTEGER); "
                        + "INSERT INTO Employee(id, name"
                        + ", department, managerId)"
                        + " VALUES (101, 'John', 'A', NULL); "
                        + "INSERT INTO Employee(id, name"
                        + ", department, managerId)"
                        + " VALUES (102, 'Dan', 'A', 101); "
                        + "INSERT INTO Employee(id, name"
                        + ", department, managerId)"
                        + " VALUES (103, 'James', 'A', 101); "
                        + "INSERT INTO Employee(id, name"
                        + ", department, managerId)"
                        + " VALUES (104, 'Amy', 'A', 101); "
                        + "INSERT INTO Employee(id, name"
                        + ", department, managerId)"
                        + " VALUES (105, 'Anne', 'A', 101); "
                        + "INSERT INTO Employee(id, name"
                        + ", department, managerId)"
                        + " VALUES (106, 'Ron', 'B', 101); ")
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
                                                                    + "s0570_managers_with_at_least_5_direct_reports"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("John"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
