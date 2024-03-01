# #Easy #2023_12_23_Time_404_ms_(97.11%)_Space_59.7_MB_(74.95%)

import pandas as pd

def fillMissingValues(products: pd.DataFrame) -> pd.DataFrame:
    products['quantity'].fillna(0, inplace=True)
    return products
