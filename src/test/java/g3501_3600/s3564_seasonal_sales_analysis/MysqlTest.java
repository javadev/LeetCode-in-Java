package g3501_3600.s3564_seasonal_sales_analysis;

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
                "CREATE TABLE sales(sale_id INTEGER, product_id INTEGER"
                        + ", sale_date DATE, quantity INTEGER, price DECIMAL); "
                        + "INSERT INTO sales (sale_id, product_id, sale_date, quantity, price) VALUES"
                        + "(1, 1, '2023-01-15', 5, 10.00),"
                        + "(2, 2, '2023-01-20', 4, 15.00),"
                        + "(3, 3, '2023-03-10', 3, 18.00),"
                        + "(4, 4, '2023-04-05', 1, 20.00),"
                        + "(5, 1, '2023-05-20', 2, 10.00),"
                        + "(6, 2, '2023-06-12', 4, 15.00),"
                        + "(7, 5, '2023-06-15', 5, 12.00),"
                        + "(8, 3, '2023-07-24', 2, 18.00),"
                        + "(9, 4, '2023-08-01', 5, 20.00),"
                        + "(10, 5, '2023-09-03', 3, 12.00),"
                        + "(11, 1, '2023-09-25', 6, 10.00),"
                        + "(12, 2, '2023-11-10', 4, 15.00),"
                        + "(13, 3, '2023-12-05', 6, 18.00),"
                        + "(14, 4, '2023-12-22', 3, 20.00),"
                        + "(15, 5, '2024-02-14', 2, 12.00);"
                        + "CREATE TABLE products(product_id INTEGER, product_name VARCHAR(255)"
                        + ", category VARCHAR(255)); "
                        + "INSERT INTO products (product_id, product_name, category) VALUES"
                        + "(1, 'Warm Jacket', 'Apparel'),"
                        + "(2, 'Designer Jeans', 'Apparel'),"
                        + "(3, 'Cutting Board', 'Kitchen'),"
                        + "(4, 'Smart Speaker', 'Tech'),"
                        + "(5, 'Yoga Mat', 'Fitness');")
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
                                                            "src/main/java/g3501_3600/"
                                                                    + "s3564_seasonal_sales_analysis/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Fall"));
                assertThat(resultSet.getNString(2), equalTo("Apparel"));
                assertThat(resultSet.getNString(3), equalTo("10"));
                assertThat(resultSet.getNString(4), equalTo("120"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Spring"));
                assertThat(resultSet.getNString(2), equalTo("Kitchen"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.getNString(4), equalTo("54"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Summer"));
                assertThat(resultSet.getNString(2), equalTo("Tech"));
                assertThat(resultSet.getNString(3), equalTo("5"));
                assertThat(resultSet.getNString(4), equalTo("100"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Winter"));
                assertThat(resultSet.getNString(2), equalTo("Apparel"));
                assertThat(resultSet.getNString(3), equalTo("9"));
                assertThat(resultSet.getNString(4), equalTo("110"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
