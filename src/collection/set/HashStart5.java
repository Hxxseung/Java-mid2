package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1, 2, 5, 8, 14, 99, 9}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];   //충돌 할 확률이 적어서 이 예제에선 LinkedList를 사용했음.
        for(int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        Integer[] inputArray = new Integer[CAPACITY];
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9); //중복
        System.out.println("buckets = " + Arrays.toString(buckets));


        //검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int
            searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        return bucket.contains(searchValue); // O(n) , 중복체크
    }
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
