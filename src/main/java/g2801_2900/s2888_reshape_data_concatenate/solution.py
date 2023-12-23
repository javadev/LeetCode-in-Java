# #Easy #2023_12_23_Time_441_ms_(96.26%)_Space_59_MB_(97.37%)

import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    return pd.concat([df1, df2], ignore_index=True)
