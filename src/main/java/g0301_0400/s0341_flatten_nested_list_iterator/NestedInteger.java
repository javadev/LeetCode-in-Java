package g0301_0400.s0341_flatten_nested_list_iterator;

// #Medium #Top_Interview_Questions #Depth_First_Search #Tree #Stack #Design #Queue #Iterator

import java.util.ArrayList;
import java.util.List;

public class NestedInteger {
    private List<NestedInteger> list;
    private Integer integer;

    public NestedInteger(List<NestedInteger> list) {
        this.list = list;
    }

    public void add(NestedInteger nestedInteger) {
        if (this.list != null) {
            this.list.add(nestedInteger);
        } else {
            this.list = new ArrayList<>();
            this.list.add(nestedInteger);
        }
    }

    public void setInteger(int num) {
        this.integer = num;
    }

    public NestedInteger(Integer integer) {
        this.integer = integer;
    }

    public NestedInteger() {
        this.list = new ArrayList<>();
    }

    public boolean isInteger() {
        return integer != null;
    }

    public Integer getInteger() {
        return integer;
    }

    public List<NestedInteger> getList() {
        return list;
    }
}
