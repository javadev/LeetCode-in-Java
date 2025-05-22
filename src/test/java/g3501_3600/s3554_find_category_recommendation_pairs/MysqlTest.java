package g3501_3600.s3554_find_category_recommendation_pairs;

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
                "CREATE TABLE ProductPurchases(user_id INTEGER, product_id INTEGER"
                        + ", quantity INTEGER); "
                        + "INSERT INTO ProductPurchases(user_id, product_id, quantity)"
                        + " VALUES "
                        + "(1, 101, 2), "
                        + "(1, 102, 1), "
                        + "(1, 201, 3), "
                        + "(1, 301, 1), "
                        + "(2, 101, 1), "
                        + "(2, 102, 2), "
                        + "(2, 103, 1), "
                        + "(2, 201, 5), "
                        + "(3, 101, 2), "
                        + "(3, 103, 1), "
                        + "(3, 301, 4), "
                        + "(3, 401, 2), "
                        + "(4, 101, 1), "
                        + "(4, 201, 3), "
                        + "(4, 301, 1), "
                        + "(4, 401, 2), "
                        + "(5, 102, 2), "
                        + "(5, 103, 1), "
                        + "(5, 201, 2), "
                        + "(5, 202, 3);"
                        + "CREATE TABLE ProductInfo(product_id INTEGER, category VARCHAR(255)"
                        + ", price INTEGER); "
                        + "INSERT INTO ProductInfo(product_id, category, price) VALUES "
                        + "(101, 'Electronics', 100), "
                        + "(102, 'Books', 20), "
                        + "(103, 'Books', 35), "
                        + "(201, 'Clothing', 45), "
                        + "(202, 'Clothing', 60), "
                        + "(301, 'Sports', 75), "
                        + "(401, 'Kitchen', 50);")
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
                                                                    + "s3554_find_category_recommendation_pairs/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Books"));
                assertThat(resultSet.getNString(2), equalTo("Clothing"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Books"));
                assertThat(resultSet.getNString(2), equalTo("Electronics"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Clothing"));
                assertThat(resultSet.getNString(2), equalTo("Electronics"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Electronics"));
                assertThat(resultSet.getNString(2), equalTo("Sports"));
                assertThat(resultSet.getNString(3), equalTo("3"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
