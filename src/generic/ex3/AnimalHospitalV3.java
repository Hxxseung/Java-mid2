package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> { //animal의 기능을 쓸 수 있게 해줌 , generic에 범위를 animal로 제한함.

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
