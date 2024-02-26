package g0101_0200.s0196_delete_duplicate_emails;

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
                "CREATE TABLE Person(id INTEGER PRIMARY KEY, email VARCHAR); "
                        + "INSERT INTO Person(id, email) VALUES (1, 'john@example.com'); "
                        + "INSERT INTO Person(id, email) VALUES (2, 'bob@example.com'); "
                        + "INSERT INTO Person(id, email) VALUES (3, 'john@example.com'); ")
class MysqlTest {
    @Test
    void testScript(@EmbeddedDatabase DataSource dataSource)
            throws SQLException, FileNotFoundException {
        try (final Connection connection = dataSource.getConnection()) {
            try (final Statement statement = connection.createStatement()) {
                statement.executeUpdate(
                        new BufferedReader(
                                        new FileReader(
                                                "src/main/java/g0101_0200/"
                                                        + "s0196_delete_duplicate_emails/script.sql"))
                                .lines()
                                .collect(Collectors.joining("\n"))
                                .replaceAll("#.*?\\r?\\n", ""));
                final ResultSet resultSet = statement.executeQuery("select email from Person");
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("john@example.com"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("bob@example.com"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
