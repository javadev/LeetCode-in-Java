# #Easy #2023_12_22_Time_413_ms_(94.68%)_Space_59.9_MB_(74.79%)

import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return[players.shape[0],players.shape[1]]
