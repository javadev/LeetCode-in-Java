import unittest
import pandas as pd
from pandas.testing import assert_frame_equal

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
   r = pd.DataFrame(students)
   r.dropna(subset='name', inplace=True)
   return r

class TestDropMissingData(unittest.TestCase):

    def test_no_missing_data(self):
        # Input DataFrame with no missing values in the 'name' column
        data = {
            'student_id': [32, 779, 849],
            'name': ['Piper', 'Georgia', 'Willow'],
            'age': [5, 20, 14]
        }
        students = pd.DataFrame(data)
        expected = pd.DataFrame(data)

        result = dropMissingData(students).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

    def test_with_missing_data(self):
        # Input DataFrame with missing values in the 'name' column
        data = {
            'student_id': [32, 217, 779, 849],
            'name': ['Piper', None, 'Georgia', 'Willow'],
            'age': [5, 19, 20, 14]
        }
        students = pd.DataFrame(data)
        
        # Expected output after removing rows with missing 'name'
        expected_data = {
            'student_id': [32, 779, 849],
            'name': ['Piper', 'Georgia', 'Willow'],
            'age': [5, 20, 14]
        }
        expected = pd.DataFrame(expected_data)

        result = dropMissingData(students).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

    def test_empty_dataframe(self):
        # Input: Empty DataFrame
        students = pd.DataFrame(columns=['student_id', 'name', 'age'])
        expected = students.copy()

        result = dropMissingData(students).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

    def test_all_missing_data(self):
        # Input DataFrame where all 'name' values are missing
        data = {
            'student_id': [217, 301],
            'name': [None, None],
            'age': [19, 21]
        }
        students = pd.DataFrame(data)
        
        # Expected: empty DataFrame since all 'name' values are missing
        expected = pd.DataFrame(columns=['student_id', 'name', 'age'])

        result = dropMissingData(students).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected, check_dtype=False)

    def test_single_row_with_missing_name(self):
        # Input DataFrame with a single row and missing 'name'
        data = {
            'student_id': [217],
            'name': [None],
            'age': [19]
        }
        students = pd.DataFrame(data)
        
        # Expected: empty DataFrame since the single row has missing 'name'
        expected = pd.DataFrame(columns=['student_id', 'name', 'age'])

        result = dropMissingData(students).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected, check_dtype=False)

if __name__ == '__main__':
    unittest.main()
