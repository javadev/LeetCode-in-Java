# #Easy #2023_12_23_Time_401_ms_(96.35%)_Space_60.2_MB_(54.27%)

import pandas as pd

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['salary'] = employees['salary'] * 2
    return employees
