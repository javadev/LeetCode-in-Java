package g0601_0700.s0619_biggest_single_number;

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
                "CREATE TABLE MyNumbers(num INTEGER); "
                        + "INSERT INTO MyNumbers(num) VALUES (8); "
                        + "INSERT INTO MyNumbers(num) VALUES (8); "
                        + "INSERT INTO MyNumbers(num) VALUES (3); "
                        + "INSERT INTO MyNumbers(num) VALUES (3); "
                        + "INSERT INTO MyNumbers(num) VALUES (1); "
                        + "INSERT INTO MyNumbers(num) VALUES (4); "
                        + "INSERT INTO MyNumbers(num) VALUES (5); "
                        + "INSERT INTO MyNumbers(num) VALUES (6); ")
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
                                                                    + "s0619_biggest_single_number"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
