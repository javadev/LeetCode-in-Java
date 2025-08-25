package g3601_3700.s3657_find_loyal_customers;

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
                "CREATE TABLE customer_transactions ("
                + "    transaction_id INT PRIMARY KEY,"
                + "    customer_id INT NOT NULL,"
                + "    transaction_date DATE NOT NULL,"
                + "    amount DECIMAL(10,2) NOT NULL,"
                + "    transaction_type ENUM('purchase', 'refund') NOT NULL"
                + ");"
                + "INSERT INTO customer_transactions"
                + "(transaction_id, customer_id, transaction_date, amount, transaction_type)"
                + "VALUES"
                + "(1, 101, '2024-01-05', 150.00, 'purchase'),"
                + "(2, 101, '2024-01-15', 200.00, 'purchase'),"
                + "(3, 101, '2024-02-10', 180.00, 'purchase'),"
                + "(4, 101, '2024-02-20', 250.00, 'purchase'),"
                + "(5, 102, '2024-01-10', 100.00, 'purchase'),"
                + "(6, 102, '2024-01-12', 120.00, 'purchase'),"
                + "(7, 102, '2024-01-15', 80.00, 'refund'),"
                + "(8, 102, '2024-01-18', 90.00, 'refund'),"
                + "(9, 102, '2024-02-15', 130.00, 'purchase'),"
                + "(10, 103, '2024-01-01', 500.00, 'purchase'),"
                + "(11, 103, '2024-01-02', 450.00, 'purchase'),"
                + "(12, 103, '2024-01-03', 400.00, 'purchase'),"
                + "(13, 104, '2024-01-01', 200.00, 'purchase'),"
                + "(14, 104, '2024-02-01', 250.00, 'purchase'),"
                + "(15, 104, '2024-02-15', 300.00, 'purchase'),"
                + "(16, 104, '2024-03-01', 350.00, 'purchase'),"
                + "(17, 104, '2024-03-10', 280.00, 'purchase'),"
                + "(18, 104, '2024-03-15', 100.00, 'refund');")
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
                                                                    + "s3657_find_loyal_customers/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("101"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("104"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
