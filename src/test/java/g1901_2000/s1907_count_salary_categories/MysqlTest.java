package g1901_2000.s1907_count_salary_categories;

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
                "CREATE TABLE Accounts(account_id INTEGER, income INTEGER); "
                        + "INSERT INTO Accounts(account_id, income)"
                        + " VALUES (3, 108939); "
                        + "INSERT INTO Accounts(account_id, income)"
                        + " VALUES (2, 12747); "
                        + "INSERT INTO Accounts(account_id, income)"
                        + " VALUES (8, 87709); "
                        + "INSERT INTO Accounts(account_id, income)"
                        + " VALUES (6, 91796); ")
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
                                                            "src/main/java/g1901_2000/s1907_count_"
                                                                    + "salary_categories/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Average Salary"));
                assertThat(resultSet.getInt(2), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("High Salary"));
                assertThat(resultSet.getInt(2), equalTo(3));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Low Salary"));
                assertThat(resultSet.getInt(2), equalTo(1));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
