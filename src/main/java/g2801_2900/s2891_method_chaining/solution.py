# #Easy #2023_12_25_Time_412_ms_(99.23%)_Space_60.8_MB_(50.69%)

import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
	animal_data = {}
	for index in animals.index:
		animal = animals.iloc[index]
		if animal['weight'] > 100:
			animal_data[animal['name']] = animal['weight']

	animal_data = dict(sorted(animal_data.items() , key = lambda x : x[1] , reverse = True))
	result = pd.DataFrame(animal_data.keys() , columns = ['name'])
	return result