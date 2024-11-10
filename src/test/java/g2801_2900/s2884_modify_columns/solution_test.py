import pandas as pd
import unittest

# The function to be tested
def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['salary'] = employees['salary'] * 2
    return employees

# Test class
class TestDropMissingData(unittest.TestCase):

    def test_modify_salary_column_basic_case(self):
        # Input DataFrame
        employees = pd.DataFrame({
            'name': ['Jack', 'Piper', 'Mia', 'Ulysses'],
            'salary': [19666, 74754, 62509, 54866]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'name': ['Jack', 'Piper', 'Mia', 'Ulysses'],
            'salary': [39332, 149508, 125018, 109732]
        })
        
        # Call the function and assert equality
        result = modifySalaryColumn(employees)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_modify_salary_column_empty_dataframe(self):
        # Input: Empty DataFrame
        employees = pd.DataFrame(columns=['name', 'salary'])
        
        # Expected output: Empty DataFrame
        expected_output = pd.DataFrame(columns=['name', 'salary'])
        
        # Call the function and assert equality
        result = modifySalaryColumn(employees)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_modify_salary_column_single_row(self):
        # Input DataFrame with a single row
        employees = pd.DataFrame({
            'name': ['Alice'],
            'salary': [50000]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'name': ['Alice'],
            'salary': [100000]
        })
        
        # Call the function and assert equality
        result = modifySalaryColumn(employees)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_modify_salary_column_zero_salary(self):
        # Input DataFrame with a zero salary
        employees = pd.DataFrame({
            'name': ['Bob'],
            'salary': [0]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'name': ['Bob'],
            'salary': [0]
        })
        
        # Call the function and assert equality
        result = modifySalaryColumn(employees)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_modify_salary_column_negative_salary(self):
        # Input DataFrame with a negative salary
        employees = pd.DataFrame({
            'name': ['Charlie'],
            'salary': [-30000]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'name': ['Charlie'],
            'salary': [-60000]
        })
        
        # Call the function and assert equality
        result = modifySalaryColumn(employees)
        pd.testing.assert_frame_equal(result, expected_output)

# Run the tests
if __name__ == '__main__':
    unittest.main()
