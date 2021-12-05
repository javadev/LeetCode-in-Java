package g0101_0200.s0180_consecutive_numbers;

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.zapodot.junit.db.EmbeddedDatabaseExtension;
import org.zapodot.junit.db.common.CompatibilityMode;

class MysqlTest {
    @RegisterExtension
    static EmbeddedDatabaseExtension embeddedDatabaseExtension =
            EmbeddedDatabaseExtension.Builder.h2()
                    .withMode(CompatibilityMode.MySQL)
                    .withInitialSql(
                            "CREATE TABLE Logs(id INTEGER PRIMARY KEY, num INTEGER); "
                                    + "INSERT INTO Logs(id, num) VALUES (1, 1); "
                                    + "INSERT INTO Logs(id, num) VALUES (2, 1); "
                                    + "INSERT INTO Logs(id, num) VALUES (3, 1); "
                                    + "INSERT INTO Logs(id, num) VALUES (4, 2); "
                                    + "INSERT INTO Logs(id, num) VALUES (5, 1); "
                                    + "INSERT INTO Logs(id, num) VALUES (6, 2); "
                                    + "INSERT INTO Logs(id, num) VALUES (7, 2); ")
                    .build();

    @Test
    void testScript() throws SQLException, FileNotFoundException {
        try (final Connection connection =
                DriverManager.getConnection(embeddedDatabaseExtension.getConnectionJdbcUrl())) {
            try (final Statement statement = connection.createStatement();
                    final ResultSet resultSet =
                            statement.executeQuery(
                                    new BufferedReader(
                                                    new FileReader(
                                                            "src/main/java/g0101_0200/"
                                                                    + "s0180_consecutive_numbers/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
