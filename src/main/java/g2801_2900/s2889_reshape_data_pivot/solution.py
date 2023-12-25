# #Easy #2023_12_25_Time_416_ms_(99.87%)_Space_61.8_MB_(21.28%)

import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    return weather.pivot(index='month', columns='city', values='temperature')
