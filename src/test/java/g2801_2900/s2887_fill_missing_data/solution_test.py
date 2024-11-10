import pandas as pd
import unittest

# The updated function to be tested
def fillMissingValues(products: pd.DataFrame) -> pd.DataFrame:
    products['quantity'].fillna(0, inplace=True)
    products['quantity'] = products['quantity'].astype(int)  # Ensure the quantity is of type int
    return products

# Test class
class TestFillMissingValues(unittest.TestCase):

    def test_fill_missing_values_basic_case(self):
        # Input DataFrame with missing values in quantity
        products = pd.DataFrame({
            'name': ['Wristwatch', 'WirelessEarbuds', 'GolfClubs', 'Printer'],
            'quantity': [None, None, 779, 849],
            'price': [135, 821, 9319, 3051]
        })
        
        # Expected output DataFrame
        expected_output = pd.DataFrame({
            'name': ['Wristwatch', 'WirelessEarbuds', 'GolfClubs', 'Printer'],
            'quantity': [0, 0, 779, 849],
            'price': [135, 821, 9319, 3051]
        })
        
        # Call the function and assert equality
        result = fillMissingValues(products)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_fill_missing_values_no_missing(self):
        # Input DataFrame with no missing values
        products = pd.DataFrame({
            'name': ['Laptop', 'Mouse', 'Keyboard'],
            'quantity': [10, 5, 0],
            'price': [1000, 50, 30]
        })
        
        # Expected output should be the same as input
        expected_output = products.copy()
        
        # Call the function and assert equality
        result = fillMissingValues(products)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_fill_missing_values_empty_dataframe(self):
        # Input: Empty DataFrame
        products = pd.DataFrame(columns=['name', 'quantity', 'price'])
        
        # Expected output: Empty DataFrame with specified dtypes
        expected_output = pd.DataFrame(columns=['name', 'quantity', 'price'], dtype='object')
        expected_output['quantity'] = expected_output['quantity'].astype('int64')
    
        # Call the function and assert equality
        result = fillMissingValues(products)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_fill_missing_values_empty_dataframe(self):
        # Input: Empty DataFrame
        products = pd.DataFrame(columns=['name', 'quantity', 'price'])
        
        # Expected output: Empty DataFrame
        expected_output = pd.DataFrame(columns=['name', 'quantity', 'price'])
        expected_output['quantity'] = expected_output['quantity'].astype('int64')
        
        # Call the function and assert equality
        result = fillMissingValues(products)
        pd.testing.assert_frame_equal(result, expected_output)

    def test_fill_missing_values_all_none(self):
        # Input DataFrame with all None in quantity
        products = pd.DataFrame({
            'name': ['Item1', 'Item2', 'Item3'],
            'quantity': [None, None, None],
            'price': [100, 200, 300]
        })
        
        # Expected output DataFrame with quantity filled with 0
        expected_output = pd.DataFrame({
            'name': ['Item1', 'Item2', 'Item3'],
            'quantity': [0, 0, 0],
            'price': [100, 200, 300]
        })
        
        # Call the function and assert equality
        result = fillMissingValues(products)
        pd.testing.assert_frame_equal(result, expected_output)

# Run the tests
if __name__ == '__main__':
    unittest.main()
