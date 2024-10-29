package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성 => 값을 추가하거나 set을 통해 변경이 안됨.
        List<Integer> list = List.of(1, 2, 3);

        /*
        Set<Integer> set = set.of(1,2,3);
        Map<Integer, String> map = Map.of(1,"one", 2, "two");
        //of를 써서 생성한 객체들은 불변객체들이다.
         */

        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList Class = " + mutableList.getClass());

        //불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList class = " + unmodifiableList.getClass());

        //예외 발생 java.lang.UnsupportedOperationException
        // unmodifiableList.add(5);
    }
}
