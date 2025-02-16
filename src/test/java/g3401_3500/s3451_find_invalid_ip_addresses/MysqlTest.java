package g3401_3500.s3451_find_invalid_ip_addresses;

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
                "    CREATE TABLE logs ("
                        + "    log_id INT,"
                        + "    ip VARCHAR(50),"
                        + "    status_code INT"
                        + ");"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(1, '192.168.1.1', 200);"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(2, '256.1.2.3', 404);"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(3, '192.168.001.1', 200);"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(4, '192.168.1.1', 200);"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(5, '192.168.1', 500);"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(6, '256.1.2.3', 404);"
                        + "insert into logs (log_id, ip, status_code) values "
                        + "(7, '192.168.001.1', 200);")
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
                                                            "src/main/java/g3401_3500/"
                                                                    + "s3451_find_invalid_ip_addresses/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("256.1.2.3"));
                assertThat(resultSet.getNString(2), equalTo("2"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("192.168.001.1"));
                assertThat(resultSet.getNString(2), equalTo("2"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("192.168.1"));
                assertThat(resultSet.getNString(2), equalTo("1"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
