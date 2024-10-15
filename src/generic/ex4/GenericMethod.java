package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj){
        System.out.println("object print = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("object print = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){   //타입 매개변수에 대해서 상황 제한이 가능.
        System.out.println("bound print = " + t);
        return t;
    }
}
