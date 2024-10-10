package generic.ex1;

public class GenericBox<T> {    //<>를 사용한 클래스를 제네릭 클래스라 한다. <> <<를 보통 다이아몬드라고 한다.
                                //제네릭 클래스를 사용할 때는 Integer, String 같은 타입을 미리 결정하지 않는다.
                                //T를 타입 매개변수라고 한다.
                                //제네릭의 타입인자로 기본형(int,double, ect.. )은 사용할 수 없다.

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}
