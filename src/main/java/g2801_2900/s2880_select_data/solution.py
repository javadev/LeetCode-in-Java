# #Easy #2023_12_23_Time_428_ms_(94.99%)_Space_60_MB_(83.82%)

import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    return students[students.student_id == 101][['name','age']]

