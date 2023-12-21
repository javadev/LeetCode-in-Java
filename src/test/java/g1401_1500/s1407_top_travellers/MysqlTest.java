package g1401_1500.s1407_top_travellers;

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
                "CREATE TABLE Users(id INTEGER PRIMARY KEY, name VARCHAR); "
                        + "INSERT INTO Users(id, name) VALUES (1, 'Alice'); "
                        + "INSERT INTO Users(id, name) VALUES (2, 'Bob'); "
                        + "INSERT INTO Users(id, name) VALUES (3, 'Alex'); "
                        + "INSERT INTO Users(id, name) VALUES (4, 'Donald'); "
                        + "INSERT INTO Users(id, name) VALUES (7, 'Lee'); "
                        + "INSERT INTO Users(id, name) VALUES (13, 'Jonathan'); "
                        + "INSERT INTO Users(id, name) VALUES (19, 'Elvis'); "
                        + "CREATE TABLE Rides(id INTEGER PRIMARY KEY, user_id INTEGER, distance INTEGER); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (1, 1, 120); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (2, 2, 317); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (3, 3, 222); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (4, 7, 100); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (5, 13, 312); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (6, 19, 50); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (7, 7, 120); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (8, 19, 400); "
                        + "INSERT INTO Rides(id, user_id, distance)"
                        + " VALUES (9, 7, 230); ")
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
                                                            "src/main/java/g1401_1500/s1407_top_trave"
                                                                    + "llers/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Elvis"));
                assertThat(resultSet.getInt(2), equalTo(450));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Lee"));
                assertThat(resultSet.getInt(2), equalTo(450));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Bob"));
                assertThat(resultSet.getInt(2), equalTo(317));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Jonathan"));
                assertThat(resultSet.getInt(2), equalTo(312));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Alex"));
                assertThat(resultSet.getInt(2), equalTo(222));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Alice"));
                assertThat(resultSet.getInt(2), equalTo(120));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Donald"));
                assertThat(resultSet.getInt(2), equalTo(0));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
