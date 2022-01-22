package g0701_0800.s0706_design_hashmap;

// #Easy #Array #Hash_Table #Design #Linked_List #Hash_Function

import java.util.ArrayList;

public class MyHashMap {

    ArrayList[] arr = null;

    public MyHashMap() {
        arr = new ArrayList[1000];
    }

    public void put(int key, int value) {
        int bucket = key % 1000;
        if (arr[bucket] == null) {
            ArrayList<Entry> list = new ArrayList<>();
            Entry e = new Entry();
            e.key = key;
            e.value = value;
            list.add(e);
            arr[bucket] = list;
        } else {
            ArrayList<Entry> list = arr[bucket];
            Entry e = new Entry();
            e.key = key;
            e.value = value;
            list.remove(e);
            list.add(e);
        }
    }

    public int get(int key) {
        int bucket = key % 1000;
        int ans = -1;
        ArrayList<Entry> list = arr[bucket];
        if (list != null) {
            for (Entry e : list) {
                if (e.key == key) {
                    ans = e.value;
                }
            }
        }
        return ans;
    }

    public void remove(int key) {
        int bucket = key % 1000;
        ArrayList<Entry> list = arr[bucket];
        Entry e = new Entry();
        e.key = key;
        if (list != null) {
            list.remove(e);
        }
    }

    static class Entry {
        int key;
        int value;

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + key;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Entry other = (Entry) obj;
            return key == other.key;
        }
    }
}
