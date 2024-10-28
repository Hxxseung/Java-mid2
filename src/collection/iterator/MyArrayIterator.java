package collection.iterator;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;    //{1, 2, 3, 4}

    public MyArrayIterator(int[] targerArr) {   //순회하고 싶은 배열
        this.targetArr = targerArr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
