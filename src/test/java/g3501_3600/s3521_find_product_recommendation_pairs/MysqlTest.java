package g3501_3600.s3521_find_product_recommendation_pairs;

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
                "    CREATE TABLE ProductPurchases ("
                        + "    user_id INT,"
                        + "    product_id INT,"
                        + "    quantity INT"
                        + ");"
                        + "CREATE TABLE ProductInfo ("
                        + "    product_id INT,"
                        + "    category VARCHAR(100),"
                        + "    price BIGINT"
                        + ");"
                        + "INSERT INTO ProductPurchases (user_id, product_id, quantity)"
                        + "VALUES"
                        + "    (1       , 101        , 2),"
                        + "    (1       , 102        , 1        ),"
                        + "    (1       , 103        , 3        ),"
                        + "    (2       , 101        , 1        ),"
                        + "    (2       , 102        , 5        ),"
                        + "    (2       , 104        , 1        ),"
                        + "    (3       , 101        , 2        ),"
                        + "    (3       , 103        , 1        ),"
                        + "    (3       , 105        , 4        ),"
                        + "    (4       , 101        , 1        ),"
                        + "    (4       , 102        , 1        ),"
                        + "    (4       , 103        , 2        ),"
                        + "    (4       , 104        , 3        ),"
                        + "    (5       , 102        , 2        ),"
                        + "    (5       , 104        , 1 );"
                        + "INSERT INTO ProductInfo (product_id, category, price)"
                        + "VALUES"
                        + "    (101       , 'Electronics'        , 100),"
                        + "    (102       , 'Books'        , 20),"
                        + "    (103       , 'Clothing'        , 35),"
                        + "    (104       , 'Kitchen'        , 50),"
                        + "    (105       , 'Sports'        , 75);")
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
                                                                    + "s3521_find_product_recommendation_pairs/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                checkRow(resultSet, new String[] {"101", "102", "Electronics", "Books", "3"});
                checkRow(resultSet, new String[] {"101", "103", "Electronics", "Clothing", "3"});
                checkRow(resultSet, new String[] {"102", "104", "Books", "Clothing", "3"});
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }

    private void checkRow(ResultSet resultSet, String[] values) throws SQLException {
        assertThat(resultSet.next(), equalTo(true));
        assertThat(resultSet.getNString(1), equalTo(values[0]));
        assertThat(resultSet.getNString(2), equalTo(values[1]));
        assertThat(resultSet.getNString(3), equalTo(values[2]));
    }
}
