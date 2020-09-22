package practiceCode.nestediterator;

import java.util.List;

public class NestedIntegerImp implements NestedInteger {

    private List<NestedInteger> nestedIntegerList;
    private Integer value;

    public NestedIntegerImp(List<NestedInteger> nestedIntegerList, Integer value) {
        this.nestedIntegerList = nestedIntegerList;
        this.value = value;
    }

    @Override
    public boolean isInteger() {
        return nestedIntegerList == null && value != null;
    }

    @Override
    public Integer getInteger() {
        return value;
    }

    @Override
    public List<NestedInteger> getList() {
        return nestedIntegerList;
    }

    public List<NestedInteger> getNestedIntegerList() {
        return nestedIntegerList;
    }
}
