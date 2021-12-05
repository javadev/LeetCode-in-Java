package g0101_0200.s0178_rank_scores_medium_database;

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
                            "CREATE TABLE Scores(id INTEGER PRIMARY KEY, score decimal); "
                                    + "INSERT INTO Scores(id, score) VALUES (1, 3.50); "
                                    + "INSERT INTO Scores(id, score) VALUES (2, 3.65); "
                                    + "INSERT INTO Scores(id, score) VALUES (3, 4.00); "
                                    + "INSERT INTO Scores(id, score) VALUES (4, 3.85); "
                                    + "INSERT INTO Scores(id, score) VALUES (5, 4.00); "
                                    + "INSERT INTO Scores(id, score) VALUES (6, 3.65); ")
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
                                                                    + "s0178_rank_scores_medium_database/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(4.0));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(4.0));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(3.85));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(3.65));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(3.65));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(3.50));
                assertThat(resultSet.getInt(2), equalTo(4));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
