package g1201_1300.s1211_queries_quality_and_percentage;

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
                "CREATE TABLE Queries(query_name VARCHAR, result VARCHAR, position INTEGER, rating INTEGER); "
                        + "INSERT INTO Queries(query_name, result, position, rating)"
                        + " VALUES ('Dog', 'Golden Retriever', 1, 5); "
                        + "INSERT INTO Queries(query_name, result, position, rating)"
                        + " VALUES ('Dog', 'German Shepherd', 2, 5); "
                        + "INSERT INTO Queries(query_name, result, position, rating)"
                        + " VALUES ('Dog', 'Mule', 200, 1); "
                        + "INSERT INTO Queries(query_name, result, position, rating)"
                        + " VALUES ('Cat', 'Shirazi', 5, 2); "
                        + "INSERT INTO Queries(query_name, result, position, rating)"
                        + " VALUES ('Cat', 'Siamese', 3, 3); "
                        + "INSERT INTO Queries(query_name, result, position, rating)"
                        + " VALUES ('Cat', 'Sphynx', 7, 4); ")
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
                                                            "src/main/java/g1201_1300/"
                                                                    + "s1211_queries_quality_and_percentage"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Cat"));
                assertThat(resultSet.getDouble(2), equalTo(0.33));
                assertThat(resultSet.getDouble(3), equalTo(33.33));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Dog"));
                assertThat(resultSet.getDouble(2), equalTo(2.33));
                assertThat(resultSet.getDouble(3), equalTo(33.33));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
