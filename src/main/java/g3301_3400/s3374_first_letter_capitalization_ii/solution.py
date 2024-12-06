# #Hard #Database #2024_12_06_Time_261_ms_(84.21%)_Space_66.3_MB_(17.89%)

import pandas as pd

def capitalize_content(user_content):
    user_content['converted_text'] = (user_content.content_text.apply(lambda x: x.title()))
    return user_content.rename(columns={'content_text': 'original_text'})
