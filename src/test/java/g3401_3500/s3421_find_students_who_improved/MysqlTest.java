package g3401_3500.s3421_find_students_who_improved;

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
                "    CREATE TABLE Scores ("
                        + "    student_id INT,"
                        + "    subject VARCHAR(50),"
                        + "    score INT,"
                        + "    exam_date VARCHAR(10)"
                        + ");"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('101', 'Math', '70', '15-01-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('101', 'Math', '85', '15-02-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('101', 'Physics', '65', '15-01-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('101', 'Physics', '60', '15-02-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('102', 'Math', '80', '15-01-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('102', 'Math', '85', '15-02-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('103', 'Math', '90', '15-01-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('104', 'Physics', '75', '15-01-2023');"
                        + "insert into Scores (student_id, subject, score, exam_date) values "
                        + "('104', 'Physics', '85', '15-02-2023');")
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
                                                            "src/main/java/g3401_3500/"
                                                                    + "s3421_find_students_who_improved/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("101"));
                assertThat(resultSet.getNString(2), equalTo("Math"));
                assertThat(resultSet.getNString(3), equalTo("70"));
                assertThat(resultSet.getNString(4), equalTo("85"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("102"));
                assertThat(resultSet.getNString(2), equalTo("Math"));
                assertThat(resultSet.getNString(3), equalTo("80"));
                assertThat(resultSet.getNString(4), equalTo("85"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("104"));
                assertThat(resultSet.getNString(2), equalTo("Physics"));
                assertThat(resultSet.getNString(3), equalTo("75"));
                assertThat(resultSet.getNString(4), equalTo("85"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
