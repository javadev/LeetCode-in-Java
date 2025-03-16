package g3401_3500.s3484_design_spreadsheet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SpreadsheetTest {
    @Test
    void spreadsheet() {
        // Initializes a spreadsheet with 3 rows and 26 columns
        Spreadsheet spreadsheet = new Spreadsheet(3);
        // returns 12 (5+7)
        assertThat(spreadsheet.getValue("=5+7"), equalTo(12));
        // sets A1 to 10
        spreadsheet.setCell("A1", 10);
        // returns 16 (10+6)
        assertThat(spreadsheet.getValue("=A1+6"), equalTo(16));
        // sets B2 to 15
        spreadsheet.setCell("B2", 15);
        // returns 25 (10+15)
        assertThat(spreadsheet.getValue("=A1+B2"), equalTo(25));
        // resets A1 to 0
        spreadsheet.resetCell("A1");
        // returns 15 (0+15)
        assertThat(spreadsheet.getValue("=A1+B2"), equalTo(15));
    }
}
