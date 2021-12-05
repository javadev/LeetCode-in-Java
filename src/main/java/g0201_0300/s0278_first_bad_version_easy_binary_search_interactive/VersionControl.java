package g0201_0300.s0278_first_bad_version_easy_binary_search_interactive;

/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */

public class VersionControl {
    public boolean isBadVersion(int version) {
        return version % 2 == 0;
    }
}
