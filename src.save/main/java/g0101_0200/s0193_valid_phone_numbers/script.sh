# Read from the file file.txt and output all valid phone numbers to stdout.
# #Easy #Shell #2022_06_28_Time_112_ms_(75.54%)_Space_3.1_MB_(53.89%)
egrep '^[0-9]{3}-[0-9]{3}-[0-9]{4}$|^\([0-9]{3}\)\s[0-9]{3}-[0-9]{4}$' file.txt
