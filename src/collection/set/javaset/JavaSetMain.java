package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());   //데이터의 순서로 출력
    }

    private static void run(Set<String> set){
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){ // 다음 데이터가 있는지 확인
            System.out.print(iterator.next() + " ");    // iterator.next() : 다음 데이터를 반환
        }
        System.out.println();
    }
}
