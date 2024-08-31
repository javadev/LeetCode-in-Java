import unittest
import pandas as pd
from typing import List

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    column_name = ['student_id','age']
    result = pd.DataFrame(student_data, columns=column_name)
    return result

class TestCreateDataframe(unittest.TestCase):
    
    def test_valid_data(self):
        student_data = [[1, 15], [2, 11], [3, 11], [4, 20]]
        expected_df = pd.DataFrame({
            'student_id': [1, 2, 3, 4],
            'age': [15, 11, 11, 20]
        })
        result_df = createDataframe(student_data)
        pd.testing.assert_frame_equal(result_df, expected_df)
    
    def test_empty_data(self):
        student_data = []
        expected_df = pd.DataFrame(columns=['student_id', 'age'])
        result_df = createDataframe(student_data)
        pd.testing.assert_frame_equal(result_df, expected_df)
    
    def test_single_row(self):
        student_data = [[5, 18]]
        expected_df = pd.DataFrame({
            'student_id': [5],
            'age': [18]
        })
        result_df = createDataframe(student_data)
        pd.testing.assert_frame_equal(result_df, expected_df)
    
    def test_negative_age(self):
        student_data = [[6, -10]]
        expected_df = pd.DataFrame({
            'student_id': [6],
            'age': [-10]
        })
        result_df = createDataframe(student_data)
        pd.testing.assert_frame_equal(result_df, expected_df)

if __name__ == '__main__':
    unittest.main()
