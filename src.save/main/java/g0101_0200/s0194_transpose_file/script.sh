# Read from the file file.txt and print its transposed content to stdout.
# #Medium #Shell #2022_03_04_Time_0_ms_(100.00%)_Space_3.9_MB_(32.21%)
wordcount=$(head -1 file.txt | wc -w)
col_n=1
while [[ $col_n -le $wordcount ]]; do
	awk "{ print \$$col_n }" file.txt | paste -sd " "
	col_n=$((col_n + 1))
done