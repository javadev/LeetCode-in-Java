package g0601_0700.s0620_not_boring_movies;

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
                "CREATE TABLE cinema(id INTEGER PRIMARY KEY, movie VARCHAR(512)"
                        + ", description VARCHAR(512), rating FLOAT); "
                        + "INSERT INTO cinema(id, movie, description, rating)"
                        + " VALUES (1, 'War', 'great 3D', 8.9); "
                        + "INSERT INTO cinema(id, movie, description, rating)"
                        + " VALUES (2, 'Science', 'fiction', 8.5); "
                        + "INSERT INTO cinema(id, movie, description, rating)"
                        + " VALUES (3, 'irish', 'boring', 6.2); "
                        + "INSERT INTO cinema(id, movie, description, rating)"
                        + " VALUES (4, 'Ice song', 'Fantacy', 8.6);"
                        + "INSERT INTO cinema(id, movie, description, rating)"
                        + " VALUES (5, 'House card', 'Interesting', 9.1);")
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
                                                            "src/main/java/g0601_0700/"
                                                                    + "s0620_not_boring_movies/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(5));
                assertThat(resultSet.getNString(2), equalTo("House card"));
                assertThat(resultSet.getNString(3), equalTo("Interesting"));
                assertThat(resultSet.getNString(4), equalTo("9.1"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("War"));
                assertThat(resultSet.getNString(3), equalTo("great 3D"));
                assertThat(resultSet.getNString(4), equalTo("8.9"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
