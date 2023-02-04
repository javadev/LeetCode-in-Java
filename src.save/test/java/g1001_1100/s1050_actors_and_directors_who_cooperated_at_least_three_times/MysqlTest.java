package g1001_1100.s1050_actors_and_directors_who_cooperated_at_least_three_times;

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
                "CREATE TABLE ACTORDIRECTOR(actor_id INTEGER, director_id INTEGER,"
                        + " timestamp INTEGER PRIMARY KEY); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (1, 1, 0); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (1, 1, 1); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (1, 1, 2); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (1, 2, 3); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (1, 2, 4); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (1, 1, 5); "
                        + "INSERT INTO ACTORDIRECTOR(actor_id, director_id, timestamp)"
                        + " VALUES (2, 1, 6); ")
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
                                                            "src/main/java/g1001_1100/s1050_actors"
                                                                    + "_and_directors_who_cooperated_at_least"
                                                                    + "_three_times/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("1"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
