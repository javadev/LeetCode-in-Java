package g1601_1700.s1661_average_time_of_process_per_machine;

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
                "CREATE TABLE Activity(machine_id INTEGER, process_id INTEGER, "
                        + "activity_type VARCHAR, timestamp DECIMAL(7, 3)); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (0, 0, 'start', 0.712); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (0, 0, 'end', 1.520); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (0, 1, 'start', 3.140); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (0, 1, 'end', 4.120); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (1, 0, 'start', 0.550); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (1, 0, 'end', 1.550); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (1, 1, 'start', 0.430); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (1, 1, 'end', 1.420); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (2, 0, 'start', 4.100); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (2, 0, 'end', 4.512); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (2, 1, 'start', 2.500); "
                        + "INSERT INTO Activity(machine_id, process_id, activity_type, timestamp) "
                        + "VALUES (2, 1, 'end', 5.000); ")
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
                                                            "src/main/java/g1601_1700/s1661_average_time_"
                                                                    + "of_process_per_machine/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(0));
                assertThat(resultSet.getDouble(2), equalTo(0.894));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getDouble(2), equalTo(0.995));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getDouble(2), equalTo(1.456));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
