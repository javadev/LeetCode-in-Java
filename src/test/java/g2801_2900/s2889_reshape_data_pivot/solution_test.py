import unittest
import pandas as pd
from pandas.testing import assert_frame_equal

# Method to be tested
def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    result = weather.pivot(index='month', columns='city', values='temperature')
    result.columns.name = None
    return result.reset_index()

# Unit Test Class
class TestPivotTable(unittest.TestCase):
    def test_pivot_table(self):
        # Input DataFrame
        input_data = {
            "city": ["Jacksonville", "Jacksonville", "Jacksonville", "Jacksonville", "Jacksonville",
                     "ElPaso", "ElPaso", "ElPaso", "ElPaso", "ElPaso"],
            "month": ["January", "February", "March", "April", "May",
                      "January", "February", "March", "April", "May"],
            "temperature": [13, 23, 38, 5, 34, 20, 6, 26, 2, 43]
        }
        weather = pd.DataFrame(input_data)
        
        # Expected Output DataFrame
        expected_data = {
            "month": ["April", "February", "January", "March", "May"],
            "ElPaso": [2, 6, 20, 26, 43],
            "Jacksonville": [5, 23, 13, 38, 34]
        }
        expected_df = pd.DataFrame(expected_data)
        
        # Actual Output
        result_df = pivotTable(weather)
        
        # Assert the DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal: {e}")
    
    def test_empty_dataframe(self):
        # Test for an empty input DataFrame
        weather = pd.DataFrame(columns=["city", "month", "temperature"])
        expected_df = pd.DataFrame(columns=["month"])
        
        # Actual Output
        result_df = pivotTable(weather)
        
        # Assert the DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for empty input: {e}")
    
    def test_single_row_dataframe(self):
        # Test for a single row input DataFrame
        input_data = {
            "city": ["ElPaso"],
            "month": ["January"],
            "temperature": [20]
        }
        weather = pd.DataFrame(input_data)
        
        # Expected Output DataFrame
        expected_data = {
            "month": ["January"],
            "ElPaso": [20]
        }
        expected_df = pd.DataFrame(expected_data)
        
        # Actual Output
        result_df = pivotTable(weather)
        
        # Assert the DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for single row input: {e}")

# Run the tests
if __name__ == "__main__":
    unittest.main()
