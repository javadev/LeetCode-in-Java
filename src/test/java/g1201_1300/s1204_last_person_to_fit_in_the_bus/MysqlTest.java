package g1201_1300.s1204_last_person_to_fit_in_the_bus;

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
                "CREATE TABLE Queue(person_id INTEGER, person_name VARCHAR, weight INTEGER, turn INTEGER); "
                        + "INSERT INTO Queue(person_id, person_name, weight, turn)"
                        + " VALUES (5, 'Alice', 250, 1); "
                        + "INSERT INTO Queue(person_id, person_name, weight, turn)"
                        + " VALUES (4, 'Bob', 175, 5); "
                        + "INSERT INTO Queue(person_id, person_name, weight, turn)"
                        + " VALUES (3, 'Alex', 350, 2); "
                        + "INSERT INTO Queue(person_id, person_name, weight, turn)"
                        + " VALUES (6, 'John Cena', 400, 3); "
                        + "INSERT INTO Queue(person_id, person_name, weight, turn)"
                        + " VALUES (1, 'Winston', 500, 6); "
                        + "INSERT INTO Queue(person_id, person_name, weight, turn)"
                        + " VALUES (2, 'Marie', 200, 4); ")
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
                                                            "src/main/java/g1201_1300/"
                                                                    + "s1204_last_person_to_fit_in_the_bus/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("John Cena"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
