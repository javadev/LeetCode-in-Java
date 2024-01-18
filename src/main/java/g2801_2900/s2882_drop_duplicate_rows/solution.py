# #Easy #2023_12_23_Time_405_ms_(97.36%)_Space_60.2_MB_(75.25%)

import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    customers.drop_duplicates(subset='email', keep='first', inplace=True)
    return customers
