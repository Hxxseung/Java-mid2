package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);
        
        AnimalMethod.checkup(dog);  //타입매개변수 추론으로 인해 checkup 앞에 <dog>가 생략됨.
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);    //getBigger앞에 타입매개변수 추론으로 <dog>생략됨.
        System.out.println("bigger = " + bigger);
    }
}
