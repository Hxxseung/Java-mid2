package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>(); //1399ms
        //MyLinkedList<Integer> list = new MyLinkedList<>();  //5ms

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
