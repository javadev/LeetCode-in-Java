package g0101_0200.s0197_rising_temperature;

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
                "CREATE TABLE Weather(id INTEGER PRIMARY KEY, recordDate DATE, temperature INTEGER); "
                        + "INSERT INTO Weather(id, recordDate, temperature) VALUES (1, '2015-01-01', 10); "
                        + "INSERT INTO Weather(id, recordDate, temperature) VALUES (2, '2015-01-02', 25); "
                        + "INSERT INTO Weather(id, recordDate, temperature) VALUES (3, '2015-01-03', 20); "
                        + "INSERT INTO Weather(id, recordDate, temperature) VALUES (4, '2015-01-04', 30); ")
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
                                                            "src/main/java/g0101_0200/"
                                                                    + "s0197_rising_temperature/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", "")
                                            .replace(
                                                    "ADDDATE(FirstDate.recordDate,1)",
                                                    "TIMESTAMPADD(DAY, 1, FirstDate.recordDate)"))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(4));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
