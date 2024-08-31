import unittest
import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    return students[students.student_id == 101][['name', 'age']]

class TestSelectData(unittest.TestCase):
    def test_example_case(self):
        # Example DataFrame
        data = {
            "student_id": [101, 53, 128, 3],
            "name": ["Ulysses", "William", "Henry", "Henry"],
            "age": [13, 10, 6, 11]
        }
        students = pd.DataFrame(data)
        
        # Expected output DataFrame with explicit data types
        expected_data = {
            "name": pd.Series(["Ulysses"], dtype="object"),
            "age": pd.Series([13], dtype="int64")
        }
        expected_output = pd.DataFrame(expected_data)
        
        pd.testing.assert_frame_equal(selectData(students), expected_output, check_dtype=False)
    
    def test_no_matching_id(self):
        # DataFrame with no matching student_id = 101
        data = {
            "student_id": [102, 53, 128, 3],
            "name": ["John", "William", "Henry", "Doe"],
            "age": [12, 10, 6, 11]
        }
        students = pd.DataFrame(data)
        
        # Expected output: Empty DataFrame with columns ['name', 'age']
        expected_output = pd.DataFrame(columns=['name', 'age'])
        
        pd.testing.assert_frame_equal(selectData(students), expected_output, check_dtype=False)
    
    def test_multiple_students_with_101(self):
        # DataFrame with multiple students having student_id = 101
        data = {
            "student_id": [101, 101, 128],
            "name": ["Alice", "Bob", "Charlie"],
            "age": [20, 21, 22]
        }
        students = pd.DataFrame(data)
        
        # Expected output: DataFrame with both rows where student_id = 101
        expected_data = {
            "name": ["Alice", "Bob"],
            "age": [20, 21]
        }
        expected_output = pd.DataFrame(expected_data)
        
        pd.testing.assert_frame_equal(selectData(students), expected_output, check_dtype=False)
    
    def test_empty_dataframe(self):
        # Empty DataFrame with the same structure
        students = pd.DataFrame(columns=["student_id", "name", "age"])
        
        # Expected output: Empty DataFrame with columns ['name', 'age']
        expected_output = pd.DataFrame(columns=['name', 'age'])
        
        pd.testing.assert_frame_equal(selectData(students), expected_output, check_dtype=False)

if __name__ == "__main__":
    unittest.main()
