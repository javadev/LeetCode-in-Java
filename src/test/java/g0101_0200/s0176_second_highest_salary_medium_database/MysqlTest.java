package g0101_0200.s0176_second_highest_salary_medium_database;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Collectors;
import org.junit.Rule;
import org.junit.Test;
import org.zapodot.junit.db.EmbeddedDatabaseRule;
import org.zapodot.junit.db.common.CompatibilityMode;

public class MysqlTest {
    @Rule
    public final EmbeddedDatabaseRule embeddedDatabaseRule =
            EmbeddedDatabaseRule.builder()
                    .withMode(CompatibilityMode.MySQL)
                    .withInitialSql(
                            "CREATE TABLE Employee(id INTEGER PRIMARY KEY, salary INTEGER); "
                                    + "INSERT INTO Employee(id, salary) "
                                    + "VALUES (1, 100); "
                                    + "INSERT INTO Employee(id, salary) "
                                    + "VALUES (2, 200); "
                                    + "INSERT INTO Employee(id, salary) "
                                    + "VALUES (3, 300); ")
                    .build();

    @Test
    public void testScript() throws SQLException, FileNotFoundException {
        try (final Connection connection =
                DriverManager.getConnection(embeddedDatabaseRule.getConnectionJdbcUrl())) {
            try (final Statement statement = connection.createStatement();
                    final ResultSet resultSet =
                            statement.executeQuery(
                                    new BufferedReader(
                                                    new FileReader(
                                                            "src/main/java/g0101_0200/"
                                                                    + "s0176_second_highest_salary_medium_database/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(200));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
