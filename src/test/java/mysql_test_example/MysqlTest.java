package mysql_test_example;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.Rule;
import org.junit.Test;
import org.zapodot.junit.db.EmbeddedDatabaseRule;
import org.zapodot.junit.db.common.CompatibilityMode;

public class MysqlTest {
    @Rule
    public final EmbeddedDatabaseRule embeddedDatabaseRule =
            EmbeddedDatabaseRule.builder()
                    .withMode(CompatibilityMode.Oracle)
                    .withInitialSql(
                            "CREATE TABLE Customer(id INTEGER PRIMARY KEY, name VARCHAR(512)); "
                                    + "INSERT INTO CUSTOMER(id, name) VALUES (1, 'John Doe')")
                    .build();

    @Test
    public void testUsingConnectionUrl() throws Exception {
        try (final Connection connection =
                DriverManager.getConnection(embeddedDatabaseRule.getConnectionJdbcUrl())) {
            try (final Statement statement = connection.createStatement();
                    final ResultSet resultSet = statement.executeQuery("SELECT * from CUSTOMER")) {
                assertTrue(resultSet.next());
            }
        }
    }
}
