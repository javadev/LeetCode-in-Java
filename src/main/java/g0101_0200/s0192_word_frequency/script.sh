# Read from the file words.txt and output the word frequency list to stdout.
# #Medium #Shell #2022_06_28_Time_143_ms_(54.55%)_Space_3.7_MB_(85.88%)
sed -e 's/ /\n/g' words.txt | sed -e '/^$/d' | sort | uniq -c | sort -r | awk '{print $2" "$1}'