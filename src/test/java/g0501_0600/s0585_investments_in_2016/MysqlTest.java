package g0501_0600.s0585_investments_in_2016;

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
                "CREATE TABLE Insurance(pid INTEGER, tiv_2015 DECIMAL,  tiv_2016 DECIMAL"
                        + ", lat DECIMAL, lon DECIMAL); "
                        + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
                        + ", lat, lon)"
                        + " VALUES (1, 10, 5, 10, 10); "
                        + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
                        + ", lat, lon)"
                        + " VALUES (2, 20, 20, 20, 20); "
                        + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
                        + ", lat, lon)"
                        + " VALUES (3, 10, 30, 20, 20); "
                        + "INSERT INTO Insurance(pid, tiv_2015, tiv_2016"
                        + ", lat, lon)"
                        + " VALUES (4, 10, 40, 40, 40); ")
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
                                                                    + "s0585_investments_in_2016/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getDouble(1), equalTo(45.00));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
