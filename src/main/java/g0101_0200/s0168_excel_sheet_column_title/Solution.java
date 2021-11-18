package g0101_0200.s0168_excel_sheet_column_title;

public class Solution {
	public String convertToTitle(int columnNumber) {
		String str = "";
		while (columnNumber > 0) {
			str = String.valueOf((char) (--columnNumber % 26 + 'A')) + str;
			columnNumber /= 26;
		}
		return str;
	}
}
