package g0201_0300.s0262_trips_and_users;

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
        initialSqls = {
            "CREATE TABLE Trips(id INTEGER PRIMARY KEY, client_id INTEGER, "
                    + "driver_id INTEGER, city_id INTEGER, status VARCHAR, request_at DATE); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (1, 1, 10, 1, 'completed', '2013-10-01'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (2, 2, 11, 1, 'cancelled_by_driver', '2013-10-01'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (3, 3, 12, 6, 'completed', '2013-10-01'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (4, 4, 13, 6, 'cancelled_by_driver', '2013-10-01'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (5, 1, 10, 1, 'completed', '2013-10-02'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (6, 2, 11, 6, 'completed', '2013-10-02'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (7, 3, 12, 6, 'completed', '2013-10-02'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (8, 2, 12, 12, 'completed', '2013-10-03'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (9, 3, 10, 12, 'completed', '2013-10-03'); "
                    + "INSERT INTO Trips(id, client_id, driver_id, city_id, "
                    + "status, request_at) VALUES (10, 4, 13, 12, 'cancelled_by_driver', '2013-10-03'); ",
            "CREATE TABLE Users(users_id INTEGER, banned VARCHAR, role VARCHAR); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (1, 'No', 'client'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (2, 'No', 'client'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (3, 'No', 'client'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (4, 'No', 'client'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (10, 'No', 'driver'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (11, 'No', 'driver'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (12, 'No', 'driver'); "
                    + "INSERT INTO Users(users_id, banned, role) VALUES (13, 'No', 'driver'); "
        })
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
                                                            "src/main/java/g0201_0300/"
                                                                    + "s0262_trips_and_users/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDate(1).toString(), equalTo("2013-10-01"));
                assertThat(resultSet.getFloat(2), equalTo(0.5F));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDate(1).toString(), equalTo("2013-10-02"));
                assertThat(resultSet.getFloat(2), equalTo(0.0F));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDate(1).toString(), equalTo("2013-10-03"));
                assertThat(resultSet.getFloat(2), equalTo(0.33F));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
