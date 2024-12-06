import unittest
import pandas as pd

# Embed the script
def capitalize_content(user_content):
    user_content['converted_text'] = (user_content.content_text.apply(lambda x: x.title()))
    return user_content.rename(columns={'content_text': 'original_text'})

# Test suite
class TestCapitalizeContent(unittest.TestCase):

    def test_normal_case(self):
        # Input data
        data = {
            'content_id': [1, 2],
            'content_text': ['hello world', 'python programming']
        }
        df = pd.DataFrame(data)
        
        # Expected output
        expected_data = {
            'content_id': [1, 2],
            'original_text': ['hello world', 'python programming'],
            'converted_text': ['Hello World', 'Python Programming']
        }
        expected_df = pd.DataFrame(expected_data)
        
        # Test
        result = capitalize_content(df)
        pd.testing.assert_frame_equal(result, expected_df)
    
    def test_hyphenated_words(self):
        # Input data
        data = {
            'content_id': [1],
            'content_text': ['well-known fact']
        }
        df = pd.DataFrame(data)
        
        # Expected output
        expected_data = {
            'content_id': [1],
            'original_text': ['well-known fact'],
            'converted_text': ['Well-Known Fact']
        }
        expected_df = pd.DataFrame(expected_data)
        
        # Test
        result = capitalize_content(df)
        pd.testing.assert_frame_equal(result, expected_df)

    def test_mixed_case(self):
        # Input data
        data = {
            'content_id': [1],
            'content_text': ['QUICK-brown FOX']
        }
        df = pd.DataFrame(data)
        
        # Expected output
        expected_data = {
            'content_id': [1],
            'original_text': ['QUICK-brown FOX'],
            'converted_text': ['Quick-Brown Fox']
        }
        expected_df = pd.DataFrame(expected_data)
        
        # Test
        result = capitalize_content(df)
        pd.testing.assert_frame_equal(result, expected_df)

    def test_empty_input(self):
        # Input data
        df = pd.DataFrame(columns=['content_id', 'content_text'])
        
        # Expected output
        expected_df = pd.DataFrame(columns=['content_id', 'original_text', 'converted_text'])
        
        # Test
        result = capitalize_content(df)
        pd.testing.assert_frame_equal(result, expected_df)
    
    def test_special_characters(self):
        # Input data
        data = {
            'content_id': [1],
            'content_text': ['C++ Programming']
        }
        df = pd.DataFrame(data)
        
        # Expected output
        expected_data = {
            'content_id': [1],
            'original_text': ['C++ Programming'],
            'converted_text': ['C++ Programming']
        }
        expected_df = pd.DataFrame(expected_data)
        
        # Test
        result = capitalize_content(df)
        pd.testing.assert_frame_equal(result, expected_df)

if __name__ == '__main__':
    unittest.main()
