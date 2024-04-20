package g0601_0700.s0601_human_traffic_of_stadium;

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
                "CREATE TABLE Stadium(id INTEGER, visit_date DATE PRIMARY KEY, people INTEGER); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (1, '2017-01-01', 10); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (2, '2017-01-02', 109); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (3, '2017-01-03', 150); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (4, '2017-01-04', 99); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (5, '2017-01-05', 145); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (6, '2017-01-06', 1455); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (7, '2017-01-07', 199); "
                        + "INSERT INTO Stadium(id, visit_date, people)"
                        + " VALUES (8, '2017-01-09', 188); ")
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
                                                                    + "s0601_human_traffic"
                                                                    + "_of_stadium"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(5));
                assertThat(resultSet.getDate(2).toString(), equalTo("2017-01-05"));
                assertThat(resultSet.getInt(3), equalTo(145));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.getDate(2).toString(), equalTo("2017-01-06"));
                assertThat(resultSet.getInt(3), equalTo(1455));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(7));
                assertThat(resultSet.getDate(2).toString(), equalTo("2017-01-07"));
                assertThat(resultSet.getInt(3), equalTo(199));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(8));
                assertThat(resultSet.getDate(2).toString(), equalTo("2017-01-09"));
                assertThat(resultSet.getInt(3), equalTo(188));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
