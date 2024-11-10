import pandas as pd
import unittest

# The function to be tested
def renameColumns(students: pd.DataFrame) -> pd.DataFrame:
    students.rename(columns={'id': 'student_id', 'first': 'first_name', 'last': 'last_name', 'age': 'age_in_years'}, inplace=True)
    return students

# Test class
class TestRenameColumns(unittest.TestCase):

    def test_rename_columns_basic_case(self):
        # Input DataFrame
        students = pd.DataFrame({
            'id': [1, 2, 3, 4, 5],
            'first': ['Mason', 'Ava', 'Taylor', 'Georgia', 'Thomas'],
            'last': ['King', 'Wright', 'Hall', 'Thompson', 'Moore'],
            'age': [6, 7, 16, 18, 10]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'student_id': [1, 2, 3, 4, 5],
            'first_name': ['Mason', 'Ava', 'Taylor', 'Georgia', 'Thomas'],
            'last_name': ['King', 'Wright', 'Hall', 'Thompson', 'Moore'],
            'age_in_years': [6, 7, 16, 18, 10]
        })
        
        # Call the function and assert equality
        result = renameColumns(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_rename_columns_empty_dataframe(self):
        # Input: Empty DataFrame with the correct column names
        students = pd.DataFrame(columns=['id', 'first', 'last', 'age'])
        
        # Expected output: Empty DataFrame with renamed columns
        expected_output = pd.DataFrame(columns=['student_id', 'first_name', 'last_name', 'age_in_years'])
        
        # Call the function and assert equality
        result = renameColumns(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_rename_columns_single_row(self):
        # Input DataFrame with a single row
        students = pd.DataFrame({
            'id': [10],
            'first': ['Emma'],
            'last': ['Johnson'],
            'age': [15]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'student_id': [10],
            'first_name': ['Emma'],
            'last_name': ['Johnson'],
            'age_in_years': [15]
        })
        
        # Call the function and assert equality
        result = renameColumns(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_rename_columns_with_different_ages(self):
        # Input DataFrame with various ages
        students = pd.DataFrame({
            'id': [101, 102],
            'first': ['Liam', 'Olivia'],
            'last': ['Brown', 'Davis'],
            'age': [21, 30]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'student_id': [101, 102],
            'first_name': ['Liam', 'Olivia'],
            'last_name': ['Brown', 'Davis'],
            'age_in_years': [21, 30]
        })
        
        # Call the function and assert equality
        result = renameColumns(students)
        pd.testing.assert_frame_equal(result, expected_output)

# Run the tests
if __name__ == '__main__':
    unittest.main()
