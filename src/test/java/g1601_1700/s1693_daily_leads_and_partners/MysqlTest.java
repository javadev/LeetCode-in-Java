package g1601_1700.s1693_daily_leads_and_partners;

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
                "CREATE TABLE DailySales(date_id DATE, make_name VARCHAR, lead_id INTEGER,"
                        + " partner_id INTEGER); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-8', 'toyota', 0, 1); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-8', 'toyota', 1, 0); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-8', 'toyota', 1, 2); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-7', 'toyota', 0, 2); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-7', 'toyota', 0, 1); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-8', 'honda', 1, 2); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-8', 'honda', 2, 1); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-7', 'honda', 0, 1); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-7', 'honda', 1, 2); "
                        + "INSERT INTO DailySales(date_id, make_name, lead_id, partner_id) "
                        + " VALUES ('2020-12-7', 'honda', 2, 1); ")
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
                                                            "src/main/java/g1601_1700/s1693_daily_le"
                                                                    + "ads_and_partners/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-12-07"));
                assertThat(resultSet.getNString(2), equalTo("honda"));
                assertThat(resultSet.getInt(3), equalTo(3));
                assertThat(resultSet.getInt(4), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-12-07"));
                assertThat(resultSet.getNString(2), equalTo("toyota"));
                assertThat(resultSet.getInt(3), equalTo(1));
                assertThat(resultSet.getInt(4), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-12-08"));
                assertThat(resultSet.getNString(2), equalTo("honda"));
                assertThat(resultSet.getInt(3), equalTo(2));
                assertThat(resultSet.getInt(4), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-12-08"));
                assertThat(resultSet.getNString(2), equalTo("toyota"));
                assertThat(resultSet.getInt(3), equalTo(2));
                assertThat(resultSet.getInt(4), equalTo(3));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
