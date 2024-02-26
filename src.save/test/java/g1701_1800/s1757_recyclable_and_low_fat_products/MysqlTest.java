package g1701_1800.s1757_recyclable_and_low_fat_products;

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
                "CREATE TABLE Products(product_id INTEGER PRIMARY KEY, low_fats VARCHAR, recyclable VARCHAR); "
                        + "INSERT INTO Products(product_id, low_fats, recyclable)"
                        + " VALUES (0, 'Y', 'N'); "
                        + "INSERT INTO Products(product_id, low_fats, recyclable)"
                        + " VALUES (1, 'Y', 'Y'); "
                        + "INSERT INTO Products(product_id, low_fats, recyclable)"
                        + " VALUES (2, 'N', 'Y'); "
                        + "INSERT INTO Products(product_id, low_fats, recyclable)"
                        + " VALUES (3, 'Y', 'Y'); "
                        + "INSERT INTO Products(product_id, low_fats, recyclable)"
                        + " VALUES (4, 'N', 'N'); ")
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
                                                            "src/main/java/g1701_1800/s1757_recyclable_and"
                                                                    + "_low_fat_products/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
