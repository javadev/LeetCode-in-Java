package g0701_0800.s0705_design_hashset;

// #Easy #Array #Hash_Table #Design #Linked_List #Hash_Function
// #2022_03_23_Time_29_ms_(57.06%)_Space_85_MB_(12.64%)

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

/*
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
