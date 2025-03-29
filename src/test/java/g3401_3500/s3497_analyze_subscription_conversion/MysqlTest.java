package g3401_3500.s3497_analyze_subscription_conversion;

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
                "    CREATE TABLE UserActivity ("
                        + "    user_id INT,"
                        + "    activity_date date,"
                        + "    activity_type VARCHAR(100),"
                        + "    activity_duration INT"
                        + ");"
                        + "INSERT INTO UserActivity (user_id, activity_date, activity_type, activity_duration)"
                        + "VALUES"
                        + "    (1, '2023-01-01', 'free_trial', 45),"
                        + "    (1, '2023-01-02', 'free_trial', 30),"
                        + "    (1, '2023-01-05', 'free_trial', 60),"
                        + "    (1, '2023-01-10', 'paid', 75),"
                        + "    (1, '2023-01-12', 'paid', 90),"
                        + "    (1, '2023-01-15', 'paid', 65),"
                        + "    (2, '2023-02-01', 'free_trial', 55),"
                        + "    (2, '2023-02-03', 'free_trial', 25),"
                        + "    (2, '2023-02-07', 'free_trial', 50),"
                        + "    (2, '2023-02-10', 'cancelled', 0),"
                        + "    (3, '2023-03-05', 'free_trial', 70),"
                        + "    (3, '2023-03-06', 'free_trial', 60),"
                        + "    (3, '2023-03-08', 'free_trial', 80),"
                        + "    (3, '2023-03-12', 'paid', 50),"
                        + "    (3, '2023-03-15', 'paid', 55),"
                        + "    (3, '2023-03-20', 'paid', 85),"
                        + "    (4, '2023-04-01', 'free_trial', 40),"
                        + "    (4, '2023-04-03', 'free_trial', 35),"
                        + "    (4, '2023-04-05', 'paid', 45),"
                        + "    (4, '2023-04-07', 'cancelled', 0);")
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
                                                                    + "s3497_analyze_subscription_conversion/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                checkRow(resultSet, new String[] {"1", "45.0", "76.67"});
                checkRow(resultSet, new String[] {"3", "70.0", "63.33"});
                checkRow(resultSet, new String[] {"4", "37.5", "45.0"});
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }

    private void checkRow(ResultSet resultSet, String[] values) throws SQLException {
        assertThat(resultSet.next(), equalTo(true));
        assertThat(resultSet.getNString(1), equalTo(values[0]));
        assertThat(resultSet.getNString(2), equalTo(values[1]));
        assertThat(resultSet.getNString(3), equalTo(values[2]));
    }
}
