package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences;

import java.util.Set;

class State {
    int i;
    int j;
    int cnt;
    int mask;
    char[] chars;
    Set<State> visited;

    //"Change bidirectional association to unidirectional association" refactoring technique
    public State(int i, int j, int cnt, int mask, char[] chars, Set<State> visited) {
        this.i = i;
        this.j = j;
        this.cnt = cnt;
        this.mask = mask;
        this.chars = chars;
        this.visited = visited;
    }
}
