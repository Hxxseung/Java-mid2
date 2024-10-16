package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox); // 하한이 Animal
        //writeBox(catBox); // 하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }
    static void writeBox(Box<? super Animal> box) { //?가 Animal보다 높아야(상위클래스여야) 함. => dog나 cat은 들어올 수 없음.
        box.set(new Dog("멍멍이", 100));   //dog박스가 아니라 animalBox 반환임을 확인해야함.
    }
}

//하한 와일드카드의 원리는 제네릭에선 사용할 수 없음.