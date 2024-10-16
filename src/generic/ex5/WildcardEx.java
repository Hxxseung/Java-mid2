package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //제네릭 메서드.
    //Box<Dog> dogBox를 전달한다. 타입 추론에 의해 타입 T가 Dog가 된다.
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    //이것은 제네릭 메서드가 아니다. 일반적인 메서드이다.
    //Box<Dog> dogBox를 전달한다. 와일드카드 ?는 모든 타입을 받을 수 있다. => ? == <? extends Object>라고 생각하면 편하다. / 모든 타입을 받을 수 있으므로 비제한 와일드카드라고 한다.
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){    //Animal까지만 들어올 수 있는 상한제한이다.
        Animal animal = box.get();  //반환 값을 동적으로 바꿔줄 수 없음. Animal을 받았기 떄문에 Cat이나 Dog로 반환하지 못한다.
        System.out.println("이름 = " + animal.getName());
        return animal;
    }

}

//와일드카드는 제네릭 메서드나 제네릭 타입이 아니라, 이미 만들어진 제네릭 타입(메서드)를 활용하는 것이다.