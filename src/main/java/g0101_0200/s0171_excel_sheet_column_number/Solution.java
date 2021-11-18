package g0101_0200.s0171_excel_sheet_column_number;

public class Solution {
	 public int titleToNumber(String s) {
	        int num = 0;
	        int pow= 0;
	        for(int i=s.length()-1; i>=0; i--){
	            num += Math.pow(26,pow++) * (int)(s.charAt(i)-'A'+1);
	        }
	        return num;
	    }
}
