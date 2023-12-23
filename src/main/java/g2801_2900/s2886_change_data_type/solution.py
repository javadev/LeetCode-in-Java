# #Easy #2023_12_23_Time_421_ms_(94.57%)_Space_59.2_MB_(92.43%)

import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    students['grade'] = students['grade'].astype(int) 
    return students
