package g1001_1100.s1068_product_sales_analysis_i;

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
                "CREATE TABLE Sales(sale_id INTEGER, product_id INTEGER,"
                        + " sale_year INTEGER, quantity INTEGER, price INTEGER); "
                        + "INSERT INTO Sales(sale_id, product_id, sale_year, quantity, price)"
                        + " VALUES (1, 100, 2008, 10, 5000); "
                        + "INSERT INTO Sales(sale_id, product_id, sale_year, quantity, price)"
                        + " VALUES (2, 100, 2009, 12, 5000); "
                        + "INSERT INTO Sales(sale_id, product_id, sale_year, quantity, price)"
                        + " VALUES (7, 200, 2011, 15, 9000); "
                        + "CREATE TABLE Product(product_id INTEGER, product_name VARCHAR); "
                        + "INSERT INTO Product(product_id, product_name)"
                        + " VALUES (100, 'Nokia'); "
                        + "INSERT INTO Product(product_id, product_name)"
                        + " VALUES (200, 'Apple'); "
                        + "INSERT INTO Product(product_id, product_name)"
                        + " VALUES (300, 'Samsung'); ")
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
                                                            "src/main/java/g1001_1100/"
                                                                    + "s1068_product_sales_analysis_i/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Nokia"));
                assertThat(resultSet.getInt(2), equalTo(2008));
                assertThat(resultSet.getInt(3), equalTo(5000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Nokia"));
                assertThat(resultSet.getInt(2), equalTo(2009));
                assertThat(resultSet.getInt(3), equalTo(5000));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Apple"));
                assertThat(resultSet.getInt(2), equalTo(2011));
                assertThat(resultSet.getInt(3), equalTo(9000));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
