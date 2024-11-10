import pandas as pd
import unittest

# The function to be tested
def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    students['grade'] = students['grade'].astype('int64')
    return students

# Test class
class TestChangeDatatype(unittest.TestCase):

    def test_change_datatype_basic_case(self):
        # Input DataFrame
        students = pd.DataFrame({
            'student_id': [1, 2],
            'name': ['Ava', 'Kate'],
            'age': [6, 15],
            'grade': [73.0, 87.0]
        })
        
        # Expected output DataFrame with grade explicitly set as int64
        expected_output = pd.DataFrame({
            'student_id': [1, 2],
            'name': ['Ava', 'Kate'],
            'age': [6, 15],
            'grade': [73, 87]
        })
        expected_output['grade'] = expected_output['grade'].astype('int64')
        
        # Call the function and assert equality
        result = changeDatatype(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_change_datatype_empty_dataframe(self):
        # Input: Empty DataFrame with the correct columns
        students = pd.DataFrame(columns=['student_id', 'name', 'age', 'grade'])
        
        # Expected output: Empty DataFrame with the same columns and grade set to Int64 dtype
        expected_output = pd.DataFrame(columns=['student_id', 'name', 'age', 'grade'])
        expected_output['grade'] = expected_output['grade'].astype('int64')
        
        # Call the function and assert equality
        result = changeDatatype(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_change_datatype_with_negative_grades(self):
        # Input DataFrame with negative grades
        students = pd.DataFrame({
            'student_id': [3, 4],
            'name': ['Liam', 'Olivia'],
            'age': [12, 10],
            'grade': [-45.0, -88.0]
        })
        
        # Expected output DataFrame with grades as integers
        expected_output = pd.DataFrame({
            'student_id': [3, 4],
            'name': ['Liam', 'Olivia'],
            'age': [12, 10],
            'grade': [-45, -88]
        })
        expected_output['grade'] = expected_output['grade'].astype('int64')
        
        # Call the function and assert equality
        result = changeDatatype(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_change_datatype_with_decimal_grades(self):
        # Input DataFrame with decimal grades that will truncate
        students = pd.DataFrame({
            'student_id': [5, 6],
            'name': ['Ella', 'Noah'],
            'age': [14, 17],
            'grade': [95.6, 78.9]
        })
        
        # Expected output DataFrame with truncated grades as integers
        expected_output = pd.DataFrame({
            'student_id': [5, 6],
            'name': ['Ella', 'Noah'],
            'age': [14, 17],
            'grade': [95, 78]
        })
        expected_output['grade'] = expected_output['grade'].astype('int64')
        
        # Call the function and assert equality
        result = changeDatatype(students)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_change_datatype_single_row(self):
        # Input DataFrame with a single row
        students = pd.DataFrame({
            'student_id': [7],
            'name': ['James'],
            'age': [11],
            'grade': [80.0]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'student_id': [7],
            'name': ['James'],
            'age': [11],
            'grade': [80]
        })
        expected_output['grade'] = expected_output['grade'].astype('int64')
        
        # Call the function and assert equality
        result = changeDatatype(students)
        pd.testing.assert_frame_equal(result, expected_output)

# Run the tests
if __name__ == '__main__':
    unittest.main()
