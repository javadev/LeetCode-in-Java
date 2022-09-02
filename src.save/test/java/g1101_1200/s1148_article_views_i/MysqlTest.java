package g1101_1200.s1148_article_views_i;

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
                "CREATE TABLE views(article_id INTEGER, author_id INTEGER"
                        + ", viewer_id INTEGER, view_date DATE); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (1, 3, 5, '2019-08-01'); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (1, 3, 6, '2019-08-02'); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (2, 7, 7, '2019-08-01'); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (2, 7, 6, '2019-08-02'); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (4, 7, 1, '2019-07-22'); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (3, 4, 4, '2019-07-21'); "
                        + "INSERT INTO views(article_id, author_id, viewer_id, view_date)"
                        + " VALUES (3, 4, 4, '2019-07-21'); ")
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
                                                            "src/main/java/g1101_1200/s1148"
                                                                    + "_article_views_i/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(4));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(7));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
