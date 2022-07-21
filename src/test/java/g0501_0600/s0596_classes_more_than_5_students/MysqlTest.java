package g0501_0600.s0596_classes_more_than_5_students;

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
                "CREATE TABLE Courses(student VARCHAR, class VARCHAR); "
                        + "INSERT INTO Courses(student, class) VALUES ('A', 'Math'); "
                        + "INSERT INTO Courses(student, class) VALUES ('B', 'English'); "
                        + "INSERT INTO Courses(student, class) VALUES ('C', 'Math'); "
                        + "INSERT INTO Courses(student, class) VALUES ('D', 'Biology'); "
                        + "INSERT INTO Courses(student, class) VALUES ('E', 'Math'); "
                        + "INSERT INTO Courses(student, class) VALUES ('F', 'Computer'); "
                        + "INSERT INTO Courses(student, class) VALUES ('G', 'Math'); "
                        + "INSERT INTO Courses(student, class) VALUES ('H', 'Math'); "
                        + "INSERT INTO Courses(student, class) VALUES ('I', 'Math'); ")
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
                                                            "src/main/java/g0501_0600/"
                                                                    + "s0596_classes_more"
                                                                    + "_than_5_students"
                                                                    + "/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("Math"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
