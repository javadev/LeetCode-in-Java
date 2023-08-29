package g1001_1100.s1095_find_in_mountain_array;

class MountainArrayImpl implements MountainArray {
    private int[] ints;

    public MountainArrayImpl(int[] ints) {
        this.ints = ints;
    }

    @Override
    public int get(int index) {
        return ints[index];
    }

    @Override
    public int length() {
        return ints.length;
    }
}
