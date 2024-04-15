# #Easy #2023_12_22_Time_406_ms_(82.57%)_Space_59.2_MB_(81.15%)

import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    column_name = ['student_id','age']
    result = pd.DataFrame(student_data, columns=column_name)
    return result
