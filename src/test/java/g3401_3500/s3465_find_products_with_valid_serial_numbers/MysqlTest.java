package g3401_3500.s3465_find_products_with_valid_serial_numbers;

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
                "    CREATE TABLE products ("
                        + "    product_id INT,"
                        + "    product_name VARCHAR(50),"
                        + "    description VARCHAR(100)"
                        + ");"
                        + "insert into products (product_id, product_name, description) values "
                        + "(1, 'Widget A', 'This is a sample product with SN1234-5678');"
                        + "insert into products (product_id, product_name, description) values "
                        + "(2, 'Widget B', 'A product with serial SN9876-1234 in the description');"
                        + "insert into products (product_id, product_name, description) values "
                        + "(3, 'Widget C', 'Product SN1234-56789 is available now');"
                        + "insert into products (product_id, product_name, description) values "
                        + "(4, 'Widget D', 'No serial number here');"
                        + "insert into products (product_id, product_name, description) values "
                        + "(5, 'Widget E', 'Check out SN4321-8765 in this description');")
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
                                                                    + "s3465_find_products_with_valid_serial_numbers/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Widget A"));
                assertThat(
                        resultSet.getNString(3),
                        equalTo("This is a sample product with SN1234-5678"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("Widget B"));
                assertThat(
                        resultSet.getNString(3),
                        equalTo("A product with serial SN9876-1234 in the description"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("5"));
                assertThat(resultSet.getNString(2), equalTo("Widget E"));
                assertThat(
                        resultSet.getNString(3),
                        equalTo("Check out SN4321-8765 in this description"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
