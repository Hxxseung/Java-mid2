package collection.iterator;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(list.iterator());
        printAll(set.iterator());

        foreach(list);
        foreach(set);
    }
    private static void printAll(Iterator<Integer> iterator) { //Iterator만 있으면 list든 set이든 순회 가능 => 범용성 증가
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {   //Iterable을 받아서 list와 set모두 메서드를 사용할 수 있도록 함
        System.out.println("iterable = " + iterable.getClass());
        for(Integer i : iterable){
            System.out.println(i);
        }
    }
}
