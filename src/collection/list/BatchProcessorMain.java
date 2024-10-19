package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(); //1399ms
        //MyLinkedList<Integer> list = new MyLinkedList<>();  //5ms

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}


//다형성을 극대화 하는법 => 구체적인 것이 아니라 추상적인 것을 의존하도록 해야함.
//추상적인 것을 의존하면 => 클라이언트 코드를 수정하는 것이 아니라 프로그램을 실행하는 런타임에서 수정할 수 있도록 해야함.