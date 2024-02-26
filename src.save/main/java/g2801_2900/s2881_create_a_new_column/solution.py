# #Easy #2023_12_23_Time_437_ms_(81.98%)_Space_60.3_MB_(37.80%)

import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees["bonus"] = employees["salary"] * 2
    return employees
