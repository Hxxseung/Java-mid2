package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> box = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildcardEx.printGenericV1(dogBox); //printGenericV1 앞에 <Dog>생략 <- dogBox안에 Dog로 되어있기 때문.
        WildcardEx.printWildcardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildcardV2(dogBox);

        WildcardEx.printAndReturnGeneric(dogBox);
        WildcardEx.printAndReturnWildcard(dogBox);
    }
}
