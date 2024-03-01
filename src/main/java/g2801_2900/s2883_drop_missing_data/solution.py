# #Easy #2023_12_23_Time_429_ms_(94.97%)_Space_61.2_MB_(12.30%)

import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
   r = pd.DataFrame(students)
   r.dropna(subset='name', inplace=True)
   return r
