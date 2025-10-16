package g3701_3800.s3716_find_churn_risk_customers;

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
                "CREATE TABLE subscription_events ("
                        + "    event_id INTEGER PRIMARY KEY,"
                        + "    user_id INTEGER NOT NULL,"
                        + "    event_date DATE NOT NULL,"
                        + "    event_type VARCHAR(20) NOT NULL,"
                        + "    plan_name VARCHAR(20),"
                        + "    monthly_amount DECIMAL(10,2) NOT NULL"
                        + ");"
                        + "INSERT INTO subscription_events (event_id, user_id, event_date, "
                        + "event_type, plan_name, monthly_amount) VALUES"
                        + "(1, 501, '2024-01-01', 'start',     'premium', 29.99),"
                        + "(2, 501, '2024-02-15', 'downgrade', 'standard', 19.99),"
                        + "(3, 501, '2024-03-20', 'downgrade', 'basic', 9.99),"
                        + "(4, 502, '2024-01-05', 'start',     'standard', 19.99),"
                        + "(5, 502, '2024-02-10', 'upgrade',   'premium', 29.99),"
                        + "(6, 502, '2024-03-15', 'downgrade', 'basic', 9.99),"
                        + "(7, 503, '2024-01-10', 'start',     'basic', 9.99),"
                        + "(8, 503, '2024-02-20', 'upgrade',   'standard', 19.99),"
                        + "(9, 503, '2024-03-25', 'upgrade',   'premium', 29.99),"
                        + "(10, 504, '2024-01-15', 'start',    'premium', 29.99),"
                        + "(11, 504, '2024-03-01', 'downgrade','standard', 19.99),"
                        + "(12, 504, '2024-03-30', 'cancel',   NULL, 0.00),"
                        + "(13, 505, '2024-02-01', 'start',    'basic', 9.99),"
                        + "(14, 505, '2024-02-28', 'upgrade',  'standard', 19.99),"
                        + "(15, 506, '2024-01-20', 'start',    'premium', 29.99),"
                        + "(16, 506, '2024-03-10', 'downgrade','basic', 9.99);"
                        + "")
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
                                                            "src/main/java/g3701_3800/"
                                                                    + "s3716_find_churn_risk_customers/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("501"));
                assertThat(resultSet.getString(2), equalTo("basic"));
                assertThat(resultSet.getString(3), equalTo("9.99"));
                assertThat(resultSet.getString(4), equalTo("29.99"));
                assertThat(resultSet.getString(5), equalTo("79"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getString(1), equalTo("502"));
                assertThat(resultSet.getString(2), equalTo("basic"));
                assertThat(resultSet.getString(3), equalTo("9.99"));
                assertThat(resultSet.getString(4), equalTo("29.99"));
                assertThat(resultSet.getString(5), equalTo("70"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
