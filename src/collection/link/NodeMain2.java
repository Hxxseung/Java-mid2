package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        //노드 생성하고 연결하기: A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);

        //Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}
        //Node안에 toString이 있기 때문에 next에 Node{다음item, next}가 생김


        Node nodeB = first.next;
        System.out.println("nodeB = " + nodeB); //nodeB = [B->C] , B부터 연결된 노드를 출력해줌
    }
}
