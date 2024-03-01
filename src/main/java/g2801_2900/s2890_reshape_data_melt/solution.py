# #Easy #2023_12_25_Time_446_ms_(97.89%)_Space_60.5_MB_(68.02%)

import pandas as pd

def meltTable(report: pd.DataFrame) -> pd.DataFrame:
    return report.melt(id_vars='product', var_name='quarter', value_name='sales')
