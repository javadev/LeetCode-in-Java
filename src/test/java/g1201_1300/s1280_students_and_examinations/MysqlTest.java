package g1201_1300.s1280_students_and_examinations;

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
                "CREATE TABLE Students(student_id INTEGER, student_name VARCHAR); "
                        + "INSERT INTO Students(student_id, student_name)"
                        + " VALUES (1, 'Alice'); "
                        + "INSERT INTO Students(student_id, student_name)"
                        + " VALUES (2, 'Bob'); "
                        + "INSERT INTO Students(student_id, student_name)"
                        + " VALUES (13, 'John'); "
                        + "INSERT INTO Students(student_id, student_name)"
                        + " VALUES (6, 'Alex'); "
                        + "CREATE TABLE Subjects(subject_name VARCHAR); "
                        + "INSERT INTO Subjects(subject_name)"
                        + " VALUES ('Math'); "
                        + "INSERT INTO Subjects(subject_name)"
                        + " VALUES ('Physics'); "
                        + "INSERT INTO Subjects(subject_name)"
                        + " VALUES ('Programming'); "
                        + "CREATE TABLE Examinations(student_id INTEGER, subject_name VARCHAR); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (1, 'Math'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (1, 'Physics'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (1, 'Programming'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (2, 'Programming'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (1, 'Physics'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (1, 'Math'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (13, 'Math'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (13, 'Programming'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (13, 'Physics'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (2, 'Math'); "
                        + "INSERT INTO Examinations(student_id, subject_name)"
                        + " VALUES (1, 'Math'); ")
@SuppressWarnings("java:S5961")
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
                                                                    + "s1280_students_and_examinations/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("Alice"));
                assertThat(resultSet.getNString(3), equalTo("Math"));
                assertThat(resultSet.getInt(4), equalTo(3));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("Alice"));
                assertThat(resultSet.getNString(3), equalTo("Physics"));
                assertThat(resultSet.getInt(4), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("Alice"));
                assertThat(resultSet.getNString(3), equalTo("Programming"));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getNString(2), equalTo("Bob"));
                assertThat(resultSet.getNString(3), equalTo("Math"));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getNString(2), equalTo("Bob"));
                assertThat(resultSet.getNString(3), equalTo("Physics"));
                assertThat(resultSet.getInt(4), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getNString(2), equalTo("Bob"));
                assertThat(resultSet.getNString(3), equalTo("Programming"));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.getNString(2), equalTo("Alex"));
                assertThat(resultSet.getNString(3), equalTo("Math"));
                assertThat(resultSet.getInt(4), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.getNString(2), equalTo("Alex"));
                assertThat(resultSet.getNString(3), equalTo("Physics"));
                assertThat(resultSet.getInt(4), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(6));
                assertThat(resultSet.getNString(2), equalTo("Alex"));
                assertThat(resultSet.getNString(3), equalTo("Programming"));
                assertThat(resultSet.getInt(4), equalTo(0));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(13));
                assertThat(resultSet.getNString(2), equalTo("John"));
                assertThat(resultSet.getNString(3), equalTo("Math"));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(13));
                assertThat(resultSet.getNString(2), equalTo("John"));
                assertThat(resultSet.getNString(3), equalTo("Physics"));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(13));
                assertThat(resultSet.getNString(2), equalTo("John"));
                assertThat(resultSet.getNString(3), equalTo("Programming"));
                assertThat(resultSet.getInt(4), equalTo(1));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
