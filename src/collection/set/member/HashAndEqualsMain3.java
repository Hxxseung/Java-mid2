package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.hashCode(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

        System.out.println("Aa.hashCode() = " + "Aa".hashCode());   //Aa와 BB의 hashCode가 동일한 값(인덱스)을 갖는다.
        System.out.println("BB.hashCode() = " + "BB".hashCode());   //equals()를 사용해서 다시 비교하기 때문에 hashCode가 충돌하더라도 문제가 되지 않는다.
    }
}


