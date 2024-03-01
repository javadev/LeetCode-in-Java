# #Easy #2023_12_23_Time_467_ms_(68.13%)_Space_60.7_MB_(15.08%)

import pandas as pd

def renameColumns(students: pd.DataFrame) -> pd.DataFrame:
    students.rename(columns={'id': 'student_id', 'first': 'first_name', 'last': 'last_name', 'age': 'age_in_years'}, inplace=True)
    return students
