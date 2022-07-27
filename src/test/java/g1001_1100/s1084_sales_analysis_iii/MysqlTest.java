package g1001_1100.s1084_sales_analysis_iii;

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
                "CREATE TABLE product(product_id INTEGER PRIMARY KEY, product_name VARCHAR(512)"
                        + ", unit_price INTEGER); "
                        + "INSERT INTO product(product_id, product_name, unit_price)"
                        + " VALUES (1, 'S8', 1000); "
                        + "INSERT INTO product(product_id, product_name, unit_price)"
                        + " VALUES (2, 'G4', 800); "
                        + "INSERT INTO product(product_id, product_name, unit_price)"
                        + " VALUES (3, 'iPhone', 800); "
                        + "CREATE TABLE sales(seller_id INTEGER, product_id INTEGER, buyer_id INTEGER, sale_date DATE"
                        + ", quantity INTEGER, price INTEGER); "
                        + "INSERT INTO sales(seller_id, product_id, buyer_id, sale_date, quantity, price)"
                        + " VALUES (1, 1, 1, '2019-01-21', 2, 2000); "
                        + "INSERT INTO sales(seller_id, product_id, buyer_id, sale_date, quantity, price)"
                        + " VALUES (1, 2, 2, '2019-02-17', 1, 800); "
                        + "INSERT INTO sales(seller_id, product_id, buyer_id, sale_date, quantity, price)"
                        + " VALUES (2, 2, 3, '2019-06-021', 1, 800); "
                        + "INSERT INTO sales(seller_id, product_id, buyer_id, sale_date, quantity, price)"
                        + " VALUES (3, 3, 4, '2019-05-13', 2, 2800); ")
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
                                                                    + "s1084_sales_analysis_iii/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("S8"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
