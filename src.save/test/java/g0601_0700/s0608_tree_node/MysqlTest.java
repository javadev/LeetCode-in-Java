package g0601_0700.s0608_tree_node;

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
                "CREATE TABLE Tree(id INTEGER PRIMARY KEY, p_id INTEGER); "
                        + "INSERT INTO Tree(id, p_id) VALUES (1, NULL); "
                        + "INSERT INTO Tree(id, p_id) VALUES (2, 1); "
                        + "INSERT INTO Tree(id, p_id) VALUES (3, 1); "
                        + "INSERT INTO Tree(id, p_id) VALUES (4, 2); "
                        + "INSERT INTO Tree(id, p_id) VALUES (5, 2); ")
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
                                                                    + "s0608_tree_node"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("Root"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getNString(2), equalTo("Inner"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getNString(2), equalTo("Leaf"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(4));
                assertThat(resultSet.getNString(2), equalTo("Leaf"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(5));
                assertThat(resultSet.getNString(2), equalTo("Leaf"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
