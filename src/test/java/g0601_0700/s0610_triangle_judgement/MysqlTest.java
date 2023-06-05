package g0601_0700.s0610_triangle_judgement;

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
                "CREATE TABLE Triangle(x INTEGER, y INTEGER, z INTEGER); "
                        + "INSERT INTO Triangle(x, y, z)"
                        + " VALUES (13, 15, 30); "
                        + "INSERT INTO Triangle(x, y, z)"
                        + " VALUES (10, 20, 15); ")
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
                                                                    + "s0610_triangle_judgement"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(13));
                assertThat(resultSet.getInt(2), equalTo(15));
                assertThat(resultSet.getInt(3), equalTo(30));
                assertThat(resultSet.getNString(4), equalTo("No"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(10));
                assertThat(resultSet.getInt(2), equalTo(20));
                assertThat(resultSet.getInt(3), equalTo(15));
                assertThat(resultSet.getNString(4), equalTo("Yes"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
