package generic.ex5;

public class EraserBox<T> { //실행시점에 <T>가 없어져버림

    public boolean instanceCheck(Object param){
        //retrun param instanceof T; //T -> Object로 변경
        return false;               //항상 참으로 바뀌게 되버림.
    }

    public void create(){
        //return new T(); //오류  , T -> Object로 변경
    }
}

