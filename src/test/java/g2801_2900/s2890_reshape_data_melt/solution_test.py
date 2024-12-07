import unittest
import pandas as pd
from pandas.testing import assert_frame_equal

def meltTable(report: pd.DataFrame) -> pd.DataFrame:
    return report.melt(id_vars='product', var_name='quarter', value_name='sales')

# Unit Test Class
class TestMeltTable(unittest.TestCase):
    def test_melt_table(self):
        # Input DataFrame
        input_data = {
            "product": ["Umbrella", "SleepingBag"],
            "quarter_1": [417, 800],
            "quarter_2": [224, 936],
            "quarter_3": [379, 93],
            "quarter_4": [611, 875]
        }
        report = pd.DataFrame(input_data)

        # Expected Output DataFrame
        expected_data = {
            "product": ["Umbrella", "SleepingBag", "Umbrella", "SleepingBag", "Umbrella", "SleepingBag", "Umbrella", "SleepingBag"],
            "quarter": ["quarter_1", "quarter_1", "quarter_2", "quarter_2", "quarter_3", "quarter_3", "quarter_4", "quarter_4"],
            "sales": [417, 800, 224, 936, 379, 93, 611, 875]
        }
        expected_df = pd.DataFrame(expected_data)

        # Actual Output
        result_df = meltTable(report)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal: {e}")

    def test_empty_dataframe(self):
        # Test with an empty DataFrame
        report = pd.DataFrame(columns=["product", "quarter_1", "quarter_2", "quarter_3", "quarter_4"])
        expected_df = pd.DataFrame(columns=["product", "quarter", "sales"])

        # Actual Output
        result_df = meltTable(report)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for empty input: {e}")

    def test_single_row_dataframe(self):
        # Test with a single row DataFrame
        input_data = {
            "product": ["Umbrella"],
            "quarter_1": [417],
            "quarter_2": [224],
            "quarter_3": [379],
            "quarter_4": [611]
        }
        report = pd.DataFrame(input_data)

        # Expected Output DataFrame
        expected_data = {
            "product": ["Umbrella", "Umbrella", "Umbrella", "Umbrella"],
            "quarter": ["quarter_1", "quarter_2", "quarter_3", "quarter_4"],
            "sales": [417, 224, 379, 611]
        }
        expected_df = pd.DataFrame(expected_data)

        # Actual Output
        result_df = meltTable(report)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for single row input: {e}")

# Run the tests
if __name__ == "__main__":
    unittest.main()
