package g1001_1100.s1045_customers_who_bought_all_products;

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
                "CREATE TABLE Customer(customer_id INTEGER, product_key INTEGER); "
                        + " INSERT INTO Customer(customer_id, product_key) VALUES (1, 5); "
                        + " INSERT INTO Customer(customer_id, product_key) VALUES (2, 6); "
                        + " INSERT INTO Customer(customer_id, product_key) VALUES (3, 5); "
                        + " INSERT INTO Customer(customer_id, product_key) VALUES (3, 6); "
                        + " INSERT INTO Customer(customer_id, product_key) VALUES (1, 6); "
                        + "CREATE TABLE Product(product_key INTEGER); "
                        + " INSERT INTO Product(product_key) VALUES (5); "
                        + " INSERT INTO Product(product_key) VALUES (6); ")
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
                                                                    + "s1045_customers"
                                                                    + "_who_bought_all_products"
                                                                    + "/script.sql"))
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
