package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}

// * 현재는 로 타입을 사용하지 않아야함. *