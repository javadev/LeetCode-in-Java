package g0701_0800.s0705_design_hashset;

// #Easy #Array #Hash_Table #Design #Linked_List #Hash_Function

public class MyHashSet {

    private final boolean[] arr;

    public MyHashSet() {
        arr = new boolean[1000001];
    }

    public void add(int key) {
        arr[key] = true;
    }

    public void remove(int key) {
        arr[key] = false;
    }

    public boolean contains(int key) {
        return arr[key];
    }
}
