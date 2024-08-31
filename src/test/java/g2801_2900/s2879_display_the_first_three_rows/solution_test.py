import unittest
import pandas as pd

def selectFirstRows(zs: pd.DataFrame) -> pd.DataFrame:
    return zs.head(3)

class TestSelectFirstRows(unittest.TestCase):
    def test_example_case(self):
        # Example DataFrame
        data = {
            "employee_id": [3, 90, 9, 60, 49, 43],
            "name": ["Bob", "Alice", "Tatiana", "Annabelle", "Jonathan", "Khaled"],
            "department": ["Operations", "Sales", "Engineering", "InformationTechnology", "HumanResources", "Administration"],
            "salary": [48675, 11096, 33805, 37678, 23793, 40454]
        }
        employees = pd.DataFrame(data)
        
        # Expected DataFrame with the first 3 rows
        expected_data = {
            "employee_id": [3, 90, 9],
            "name": ["Bob", "Alice", "Tatiana"],
            "department": ["Operations", "Sales", "Engineering"],
            "salary": [48675, 11096, 33805]
        }
        expected_output = pd.DataFrame(expected_data)
        
        pd.testing.assert_frame_equal(selectFirstRows(employees), expected_output)
    
    def test_less_than_three_rows(self):
        # DataFrame with less than 3 rows
        data = {
            "employee_id": [1, 2],
            "name": ["John", "Doe"],
            "department": ["HR", "IT"],
            "salary": [50000, 60000]
        }
        employees = pd.DataFrame(data)
        
        # Expected DataFrame (same as input since there are fewer than 3 rows)
        expected_output = employees.copy()
        
        pd.testing.assert_frame_equal(selectFirstRows(employees), expected_output)

    def test_empty_dataframe(self):
        # Empty DataFrame
        employees = pd.DataFrame(columns=["employee_id", "name", "department", "salary"])
        
        # Expected result: Empty DataFrame with same columns
        expected_output = employees.copy()
        
        pd.testing.assert_frame_equal(selectFirstRows(employees), expected_output)
    
    def test_exactly_three_rows(self):
        # DataFrame with exactly 3 rows
        data = {
            "employee_id": [10, 20, 30],
            "name": ["Eve", "Mark", "Lily"],
            "department": ["Finance", "Operations", "Engineering"],
            "salary": [70000, 65000, 72000]
        }
        employees = pd.DataFrame(data)
        
        # Expected DataFrame (same as input since there are exactly 3 rows)
        expected_output = employees.copy()
        
        pd.testing.assert_frame_equal(selectFirstRows(employees), expected_output)

if __name__ == "__main__":
    unittest.main()
