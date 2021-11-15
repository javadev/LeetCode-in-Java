# Read from the file words.txt and output the word frequency list to stdout.
sed -e 's/ /\n/g' words.txt | sed -e '/^$/d' | sort | uniq -c | sort -r | awk '{print $2" "$1}'