package g3401_3500.s3475_dna_pattern_recognition;

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
                "    CREATE TABLE Samples ("
                        + "    sample_id INT,"
                        + "    dna_sequence VARCHAR(100),"
                        + "    species VARCHAR(100)"
                        + ");"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(1, 'ATGCTAGCTAGCTAA', 'Human');"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(2, 'GGGTCAATCATC', 'Human');"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(3, 'ATATATCGTAGCTA', 'Human');"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(4, 'ATGGGGTCATCATAA', 'Human');"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(5, 'TCAGTCAGTCAG', 'Human');"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(6, 'ATATCGCGCTAG', 'Zebrafish');"
                        + "insert into Samples (sample_id, dna_sequence, species) values "
                        + "(7, 'CGTATGCGTCGTA', 'Zebrafish');")
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
                                                                    + "s3475_dna_pattern_recognition/"
                                                                    + "script.sql"))
                                            .lines()
                                            .collect(Collectors.joining("\n"))
                                            .replaceAll("#.*?\\r?\\n", ""))) {
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("1"));
                assertThat(resultSet.getNString(2), equalTo("ATGCTAGCTAGCTAA"));
                assertThat(resultSet.getNString(3), equalTo("Human"));
                assertThat(resultSet.getNString(4), equalTo("TRUE"));
                assertThat(resultSet.getNString(5), equalTo("TRUE"));
                assertThat(resultSet.getNString(6), equalTo("FALSE"));
                assertThat(resultSet.getNString(7), equalTo("FALSE"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("2"));
                assertThat(resultSet.getNString(2), equalTo("GGGTCAATCATC"));
                assertThat(resultSet.getNString(3), equalTo("Human"));
                assertThat(resultSet.getNString(4), equalTo("FALSE"));
                assertThat(resultSet.getNString(5), equalTo("FALSE"));
                assertThat(resultSet.getNString(6), equalTo("FALSE"));
                assertThat(resultSet.getNString(7), equalTo("TRUE"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("3"));
                assertThat(resultSet.getNString(2), equalTo("ATATATCGTAGCTA"));
                assertThat(resultSet.getNString(3), equalTo("Human"));
                assertThat(resultSet.getNString(4), equalTo("FALSE"));
                assertThat(resultSet.getNString(5), equalTo("FALSE"));
                assertThat(resultSet.getNString(6), equalTo("TRUE"));
                assertThat(resultSet.getNString(7), equalTo("FALSE"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("4"));
                assertThat(resultSet.getNString(2), equalTo("ATGGGGTCATCATAA"));
                assertThat(resultSet.getNString(3), equalTo("Human"));
                assertThat(resultSet.getNString(4), equalTo("TRUE"));
                assertThat(resultSet.getNString(5), equalTo("TRUE"));
                assertThat(resultSet.getNString(6), equalTo("FALSE"));
                assertThat(resultSet.getNString(7), equalTo("TRUE"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("5"));
                assertThat(resultSet.getNString(2), equalTo("TCAGTCAGTCAG"));
                assertThat(resultSet.getNString(3), equalTo("Human"));
                assertThat(resultSet.getNString(4), equalTo("FALSE"));
                assertThat(resultSet.getNString(5), equalTo("FALSE"));
                assertThat(resultSet.getNString(6), equalTo("FALSE"));
                assertThat(resultSet.getNString(7), equalTo("FALSE"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("6"));
                assertThat(resultSet.getNString(2), equalTo("ATATCGCGCTAG"));
                assertThat(resultSet.getNString(3), equalTo("Zebrafish"));
                assertThat(resultSet.getNString(4), equalTo("FALSE"));
                assertThat(resultSet.getNString(5), equalTo("TRUE"));
                assertThat(resultSet.getNString(6), equalTo("TRUE"));
                assertThat(resultSet.getNString(7), equalTo("FALSE"));
                assertThat(resultSet.next(), equalTo(true));
                assertThat(resultSet.getNString(1), equalTo("7"));
                assertThat(resultSet.getNString(2), equalTo("CGTATGCGTCGTA"));
                assertThat(resultSet.getNString(3), equalTo("Zebrafish"));
                assertThat(resultSet.getNString(4), equalTo("FALSE"));
                assertThat(resultSet.getNString(5), equalTo("FALSE"));
                assertThat(resultSet.getNString(6), equalTo("FALSE"));
                assertThat(resultSet.getNString(7), equalTo("FALSE"));
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }
}
