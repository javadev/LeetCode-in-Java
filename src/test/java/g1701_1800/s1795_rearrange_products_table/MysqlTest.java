package g1701_1800.s1795_rearrange_products_table;

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
                "CREATE TABLE Products(product_id INTEGER PRIMARY KEY, store1 INTEGER,"
                        + " store2 INTEGER, store3 INTEGER); "
                        + "INSERT INTO Products(product_id, store1, store2, store3)"
                        + " VALUES (0, 95, 100, 105); "
                        + "INSERT INTO Products(product_id, store1, store2, store3)"
                        + " VALUES (1, 70, null, 80); ")
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
                                                            "src/main/java/g1701_1800/s1795_rearrange"
                                                                    + "_products_table/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(0));
                assertThat(resultSet.getNString(2), equalTo("store1"));
                assertThat(resultSet.getInt(3), equalTo(95));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(0));
                assertThat(resultSet.getNString(2), equalTo("store2"));
                assertThat(resultSet.getInt(3), equalTo(100));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(0));
                assertThat(resultSet.getNString(2), equalTo("store3"));
                assertThat(resultSet.getInt(3), equalTo(105));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("store1"));
                assertThat(resultSet.getInt(3), equalTo(70));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("store3"));
                assertThat(resultSet.getInt(3), equalTo(80));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
