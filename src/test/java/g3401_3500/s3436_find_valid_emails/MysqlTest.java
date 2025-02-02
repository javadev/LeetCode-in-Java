package g3401_3500.s3436_find_valid_emails;

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
                "CREATE TABLE Users(user_id INTEGER PRIMARY KEY, email VARCHAR(512)); "
                        + "INSERT INTO Users(user_id, email)"
                        + " VALUES (1, 'alice@example.com'); "
                        + "INSERT INTO Users(user_id, email)"
                        + " VALUES (2, 'bob_at_example.com'); "
                        + "INSERT INTO Users(user_id, email)"
                        + " VALUES (3, 'charlie@example.net'); "
                        + "INSERT INTO Users(user_id, email)"
                        + " VALUES (4, 'david@domain.com'); "
                        + "INSERT INTO Users(user_id, email)"
                        + " VALUES (5, 'eve@invalid'); ")
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
                                                            "src/main/java/g3401_3500/"
                                                                    + "s3436_find_valid_emails/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("alice@example.com"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(4));
                assertThat(resultSet.getNString(2), equalTo("david@domain.com"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
