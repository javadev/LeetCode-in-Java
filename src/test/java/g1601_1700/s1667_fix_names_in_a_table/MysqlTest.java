package g1601_1700.s1667_fix_names_in_a_table;

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
                "CREATE TABLE Users(user_id INTEGER PRIMARY KEY, name VARCHAR); "
                        + "INSERT INTO Users(user_id, name) VALUES (1, 'aLice'); "
                        + "INSERT INTO Users(user_id, name) VALUES (2, 'bOB'); ")
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
                                                            "src/main/java/g1601_1700/s1667_fix_"
                                                                    + "names_in_a_table/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(2), equalTo("Alice"));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(2), equalTo("Bob"));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
