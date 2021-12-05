package g0101_0200.s0175_combine_two_tables_easy_database;

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
                            "CREATE TABLE Person(personId INTEGER PRIMARY KEY, lastName VARCHAR(512)"
                                    + ", firstName VARCHAR(512)); "
                                    + "INSERT INTO Person(personId, lastName, firstName) "
                                    + "VALUES (1, 'Wang', 'Allen'); "
                                    + "INSERT INTO Person(personId, lastName, firstName) "
                                    + "VALUES (2, 'Alice', 'Bob'); "
                                    + "CREATE TABLE Address(addressId INTEGER PRIMARY KEY, personId INTEGER"
                                    + ", city VARCHAR(512), state VARCHAR(512)); "
                                    + "INSERT INTO Address(addressId, personId, city, state) "
                                    + "VALUES (1, 2, 'New York City', 'New York'); "
                                    + "INSERT INTO Address(addressId, personId, city, state) "
                                    + "VALUES (2, 3, 'Leetcode', 'California'); ")
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
                                                                    + "s0175_combine_two_tables_easy_database/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Allen"));
                assertThat(resultSet.getNString(2), equalTo("Wang"));
                assertThat(resultSet.getNString(3), equalTo(null));
                assertThat(resultSet.getNString(4), equalTo(null));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Bob"));
                assertThat(resultSet.getNString(2), equalTo("Alice"));
                assertThat(resultSet.getNString(3), equalTo("New York City"));
                assertThat(resultSet.getNString(4), equalTo("New York"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
