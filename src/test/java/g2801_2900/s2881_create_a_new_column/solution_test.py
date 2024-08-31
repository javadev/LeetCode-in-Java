import unittest
import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees["bonus"] = employees["salary"] * 2
    return employees

class TestCreateBonusColumn(unittest.TestCase):
    def test_create_bonus_column(self):
        # Example DataFrame as input
        data = {
            "name": ["Piper", "Grace", "Georgia", "Willow", "Finn", "Thomas"],
            "salary": [4548, 28150, 1103, 6593, 74576, 24433]
        }
        employees = pd.DataFrame(data)
        
        # Expected output DataFrame
        expected_data = {
            "name": ["Piper", "Grace", "Georgia", "Willow", "Finn", "Thomas"],
            "salary": [4548, 28150, 1103, 6593, 74576, 24433],
            "bonus": [9096, 56300, 2206, 13186, 149152, 48866]
        }
        expected_output = pd.DataFrame(expected_data)
        
        # Test the function
        result = createBonusColumn(employees)
        
        # Use pandas testing utilities to compare DataFrames
        pd.testing.assert_frame_equal(result, expected_output)

if __name__ == '__main__':
    unittest.main()
