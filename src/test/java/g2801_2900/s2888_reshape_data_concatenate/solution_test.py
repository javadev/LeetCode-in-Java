import unittest
import pandas as pd
from pandas.testing import assert_frame_equal

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1, df2], ignore_index=True)

class TestConcatenateTables(unittest.TestCase):
    def test_concatenate_normal_case(self):
        # Input DataFrames
        df1 = pd.DataFrame({
            "student_id": [1, 2, 3, 4],
            "name": ["Mason", "Ava", "Taylor", "Georgia"],
            "age": [8, 6, 15, 17]
        })
        df2 = pd.DataFrame({
            "student_id": [5, 6],
            "name": ["Leo", "Alex"],
            "age": [7, 7]
        })

        # Expected Output
        expected = pd.DataFrame({
            "student_id": [1, 2, 3, 4, 5, 6],
            "name": ["Mason", "Ava", "Taylor", "Georgia", "Leo", "Alex"],
            "age": [8, 6, 15, 17, 7, 7]
        })

        # Actual Output
        result = concatenateTables(df1, df2)

        # Assert the result matches the expected DataFrame
        try:
            assert_frame_equal(result, expected)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal: {e}")

    def test_concatenate_empty_df1(self):
        # Input DataFrames
        df1 = pd.DataFrame(columns=["student_id", "name", "age"]).astype({
            "student_id": "int64",
            "name": "object",
            "age": "int64"
        })
        
        df2 = pd.DataFrame({
            "student_id": [5, 6],
            "name": ["Leo", "Alex"],
            "age": [7, 7]
        })
    
        # Expected Output
        expected = pd.DataFrame({
            "student_id": [5, 6],
            "name": ["Leo", "Alex"],
            "age": [7, 7]
        })
    
        # Actual Output
        result = concatenateTables(df1, df2)
    
        # Assert the result matches the expected DataFrame
        try:
            assert_frame_equal(result, expected)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal when df1 is empty: {e}")

    def test_concatenate_empty_df2(self):
        # Input DataFrames
        df1 = pd.DataFrame({
            "student_id": [1, 2, 3, 4],
            "name": ["Mason", "Ava", "Taylor", "Georgia"],
            "age": [8, 6, 15, 17]
        })
        df2 = pd.DataFrame(columns=["student_id", "name", "age"]).astype({
            "student_id": "int64",
            "name": "object",
            "age": "int64"
        })

        # Expected Output
        expected = df1

        # Actual Output
        result = concatenateTables(df1, df2)

        # Assert the result matches the expected DataFrame
        try:
            assert_frame_equal(result, expected)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal when df2 is empty: {e}")

    def test_concatenate_both_empty(self):
        # Input DataFrames
        df1 = pd.DataFrame(columns=["student_id", "name", "age"])
        df2 = pd.DataFrame(columns=["student_id", "name", "age"])

        # Expected Output
        expected = pd.DataFrame(columns=["student_id", "name", "age"])

        # Actual Output
        result = concatenateTables(df1, df2)

        # Assert the result matches the expected DataFrame
        try:
            assert_frame_equal(result, expected)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal when both are empty: {e}")

    def test_concatenate_different_column_order(self):
        # Input DataFrames
        df1 = pd.DataFrame({
            "student_id": [1, 2],
            "name": ["Mason", "Ava"],
            "age": [8, 6]
        })
        df2 = pd.DataFrame({
            "name": ["Leo", "Alex"],
            "age": [7, 7],
            "student_id": [5, 6]
        })

        # Expected Output
        expected = pd.DataFrame({
            "student_id": [1, 2, 5, 6],
            "name": ["Mason", "Ava", "Leo", "Alex"],
            "age": [8, 6, 7, 7]
        })

        # Actual Output
        result = concatenateTables(df1, df2)

        # Assert the result matches the expected DataFrame
        try:
            assert_frame_equal(result, expected)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal when columns are in different orders: {e}")

# Run the tests
if __name__ == "__main__":
    unittest.main()
