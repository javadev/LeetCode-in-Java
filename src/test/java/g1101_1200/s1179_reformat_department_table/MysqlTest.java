package g1101_1200.s1179_reformat_department_table;

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
                "CREATE TABLE department(id INTEGER, revenue INTEGER, \"month\" VARCHAR(512)); "
                        + "INSERT INTO department(id, revenue, \"month\")"
                        + " VALUES (1, 8000, 'Jan'); "
                        + "INSERT INTO department(id, revenue, \"month\")"
                        + " VALUES (2, 9000, 'Jan'); "
                        + "INSERT INTO department(id, revenue, \"month\")"
                        + " VALUES (3, 10000, 'Feb'); "
                        + "INSERT INTO department(id, revenue, \"month\")"
                        + " VALUES (1, 7000, 'Feb'); "
                        + "INSERT INTO department(id, revenue, \"month\")"
                        + " VALUES (1, 6000, 'Mar'); ")
@SuppressWarnings("java:S5961")
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
                                                            "src/main/java/g1101_1200/s1179_reformat_"
                                                                    + "department_table/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getInt(2), equalTo(8000));
                assertThat(resultSet.getInt(3), equalTo(7000));
                assertThat(resultSet.getInt(4), equalTo(6000));
                assertThat(resultSet.getInt(5), equalTo(0));
                assertThat(resultSet.getInt(6), equalTo(0));
                assertThat(resultSet.getInt(7), equalTo(0));
                assertThat(resultSet.getInt(8), equalTo(0));
                assertThat(resultSet.getInt(9), equalTo(0));
                assertThat(resultSet.getInt(10), equalTo(0));
                assertThat(resultSet.getInt(11), equalTo(0));
                assertThat(resultSet.getInt(12), equalTo(0));
                assertThat(resultSet.getInt(13), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getInt(2), equalTo(9000));
                assertThat(resultSet.getInt(3), equalTo(0));
                assertThat(resultSet.getInt(4), equalTo(0));
                assertThat(resultSet.getInt(5), equalTo(0));
                assertThat(resultSet.getInt(6), equalTo(0));
                assertThat(resultSet.getInt(7), equalTo(0));
                assertThat(resultSet.getInt(8), equalTo(0));
                assertThat(resultSet.getInt(9), equalTo(0));
                assertThat(resultSet.getInt(10), equalTo(0));
                assertThat(resultSet.getInt(11), equalTo(0));
                assertThat(resultSet.getInt(12), equalTo(0));
                assertThat(resultSet.getInt(13), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getInt(2), equalTo(0));
                assertThat(resultSet.getInt(3), equalTo(10000));
                assertThat(resultSet.getInt(4), equalTo(0));
                assertThat(resultSet.getInt(5), equalTo(0));
                assertThat(resultSet.getInt(6), equalTo(0));
                assertThat(resultSet.getInt(7), equalTo(0));
                assertThat(resultSet.getInt(8), equalTo(0));
                assertThat(resultSet.getInt(9), equalTo(0));
                assertThat(resultSet.getInt(10), equalTo(0));
                assertThat(resultSet.getInt(11), equalTo(0));
                assertThat(resultSet.getInt(12), equalTo(0));
                assertThat(resultSet.getInt(13), equalTo(0));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
