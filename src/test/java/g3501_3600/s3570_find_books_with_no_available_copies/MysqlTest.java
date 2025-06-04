package g3501_3600.s3570_find_books_with_no_available_copies;

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
                "CREATE TABLE library_books(book_id INTEGER, title VARCHAR(255)"
                        + ", author VARCHAR(255), genre VARCHAR(255), publication_year "
                        + "INTEGER, total_copies INTEGER); "
                        + "INSERT INTO library_books (book_id, title, author, genre, "
                        + "publication_year, total_copies) VALUES "
                        + "(1, 'The Great Gatsby',      'F. Scott',       'Fiction',   1925, 3),"
                        + "(2, 'To Kill a Mockingbird', 'Harper Lee',     'Fiction',   1960, 3),"
                        + "(3, '1984',                  'George Orwell',  'Dystopian', 1949, 1),"
                        + "(4, 'Pride and Prejudice',   'Jane Austen',    'Romance',   1813, 2),"
                        + "(5, 'The Catcher in the Rye','J.D. Salinger',  'Fiction',   1951, 1),"
                        + "(6, 'Brave New World',       'Aldous Huxley',  'Dystopian', 1932, 4);"
                        + "CREATE TABLE borrowing_records(record_id INTEGER, book_id INTEGER"
                        + ", borrower_name VARCHAR(255), borrow_date DATE, return_date DATE); "
                        + "INSERT INTO borrowing_records(record_id, book_id, borrower_name, "
                        + "borrow_date, return_date) VALUES "
                        + "(1, 1, 'Alice Smith',  '2024-01-15', NULL),"
                        + "(2, 1, 'Bob Johnson',  '2024-01-20', NULL),"
                        + "(3, 2, 'Carol White',  '2024-01-10', '2024-01-25'),"
                        + "(4, 3, 'David Brown',  '2024-02-01', NULL),"
                        + "(5, 4, 'Emma Wilson',  '2024-01-05', NULL),"
                        + "(6, 5, 'Frank Davis',  '2024-01-18', '2024-02-10'),"
                        + "(7, 1, 'Grace Miller', '2024-02-05', NULL),"
                        + "(8, 6, 'Henry Taylor', '2024-01-12', NULL),"
                        + "(9, 2, 'Ivan Clark',   '2024-02-12', NULL),"
                        + "(10,2, 'Jane Adams',   '2024-02-15', NULL);")
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
                                                                    + "s3570_find_books_with_no_available_copies/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("The Great Gatsby"));
                assertThat(resultSet.getNString(3), equalTo("F. Scott"));
                assertThat(resultSet.getNString(4), equalTo("Fiction"));
                assertThat(resultSet.getNString(5), equalTo("1925"));
                assertThat(resultSet.getNString(6), equalTo("3"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("3"));
                assertThat(resultSet.getNString(2), equalTo("1984"));
                assertThat(resultSet.getNString(3), equalTo("George Orwell"));
                assertThat(resultSet.getNString(4), equalTo("Dystopian"));
                assertThat(resultSet.getNString(5), equalTo("1949"));
                assertThat(resultSet.getNString(6), equalTo("1"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
