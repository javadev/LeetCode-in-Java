package g3501_3600.s3586_find_covid_recovery_patients;

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
                "CREATE TABLE patients (patient_id INTEGER, patient_name VARCHAR(255), age INTEGER); "
                        + "INSERT INTO patients (patient_id, patient_name, age) VALUES"
                        + "(1, 'Alice Smith', 28),"
                        + "(2, 'Bob Johnson', 35),"
                        + "(3, 'Carol Davis', 42),"
                        + "(4, 'David Wilson', 31),"
                        + "(5, 'Emma Brown', 29);"
                        + "CREATE TABLE covid_tests (test_id INTEGER, patient_id INTEGER"
                        + ", test_date DATE, result VARCHAR(255)); "
                        + "INSERT INTO covid_tests (test_id, patient_id, test_date, result) VALUES"
                        + "(1, 1, '2023-01-15', 'Positive'),"
                        + "(2, 1, '2023-01-25', 'Negative'),"
                        + "(3, 2, '2023-02-01', 'Positive'),"
                        + "(4, 2, '2023-02-05', 'Inconclusive'),"
                        + "(5, 2, '2023-02-12', 'Negative'),"
                        + "(6, 3, '2023-01-20', 'Negative'),"
                        + "(7, 3, '2023-02-10', 'Positive'),"
                        + "(8, 3, '2023-02-20', 'Negative'),"
                        + "(9, 4, '2023-01-10', 'Positive'),"
                        + "(10, 4, '2023-01-18', 'Positive'),"
                        + "(11, 5, '2023-02-15', 'Negative'),"
                        + "(12, 5, '2023-02-20', 'Negative');")
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
                                                                    + "s3586_find_covid_recovery_patients/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("Alice Smith"));
                assertThat(resultSet.getNString(3), equalTo("28"));
                assertThat(resultSet.getNString(4), equalTo("10"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("3"));
                assertThat(resultSet.getNString(2), equalTo("Carol Davis"));
                assertThat(resultSet.getNString(3), equalTo("42"));
                assertThat(resultSet.getNString(4), equalTo("10"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("Bob Johnson"));
                assertThat(resultSet.getNString(3), equalTo("35"));
                assertThat(resultSet.getNString(4), equalTo("11"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
