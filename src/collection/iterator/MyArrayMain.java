package collection.iterator;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        System.out.println("for-each 사용");  //iterable, iterator이 구현 되어있어야 함.
        for(int value : myArray){
            System.out.println("value = " + value);
        }

    }
}
