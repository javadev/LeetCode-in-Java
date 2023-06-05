package g1001_1100.s1045_customers_who_bought_all_products

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.zapodot.junit.db.annotations.EmbeddedDatabase
import org.zapodot.junit.db.annotations.EmbeddedDatabaseTest
import org.zapodot.junit.db.common.CompatibilityMode
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.sql.SQLException
import java.util.stream.Collectors
import javax.sql.DataSource

@EmbeddedDatabaseTest(
    compatibilityMode = CompatibilityMode.MySQL,
    initialSqls = [
        "CREATE TABLE Customer(customer_id INTEGER, product_key INTEGER); " +
            " INSERT INTO Customer(customer_id, product_key) VALUES (1, 5); " +
            " INSERT INTO Customer(customer_id, product_key) VALUES (2, 6); " +
            " INSERT INTO Customer(customer_id, product_key) VALUES (3, 5); " +
            " INSERT INTO Customer(customer_id, product_key) VALUES (3, 6); " +
            " INSERT INTO Customer(customer_id, product_key) VALUES (1, 6); " +
            "CREATE TABLE Product(product_key INTEGER); " +
            " INSERT INTO Product(product_key) VALUES (5); " +
            " INSERT INTO Product(product_key) VALUES (6); "
    ]
)
internal class MysqlTest {
    @Test
    @Throws(SQLException::class, FileNotFoundException::class)
    fun testScript(@EmbeddedDatabase dataSource: DataSource) {
        dataSource.connection.use { connection ->
            connection.createStatement().use { statement ->
                statement.executeQuery(
                    BufferedReader(
                        FileReader(
                            "src/main/kotlin/g1001_1100/" +
                                "s1045_customers_who_bought_all_products" +
                                "/script.sql"
                        )
                    )
                        .lines()
                        .collect(Collectors.joining("\n"))
                        .replace("#.*?\\r?\\n".toRegex(), "")
                ).use { resultSet ->
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(1))
                    assertThat(resultSet.next(), equalTo(true))
                    assertThat(resultSet.getInt(1), equalTo(3))
                    assertThat(resultSet.next(), equalTo(false))
                }
            }
        }
    }
}
