import unittest
import pandas as pd
from typing import List

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return [players.shape[0], players.shape[1]]

class TestGetDataframeSize(unittest.TestCase):
    def test_example_case(self):
        # Example DataFrame
        data = {
            "player_id": [846, 749, 155, 583, 388, 883, 355, 247, 761, 642],
            "name": ["Mason", "Riley", "Bob", "Isabella", "Zachary", "Ava", "Violet", "Thomas", "Jack", "Charlie"],
            "age": [21, 30, 28, 32, 24, 23, 18, 27, 33, 36],
            "position": ["Forward", "Winger", "Striker", "Goalkeeper", "Midfielder", "Defender", "Striker", "Striker", "Midfielder", "Center-back"],
            "team": ["RealMadrid", "Barcelona", "ManchesterUnited", "Liverpool", "BayernMunich", "Chelsea", "Juventus", "ParisSaint-Germain", "ManchesterCity", "Arsenal"]
        }
        players = pd.DataFrame(data)
        
        # Expected result: 10 rows, 5 columns
        expected_output = [10, 5]
        self.assertEqual(getDataframeSize(players), expected_output)
    
    def test_empty_dataframe(self):
        # Empty DataFrame
        players = pd.DataFrame(columns=["player_id", "name", "age", "position", "team"])
        
        # Expected result: 0 rows, 5 columns
        expected_output = [0, 5]
        self.assertEqual(getDataframeSize(players), expected_output)

    def test_single_row(self):
        # DataFrame with a single row
        data = {
            "player_id": [1],
            "name": ["John"],
            "age": [25],
            "position": ["Forward"],
            "team": ["TestTeam"]
        }
        players = pd.DataFrame(data)
        
        # Expected result: 1 row, 5 columns
        expected_output = [1, 5]
        self.assertEqual(getDataframeSize(players), expected_output)
    
    def test_different_columns(self):
        # DataFrame with more columns
        data = {
            "player_id": [1, 2],
            "name": ["John", "Doe"],
            "age": [25, 30],
            "position": ["Forward", "Midfielder"],
            "team": ["TestTeam", "AnotherTeam"],
            "goals": [15, 20]
        }
        players = pd.DataFrame(data)
        
        # Expected result: 2 rows, 6 columns
        expected_output = [2, 6]
        self.assertEqual(getDataframeSize(players), expected_output)

if __name__ == "__main__":
    unittest.main()
