package g0501_0600.s0595_big_countries;

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
                "CREATE TABLE World(name VARCHAR, continent VARCHAR, area BIGINT,"
                        + " population BIGINT, gdp BIGINT); "
                        + "INSERT INTO World(name, continent, area, population, gdp)"
                        + " VALUES ('Afghanistan', 'Asia', 652230, 25500100, 20343000000); "
                        + "INSERT INTO World(name, continent, area, population, gdp)"
                        + " VALUES ('Albania', 'Europe', 28748, 2831741, 12960000000); "
                        + "INSERT INTO World(name, continent, area, population, gdp)"
                        + " VALUES ('Algeria', 'Africa', 2381741, 37100000, 188681000000); "
                        + "INSERT INTO World(name, continent, area, population, gdp)"
                        + " VALUES ('Andorra', 'Europe', 468, 78115, 3712000000); "
                        + "INSERT INTO World(name, continent, area, population, gdp)"
                        + " VALUES ('Angola', 'Africa', 1246700, 20609294, 100990000000); ")
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
                                                                    + "s0595_big_countries"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Afghanistan"));
                assertThat(resultSet.getLong(2), equalTo(25500100L));
                assertThat(resultSet.getLong(3), equalTo(652230L));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Algeria"));
                assertThat(resultSet.getLong(2), equalTo(37100000L));
                assertThat(resultSet.getLong(3), equalTo(2381741L));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
