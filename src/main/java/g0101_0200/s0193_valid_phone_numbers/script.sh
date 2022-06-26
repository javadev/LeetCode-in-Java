# Read from the file file.txt and output all valid phone numbers to stdout.
# #Easy #Shell #2022_03_04_Time_129_ms_(42.86%)_Space_3.2_MB_(53.31%)
egrep '^[0-9]{3}-[0-9]{3}-[0-9]{4}$|^\([0-9]{3}\)\s[0-9]{3}-[0-9]{4}$' file.txt