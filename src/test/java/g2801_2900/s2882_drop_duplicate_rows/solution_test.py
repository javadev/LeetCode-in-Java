import unittest
import pandas as pd
from pandas.testing import assert_frame_equal

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    customers.drop_duplicates(subset='email', keep='first', inplace=True)
    return customers

class TestDropDuplicateEmails(unittest.TestCase):

    def test_no_duplicates(self):
        data = {
            'customer_id': [1, 2, 3],
            'name': ['Ella', 'David', 'Zachary'],
            'email': ['emily@example.com', 'michael@example.com', 'sarah@example.com']
        }
        customers = pd.DataFrame(data)
        expected = pd.DataFrame(data)

        result = dropDuplicateEmails(customers).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

    def test_with_duplicates(self):
        data = {
            'customer_id': [1, 2, 3, 4, 5, 6],
            'name': ['Ella', 'David', 'Zachary', 'Alice', 'Finn', 'Violet'],
            'email': [
                'emily@example.com', 'michael@example.com', 'sarah@example.com',
                'john@example.com', 'john@example.com', 'alice@example.com'
            ]
        }
        customers = pd.DataFrame(data)

        expected_data = {
            'customer_id': [1, 2, 3, 4, 6],
            'name': ['Ella', 'David', 'Zachary', 'Alice', 'Violet'],
            'email': ['emily@example.com', 'michael@example.com', 'sarah@example.com', 'john@example.com', 'alice@example.com']
        }
        expected = pd.DataFrame(expected_data)

        result = dropDuplicateEmails(customers).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

    def test_empty_dataframe(self):
        customers = pd.DataFrame(columns=['customer_id', 'name', 'email'])
        expected = customers.copy()

        result = dropDuplicateEmails(customers).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

    def test_single_row(self):
        data = {
            'customer_id': [1],
            'name': ['Ella'],
            'email': ['emily@example.com']
        }
        customers = pd.DataFrame(data)
        expected = pd.DataFrame(data)

        result = dropDuplicateEmails(customers).reset_index(drop=True)
        expected = expected.reset_index(drop=True)

        assert_frame_equal(result, expected)

if __name__ == '__main__':
    unittest.main()
