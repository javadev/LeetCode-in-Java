package g1401_1500.s1484_group_sold_products_by_the_date;

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
                "CREATE TABLE Activities(sell_date DATE, product VARCHAR); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-05-30', 'Headphone'); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-06-01', 'Pencil'); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-06-02', 'Mask'); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-05-30', 'Basketball'); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-06-01', 'Bible'); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-06-02', 'Mask'); "
                        + "INSERT INTO Activities(sell_date, product)"
                        + " VALUES ('2020-05-30', 'T-Shirt'); ")
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
                                                            "src/main/java/g1401_1500/s1484_group_sold_"
                                                                    + "products_by_the_date/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-05-30"));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.getNString(3), equalTo("Basketball,Headphone,T-Shirt"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-06-01"));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.getNString(3), equalTo("Bible,Pencil"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2020-06-02"));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.getNString(3), equalTo("Mask"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
