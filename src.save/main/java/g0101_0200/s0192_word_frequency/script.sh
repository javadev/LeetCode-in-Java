# Read from the file words.txt and output the word frequency list to stdout.
# #Medium #Shell #2022_03_04_Time_152_ms_(38.56%)_Space_3.8_MB_(85.55%)
sed -e 's/ /\n/g' words.txt | sed -e '/^$/d' | sort | uniq -c | sort -r | awk '{print $2" "$1}'