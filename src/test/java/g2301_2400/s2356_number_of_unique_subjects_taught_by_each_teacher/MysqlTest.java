package g2301_2400.s2356_number_of_unique_subjects_taught_by_each_teacher;

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
                "CREATE TABLE Teacher(teacher_id INTEGER, subject_id INTEGER"
                        + ", dept_id INTEGER); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (1, 2, 3); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (1, 2, 4); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (1, 3, 3); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (2, 1, 1); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (2, 2, 1); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (2, 3, 1); "
                        + "INSERT INTO Teacher(teacher_id, subject_id, dept_id)"
                        + " VALUES (2, 4, 1); ")
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
                                                            "src/main/java/g2301_2400/s2356_number_of"
                                                                    + "_unique_subjects_taught_by_each"
                                                                    + "_teacher/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getInt(2), equalTo(2));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(2));
                assertThat(resultSet.getInt(2), equalTo(4));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
