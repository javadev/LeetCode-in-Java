import unittest
import pandas as pd
from pandas.testing import assert_frame_equal

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    animal_data = {}
    for index in animals.index:
        animal = animals.iloc[index]
        if animal['weight'] > 100:
            animal_data[animal['name']] = animal['weight']

    animal_data = dict(sorted(animal_data.items() , key = lambda x : x[1] , reverse = True))
    result = pd.DataFrame(animal_data.keys() , columns = ['name'])
    return result

class TestFindHeavyAnimals(unittest.TestCase):
    def test_find_heavy_animals(self):
        # Input DataFrame
        animals_data = {
            "name": ["Tatiana", "Khaled", "Alex", "Jonathan", "Stefan", "Tommy"],
            "species": ["Snake", "Giraffe", "Leopard", "Monkey", "Bear", "Panda"],
            "age": [98, 50, 6, 45, 100, 26],
            "weight": [464, 41, 328, 463, 50, 349]
        }
        animals = pd.DataFrame(animals_data)

        # Expected Output DataFrame
        expected_data = {
            "name": ["Tatiana", "Jonathan", "Tommy", "Alex"]
        }
        expected_df = pd.DataFrame(expected_data)

        # Actual Output
        result_df = findHeavyAnimals(animals)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal: {e}")

    def test_no_heavy_animals(self):
        # Input DataFrame with no animals weighing more than 100
        animals_data = {
            "name": ["Khaled", "Stefan"],
            "species": ["Giraffe", "Bear"],
            "age": [50, 100],
            "weight": [41, 50]
        }
        animals = pd.DataFrame(animals_data)

        # Expected Output: Empty DataFrame
        expected_df = pd.DataFrame(columns=["name"])

        # Actual Output
        result_df = findHeavyAnimals(animals)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for no heavy animals: {e}")

    def test_single_heavy_animal(self):
        # Input DataFrame with one animal weighing more than 100
        animals_data = {
            "name": ["Khaled", "Stefan", "Tatiana"],
            "species": ["Giraffe", "Bear", "Snake"],
            "age": [50, 100, 98],
            "weight": [41, 50, 464]
        }
        animals = pd.DataFrame(animals_data)

        # Expected Output DataFrame
        expected_data = {
            "name": ["Tatiana"]
        }
        expected_df = pd.DataFrame(expected_data)

        # Actual Output
        result_df = findHeavyAnimals(animals)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for single heavy animal: {e}")

    def test_empty_dataframe(self):
        # Test with an empty DataFrame
        animals = pd.DataFrame(columns=["name", "species", "age", "weight"])
        expected_df = pd.DataFrame(columns=["name"])

        # Actual Output
        result_df = findHeavyAnimals(animals)

        # Assert DataFrames are equal
        try:
            assert_frame_equal(result_df, expected_df)
        except AssertionError as e:
            self.fail(f"DataFrames are not equal for empty input: {e}")

# Run the tests
if __name__ == "__main__":
    unittest.main()
