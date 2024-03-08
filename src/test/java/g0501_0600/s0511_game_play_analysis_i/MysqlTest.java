package g0501_0600.s0511_game_play_analysis_i;

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
                "CREATE TABLE Activity(player_id INTEGER, device_id INTEGER,"
                        + " event_date DATE, games_played INTEGER); "
                        + "INSERT INTO Activity(player_id, device_id, event_date, games_played)"
                        + " VALUES (1, 2, '2016-03-01', 5); "
                        + "INSERT INTO Activity(player_id, device_id, event_date, games_played)"
                        + " VALUES (1, 2, '2016-05-02', 6); "
                        + "INSERT INTO Activity(player_id, device_id, event_date, games_played)"
                        + " VALUES (2, 3, '2017-06-25', 1); "
                        + "INSERT INTO Activity(player_id, device_id, event_date, games_played)"
                        + " VALUES (3, 1, '2016-03-02', 0); "
                        + "INSERT INTO Activity(player_id, device_id, event_date, games_played)"
                        + " VALUES (3, 4, '2018-07-03', 5); ")
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
                                                                    + "s0511_game_play_analysis_i/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getDate(2).toString(), equalTo("2016-03-01"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getDate(2).toString(), equalTo("2017-06-25"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getDate(2).toString(), equalTo("2016-03-02"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
