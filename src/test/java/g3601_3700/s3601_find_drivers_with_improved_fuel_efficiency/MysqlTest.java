package g3601_3700.s3601_find_drivers_with_improved_fuel_efficiency;

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
                "CREATE TABLE drivers (driver_id INTEGER, driver_name VARCHAR(255)); "
                        + "INSERT INTO drivers (driver_id, driver_name) VALUES"
                        + "(1, 'Alice Johnson'),"
                        + "(2, 'Bob Smith'),"
                        + "(3, 'Carol Davis'),"
                        + "(4, 'David Wilson'),"
                        + "(5, 'Emma Brown');"
                        + "CREATE TABLE trips (trip_id INTEGER, driver_id INTEGER"
                        + ", trip_date DATE, distance_km DECIMAL(7, 3), fuel_consumed DECIMAL(7, 3)); "
                        + "INSERT INTO trips (trip_id, driver_id, trip_date, distance_km, fuel_consumed) VALUES"
                        + "(1, 1, '2023-02-15', 120.5, 10.2),"
                        + "(2, 1, '2023-03-20', 200.0, 16.5),"
                        + "(3, 1, '2023-08-10', 150.0, 11.0),"
                        + "(4, 1, '2023-09-25', 180.0, 12.5),"
                        + "(5, 2, '2023-01-10', 100.0, 9.0),"
                        + "(6, 2, '2023-04-15', 250.0, 22.0),"
                        + "(7, 2, '2023-10-05', 200.0, 15.0),"
                        + "(8, 3, '2023-03-12', 80.0, 8.5),"
                        + "(9, 3, '2023-05-18', 90.0, 9.2),"
                        + "(10, 4, '2023-07-22', 160.0, 12.8),"
                        + "(11, 4, '2023-11-30', 140.0, 11.0),"
                        + "(12, 5, '2023-02-28', 110.0, 11.5);")
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
                                                            "src/main/java/g3601_3700/"
                                                                    + "s3601_find_drivers_with_"
                                                                    + "improved_fuel_efficiency/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("Bob Smith"));
                assertThat(resultSet.getNString(3), equalTo("11.24"));
                assertThat(resultSet.getNString(4), equalTo("13.33"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Alice Johnson"));
                assertThat(resultSet.getNString(3), equalTo("11.97"));
                assertThat(resultSet.getNString(4), equalTo("14.02"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
