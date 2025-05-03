# Read from the file file.txt and print its transposed content to stdout.
# #Medium #Shell #2025_05_03_Time_61_ms_(88.19%)_Space_4.14_MB_(38.67%)
awk '
{
    for (i = 1; i <= NF; i++) {
        if (NR == 1) {
            a[i] = $i
        } else {
            a[i] = a[i] " " $i
        }
    }
}
END {
    for (i = 1; i <= NF; i++) {
        print a[i]
    }
}' file.txt
