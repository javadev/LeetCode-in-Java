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
                checkRow(
                        resultSet, 1, "ATGCTAGCTAGCTAA", "Human", "TRUE", "TRUE", "FALSE", "FALSE");
                assertThat(resultSet.next(), equalTo(true));
                checkRow(resultSet, 2, "GGGTCAATCATC", "Human", "FALSE", "FALSE", "FALSE", "TRUE");
                assertThat(resultSet.next(), equalTo(true));
                checkRow(
                        resultSet, 3, "ATATATCGTAGCTA", "Human", "FALSE", "FALSE", "TRUE", "FALSE");
                assertThat(resultSet.next(), equalTo(true));
                checkRow(resultSet, 4, "ATGGGGTCATCATAA", "Human", "TRUE", "TRUE", "FALSE", "TRUE");
                assertThat(resultSet.next(), equalTo(true));
                checkRow(resultSet, 5, "TCAGTCAGTCAG", "Human", "FALSE", "FALSE", "FALSE", "FALSE");
                assertThat(resultSet.next(), equalTo(true));
                checkRow(
                        resultSet,
                        6,
                        "ATATCGCGCTAG",
                        "Zebrafish",
                        "FALSE",
                        "TRUE",
                        "TRUE",
                        "FALSE");
                assertThat(resultSet.next(), equalTo(true));
                checkRow(
                        resultSet,
                        7,
                        "CGTATGCGTCGTA",
                        "Zebrafish",
                        "FALSE",
                        "FALSE",
                        "FALSE",
                        "FALSE");
                assertThat(resultSet.next(), equalTo(false));
            }
        }
    }

    private void checkRow(
            ResultSet resultSet,
            int sampleId,
            String dnaSequence,
            String species,
            String hasStart,
            String hasStop,
            String hasAtat,
            String hasGgg)
            throws SQLException {
        assertThat(resultSet.getInt(1), equalTo(sampleId));
        assertThat(resultSet.getNString(2), equalTo(dnaSequence));
        assertThat(resultSet.getNString(3), equalTo(species));
        assertThat(resultSet.getNString(4), equalTo(hasStart));
        assertThat(resultSet.getNString(5), equalTo(hasStop));
        assertThat(resultSet.getNString(6), equalTo(hasAtat));
        assertThat(resultSet.getNString(7), equalTo(hasGgg));
    }
}
