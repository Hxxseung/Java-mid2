package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1(){
        elementData = new Object[DEFAULT_CAPACITY]; //처음 지정한 5의 크기고 배열을 생성 , 설정을 안헀을 때 기본 생성자
    }

    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){  //값을 넣을 때 순차적으로 배열에 값을 넣어줌.
        elementData[size] = e;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index);   //기존값을 꺼내둠
        elementData[index] = element;   //새로 들어온 밸류를 배열에다 넣어줌
        return oldValue;                //기존값을 반환함.
    }

    public int indexOf(Object o){
        for(int i = 0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        //[1, 2, 3, null, null] => size = 3
        //[1, 2, 3] => size = 3 // 다음과 같이 null값은 출력하지 않고, 사이즈만큼만 출력함
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size + ", capacity=" + elementData.length;
    }
    //Arrays.copyOf => 배열에서 size 만큼만 출력을 하는 메서드

}
