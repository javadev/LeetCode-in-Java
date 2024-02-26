package g0501_0600.s0584_find_customer_referee;

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
                "CREATE TABLE Customer(id INTEGER PRIMARY KEY, name VARCHAR, referee_id INTEGER); "
                        + "INSERT INTO Customer(id, name, referee_id) VALUES (1, 'Will', NULL); "
                        + "INSERT INTO Customer(id, name, referee_id) VALUES (2, 'Jane', NULL); "
                        + "INSERT INTO Customer(id, name, referee_id) VALUES (3, 'Alex', 2); "
                        + "INSERT INTO Customer(id, name, referee_id) VALUES (4, 'Bill', NULL); "
                        + "INSERT INTO Customer(id, name, referee_id) VALUES (5, 'Zack', 1); "
                        + "INSERT INTO Customer(id, name, referee_id) VALUES (6, 'Mark', 2); ")
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
                                                            "src/main/java/g0501_0600/"
                                                                    + "s0584_find_customer_referee/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("Will"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("Jane"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("Bill"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("Zack"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
