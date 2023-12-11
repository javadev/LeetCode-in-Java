package g1501_1600.s1517_find_users_with_valid_e_mails;

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
                "CREATE TABLE Users(user_id INTEGER PRIMARY KEY, name"
                        + " VARCHAR, mail VARCHAR); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (1, 'Winston', 'winston@leetcode.com'); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (2, 'Jonathan', 'jonathanisgreat'); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (3, 'Annabelle', 'bella-@leetcode.com'); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (4, 'Sally', 'sally.come@leetcode.com'); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (5, 'Marwan', 'quarz#2020@leetcode.com'); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (6, 'David', 'david69@gmail.com'); "
                        + "INSERT INTO Users(user_id, name, mail)"
                        + " VALUES (7, 'Shapiro', '.shapo@leetcode.com'); ")
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
                                                            "src/main/java/g1501_1600/"
                                                                    + "s1517_find_users_with_valid_e_mails/script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(1));
                assertThat(resultSet.getNString(2), equalTo("Winston"));
                assertThat(resultSet.getNString(3), equalTo("winston@leetcode.com"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(3));
                assertThat(resultSet.getNString(2), equalTo("Annabelle"));
                assertThat(resultSet.getNString(3), equalTo("bella-@leetcode.com"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getInt(1), equalTo(4));
                assertThat(resultSet.getNString(2), equalTo("Sally"));
                assertThat(resultSet.getNString(3), equalTo("sally.come@leetcode.com"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
