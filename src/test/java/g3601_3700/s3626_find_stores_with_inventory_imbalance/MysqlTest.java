package g3601_3700.s3626_find_stores_with_inventory_imbalance;

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
                "CREATE TABLE stores ("
                        + "    store_id INT PRIMARY KEY,"
                        + "    store_name VARCHAR(50),"
                        + "    location VARCHAR(50)"
                        + ");"
                        + "INSERT INTO stores (store_id, store_name, location) VALUES"
                        + "(1, 'Downtown Tech', 'New York'),"
                        + "(2, 'Suburb Mall', 'Chicago'),"
                        + "(3, 'City Center', 'Los Angeles'),"
                        + "(4, 'Corner Shop', 'Miami'),"
                        + "(5, 'Plaza Store', 'Seattle');"
                        + "CREATE TABLE inventory ("
                        + "    inventory_id INT PRIMARY KEY,"
                        + "    store_id INT,"
                        + "    product_name VARCHAR(50),"
                        + "    quantity INT,"
                        + "    price DECIMAL(10,2),"
                        + "    FOREIGN KEY (store_id) REFERENCES stores(store_id)"
                        + ");"
                        + "INSERT INTO inventory (inventory_id, store_id, "
                        + "product_name, quantity, price) VALUES"
                        + "(1,  1, 'Laptop',     5,   999.99),"
                        + "(2,  1, 'Mouse',      50,   19.99),"
                        + "(3,  1, 'Keyboard',   25,   79.99),"
                        + "(4,  1, 'Monitor',    15,  299.99),"
                        + "(5,  2, 'Phone',      3,   699.99),"
                        + "(6,  2, 'Charger',    100,  25.99),"
                        + "(7,  2, 'Case',       75,   15.99),"
                        + "(8,  2, 'Headphones', 20,  149.99),"
                        + "(9,  3, 'Tablet',     2,   499.99),"
                        + "(10, 3, 'Stylus',     80,   29.99),"
                        + "(11, 3, 'Cover',      60,   39.99),"
                        + "(12, 4, 'Watch',      10,  299.99),"
                        + "(13, 4, 'Band',       25,   49.99),"
                        + "(14, 5, 'Camera',     8,   599.99),"
                        + "(15, 5, 'Lens',       12,  199.99);")
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
                                                            "src/main/java/g3601_3700/"
                                                                    + "s3626_find_stores_with_"
                                                                    + "inventory_imbalance/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("3"));
                assertThat(resultSet.getNString(2), equalTo("City Center"));
                assertThat(resultSet.getNString(3), equalTo("Los Angeles"));
                assertThat(resultSet.getNString(4), equalTo("Tablet"));
                assertThat(resultSet.getNString(5), equalTo("Stylus"));
                assertThat(resultSet.getNString(6), equalTo("40.00"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("Suburb Mall"));
                assertThat(resultSet.getNString(3), equalTo("Chicago"));
                assertThat(resultSet.getNString(4), equalTo("Phone"));
                assertThat(resultSet.getNString(5), equalTo("Case"));
                assertThat(resultSet.getNString(6), equalTo("25.00"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Downtown Tech"));
                assertThat(resultSet.getNString(3), equalTo("New York"));
                assertThat(resultSet.getNString(4), equalTo("Laptop"));
                assertThat(resultSet.getNString(5), equalTo("Mouse"));
                assertThat(resultSet.getNString(6), equalTo("10.00"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
